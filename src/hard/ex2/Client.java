package hard.ex2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int i;
    private int id;
    private List<Account> accounts;
    private String name;

    public Client(String name) {
        i += 1;
        this.id = i;
        this.name = name;
    }

    public void addAccount(Account account){
        if (account.occupied()) {
            if (accounts == null) {
                accounts = new ArrayList<>();
            }
            if (!accounts.contains(account)) {
                accounts.add(account);
                account.addClient(this);
            }
        }else {
            System.out.println("Счет уже используется");
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

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
