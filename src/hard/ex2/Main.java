package hard.ex2;

public class Main {
    public static void main(String[] args) {
        Client mark = new Client("Mark");
        Client august = new Client("August");
        Account account1 = new Account("3010203020102030");
        Account account2 = new Account("5342123142131242");
        Account account3 = new Account("2334212314213123");
        Account account4 = new Account("4242123142131232");
        Posting fromMarkToAugust1 = new Posting(account1, account2, 10000000, "15.07.2023");
        Posting fromMarkToAugust2 = new Posting(account3, account2, 50000, "15.08.2023");
        Posting fromAugustToMark1 = new Posting(account4, account1, 4000000, "19.07.2023");
        Posting fromAugustToMark2 = new Posting(account4, account1, 500000, "19.07.2023");
        mark.addAccount(account1);
        mark.addAccount(account3);
        august.addAccount(account2);
        august.addAccount(account4);

        System.out.println("Необходимо разработать метод, который получал на вход Код Клиента, " +
                "дату и возвращал бы сумму операций зачисления по всем своим счетам за указанную дату\n");
        Methods.findByIdAndDate(1, "19.07.2023");

        System.out.println("\nНеобходимо разработать метод, который бы возвращал выписку по счету\n");
        Methods.accountStatement("3010203020102030");
    }
}
