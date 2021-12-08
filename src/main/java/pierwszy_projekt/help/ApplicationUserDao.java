package pierwszy_projekt.help;

import java.util.ArrayList;
import java.util.List;

public class ApplicationUserDao {

    private List<ApplicationUser> applicationUsers;

    //predefiiowanie startowego stanu 'bazy'
    public ApplicationUserDao() {
        this.applicationUsers = new ArrayList<>();
        this.applicationUsers.add(new ApplicationUser("admin", "admin", "Administrator", 25));
        this.applicationUsers.add(new ApplicationUser("adam1234", "admin", "Adam", 15));
        this.applicationUsers.add(new ApplicationUser("pawel12", "admin", "Pawel1", 21));
    }

    //zapis do 'bazy'
    public void addApplicationUser(ApplicationUser applicationUser) {
        this.applicationUsers.add(applicationUser);
    }

    //pobieranie danych z 'bazy'
    public List<ApplicationUser> getApplicationUsers() {
        return applicationUsers;
    }
}
