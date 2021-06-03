package hard.ex1;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    private static List<User> users = new ArrayList<>();

    public static void setUsers(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }

    public static boolean findUserAndCredential(int userId, int credentialId) {
        for (User user : users) {
            if (user.getId() == userId) {
                for (Role role : user.getRoles()) {
                    for (Credentials credential : role.getCredentials()) {
                        if (credential.getId() == credentialId) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String findAllUserCredentials(int userId) {
        String result = new String();
        List<String> credentialNames = new ArrayList<>();
        for (User user : users) {
            if (user.getId() == userId) {
                result += "Полномочия пользователя \"" + user.getName() + "\":\n";
                if (user.getRoles() != null) {
                    for (Role role : user.getRoles()) {
                        for (Credentials credential : role.getCredentials()) {
                            if (!credentialNames.contains(credential.getName())) {
                                credentialNames.add(credential.getName());
                            }
                        }
                    }
                }else {
                    result += "нет полномочий";
                }
            }
        }
        result += String.join("\t|\t", credentialNames);
        return result;
    }
}
