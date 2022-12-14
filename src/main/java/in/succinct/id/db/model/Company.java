package in.succinct.id.db.model;

import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.ui.HIDDEN;
import com.venky.swf.db.annotations.column.ui.PROTECTION;
import com.venky.swf.plugins.payments.db.model.Application;

import java.util.List;

public interface Company extends com.venky.swf.plugins.collab.db.model.participants.admin.Company {
    @IS_VIRTUAL
    @HIDDEN
    public Long getAdminId();
    public void setAdminId(Long id);
    public User getAdmin();

    @PROTECTION
    public String getCompanyGstIn();
    public void setCompanyGstIn(String companyGstIn);

    @PROTECTION
    public String getCompanyRegistrationNumber();
    public void setCompanyRegistrationNumber(String companyRegistrationNumber);

    public List<UserEmail> getUserEmails();
    public List<CompanyAdministrator> getCompanyAdministrators();
    public List<Application> getApplications();
}
