package hard.ex1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int i;
    private int id;
    private String name;
    private List<Role> roles;

    public User(String name) {
        i += 1;
        this.id = i;
        this.name = name;
        Methods.setUsers(this);
    }



    public void addRole(Role role) {
        if (role.occupied()) {
            if (roles == null) {
                roles = new ArrayList<>();
            }
            if (!roles.contains(role)) {
                roles.add(role);
                role.addUser(this);
            }
        } else {
            System.out.println("Роль \"" + role + "\" занята");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
