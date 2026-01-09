package Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }
}
