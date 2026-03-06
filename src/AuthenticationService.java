import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // Constructor to initialize the users list with the default user
    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
        this.users.add(new User("test", "test"));
    }

    // Adds a new user if the username is not already taken
    @Override
    public User signUp(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null;
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // Returns the matching user if username and password are correct
    @Override
    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }
}