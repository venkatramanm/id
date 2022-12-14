package in.succinct.id.db.model;

import com.venky.swf.db.annotations.column.COLUMN_DEF;
import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.column.defaulting.StandardDefault;
import com.venky.swf.db.model.Model;
import com.venky.swf.db.model.application.Application;

public interface Grant extends Model {
    public Long getApplicationId();
    public void setApplicationId(Long id);
    public Application getApplication();

    public Long getUserId();
    public void setUserId(Long id);
    public User getUser();

    @UNIQUE_KEY("AT")
    public String getAccessToken();
    public void setAccessToken(String accessToken);

    @IS_VIRTUAL
    public String getTokenType();

    @UNIQUE_KEY("RT")
    public String getRefreshToken();
    public void setRefreshToken(String refreshToken);


    @COLUMN_DEF(StandardDefault.ZERO)
    public long getAccessTokenExpiry();
    public void setAccessTokenExpiry(long accessTokenExpiry);

}
