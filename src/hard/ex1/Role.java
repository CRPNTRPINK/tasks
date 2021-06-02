package hard.ex1;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private static int i;
    private int id;
    private String name;
    private User user;
    private List<Credentials> credentials;

    public Role(String name) {
        i += 1;
        this.id = i;
        this.name = name;
    }


    public void addCredentials(Credentials credential){
        if (credentials == null){
            credentials = new ArrayList<>();
        }

        if (!credentials.contains(credential)){
            credentials.add(credential);
            credential.addRole(this);
        }
    }

    public void removeCredential(Credentials credential){ // удаление связи с полномочием
        if (credentials != null) {
            if (credentials.contains(credential)){
                credentials.remove(credential);
                credential.getRoles().remove(this);
                System.out.println("Роль \"" + this.getName() + "\" и полномочие \"" + credential.getName() + "\" больше " +
                        "не связаны");
            } else {
                System.out.println("полномочие \"" + credential.getName() + "\" не содержит роль \"" +
                        this.getName() + "\"");
            }
        } else {
            System.out.println(this.getName() + " не имеет связей");
        }
    }

    public void addUser(User user) {
        this.user = user;
    }

    public boolean occupied() {

        if (user == null) {
            return true;
        }
        return false;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Credentials> getCredentials() {
        return credentials;
    }


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
