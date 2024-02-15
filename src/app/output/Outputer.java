package app.output;

import app.user.User;

import java.util.List;

public class Outputer {
    public void getAllUsers(List<User> users) {
        int count = 0;
        for(User user : users) {
            count++;
            System.out.println(count + ") " + user);
        }
    }

    public void getUserByIndex(List <User> users, int index) {
        System.out.println(users.get(index - 1));
    }

    public void getUserByName(List <User> users, String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                System.out.println("Match: " + user);
                return;
            }
        }
        System.out.println("Sorry, no matches for your input");
    }

    public void getUserByEmail(List <User> users, String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                System.out.println("Match: " + user);
                return;
            }
        }
        System.out.println("Sorry, no matches for your input");
    }
}
