package hard.ex2;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    private static List<Posting> postings = new ArrayList<>();

    public static List<Posting> getPostings() {
        return postings;
    }

    public static void setPostings(Posting posting) {
        postings.add(posting);
    }

    public static void findByIdAndDate(int id, String date) {
        List<String> clientName = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        for (Posting posting : postings) {
            if (posting.getCreditingAccount().getClient().getId() == id) {
                if (posting.getDate().equals(date)) {
                    if (!clientName.contains(posting.getCreditingAccount().getClient().getName())) {
                        clientName.add(posting.getCreditingAccount().getClient().getName());
                    }
                    operations.add(posting.getSum() + "\t\t" + date);
                    sum.add(posting.getSum());
                }
            }
        }

        System.out.println("Клиент \t сумма \t\t дата");
        for (String operation : operations) {
            System.out.println(clientName.get(0) + "\t" + operation);
        }
        System.out.println("Общая сумма: " + sum.stream().mapToDouble(a -> a).sum());
    }

    public static void accountStatement(String account) {
        List<String> operations = new ArrayList<>();
        for (Posting posting : postings) {
            if (posting.getDebitingAccount().getBankAccount().equals(account)) {
                operations.add(posting.getDate() + "\t\t" + "списание" + "\t\t" +
                        posting.getCreditingAccount().getBankAccount() + "\t\t" + posting.getSum());
            }
            if (posting.getCreditingAccount().getBankAccount().equals(account)){
                operations.add(posting.getDate() + "\t\t" + "зачисление" + "\t\t" +
                        posting.getDebitingAccount().getBankAccount() + "\t\t" + posting.getSum());
            }
        }

        System.out.println("Дата \t\t    Тип операции \tКорреспондирующий счет \tСумма операции");
        for (String operation: operations){
            System.out.println(operation);
        }
    }
}
