package hard.ex2;

public class Account {
    private static int i;
    private int id;
    private String bankAccount;
    private Client client;

    public Account(String bankAccount) {
        i += 1;
        this.id = i;
        this.bankAccount = bankAccount;
    }

    public void addClient(Client client){
        if (this.client == null){
            this.client = client;
        } else {
            System.out.println("Счет принадлежит другому клиенту");
        }
    }

    public boolean occupied() {

        if (client == null) {
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

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }
}
