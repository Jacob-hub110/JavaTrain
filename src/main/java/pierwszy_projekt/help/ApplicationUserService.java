package pierwszy_projekt.help;

import java.util.List;
import java.util.stream.Collectors;

public class ApplicationUserService {

    private ApplicationUserDao applicationUserDao;

    public ApplicationUserService() {
        this.applicationUserDao = new ApplicationUserDao();
    }

    public List<ApplicationUser> getAllAdultUsers() {
        return this.applicationUserDao.getApplicationUsers().stream()
                .filter(user -> user.getAge() >= 18)
                .collect(Collectors.toList());
    }

}
