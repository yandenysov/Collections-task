package app.dataprovider;
import app.user.User;

import java.util.Arrays;
import java.util.List;

public class DataProvider {

    public List<User> getAllUsersData() {
        return Arrays.asList(
                new User("John Smith", "jsmith@somemail.com"),
                new User("Alice Roberts", "alicealice@somemail.com"),
                new User("Bob Johnson", "bigbobjohnson@somemail.com"),
                new User("Vito Corleone", "theboss@somemail.com"),
                new User("Lisa Simpson", "definitelynotcaramba@somemail.com"));
    }

}
