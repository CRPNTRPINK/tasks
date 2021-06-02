package hard.ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Posting {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
    private String date;
    private Account debitingAccount;
    private Account creditingAccount;
    private int sum;

    public Posting(Account debitingAccount, Account creditingAccount, int sum, String date) {
        this.debitingAccount = debitingAccount;
        this.creditingAccount = creditingAccount;
        this.sum = sum;
        this.date = LocalDate.parse(date, formatter).format(formatter);
        Methods.setPostings(this);
    }

    public Account getDebitingAccount() {
        return debitingAccount;
    }

    public void setDebitingAccount(Account debitingAccount) {
        this.debitingAccount = debitingAccount;
    }

    public Account getCreditingAccount() {
        return creditingAccount;
    }

    public void setCreditingAccount(Account creditingAccount) {
        this.creditingAccount = creditingAccount;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Posting{" +
                "date='" + date + '\'' +
                ", debitingAccount=" + debitingAccount.getBankAccount() +
                ", creditingAccount=" + creditingAccount.getBankAccount() +
                ", sum=" + sum +
                '}';
    }
}
