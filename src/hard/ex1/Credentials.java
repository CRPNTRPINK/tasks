package hard.ex1;

import java.util.ArrayList;
import java.util.List;

public class Credentials {
    private static int i;
    private int id;
    private String name;
    private List<Role> roles;

    public Credentials(String name) {
        i += 1;
        this.id = i;
        this.name = name;
    }


    public void addRole(Role role){
        if (roles == null){
            roles = new ArrayList<>();
        }

        if (!roles.contains(role)){
            roles.add(role);
            role.addCredentials(this);
        }

    }

    public void removeRole(Role role){ // удаление связи с ролью
        if (roles != null) {
            if (roles.contains(role)){
                roles.remove(role);
                role.getCredentials().remove(this);
                System.out.println("Роль \"" + role.getName() + "\" и полномочие \"" + this.getName() + "\" больше " +
                        "не связаны");
            } else {
                System.out.println("полномочие \"" + this.getName() + "\" не содержит роль \"" +
                        role.getName() + "\"");
            }
        } else {
            System.out.println("\"" + this.getName() + "\" не имеет связей");
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

    @Override
    public String toString() {
        return "Credentials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
