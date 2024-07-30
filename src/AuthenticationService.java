import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }

    public User signUp(String username, String password) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) {
                return null;
            }
        }
        User newuser = new User(username, password);
        users.add(newuser);
        return newuser;
    }


    public User logIn(String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getUsername(), username) && Objects.equals(users.get(i).getPassword(), password)) {
                return users.get(i);
            }
        }
        return null;
    }
}
