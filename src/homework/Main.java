package homework;

import homework.util.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        User user2 = new User("Ivan");
        user.report();
        user2.report();
        UserSaver.save(user);
        UserSaver.save(user2);
    }
}