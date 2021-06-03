package hard.ex1;

public class Main {

    public static void main(String[] args) {
        // пользователи
        User user1 = new User("Mark");
        User user2 = new User("August");
        User user3 = new User("Cloud");

        // роли
        Role role1 = new Role("ADMIN");
        Role role2 = new Role("MOD");
        Role role3 = new Role("USER");

        // полномочия
        Credentials credential1 = new Credentials("Создавать записи");
        Credentials credential2 = new Credentials("Удалять записи");
        Credentials credential3 = new Credentials("Редактироват записи");
        Credentials credential4 = new Credentials("Читать записи");

        // создание связей ролей с полномочиями
        role1.addCredentials(credential1);
        role1.addCredentials(credential2);
        role1.addCredentials(credential3);
        role1.addCredentials(credential4);
        role2.addCredentials(credential3);
        role2.addCredentials(credential4);
        role3.addCredentials(credential4);

        // создание связей пользователей с ролями
        user1.addRole(role1);
        user1.addRole(role2);
        user3.addRole(role3);

        System.out.println("\n\nНеобходимо разработать метод, который получал на вход Код пользователя и Код Полномочия и возвращал бы true/false, в зависимости, есть ли такое полномочие у пользователя или нет\n");
        System.out.println(Methods.findUserAndCredential(1, 10)); // полномочия с кодом 10 не существует
        System.out.println(Methods.findUserAndCredential(1, 2)); // у пользователя с id 1 есть полномочие с id 2
        System.out.println(Methods.findUserAndCredential(3, 1)); // у пользователя с id 3 нет права создавать записи
        System.out.println(Methods.findUserAndCredential(2, 1)); // у пользователя с id 2 нет никаких полномочий

        System.out.println("\n\nНеобходимо разработать метод, который возвращает список всех доступных пользователю полномочий\n");
        System.out.println(Methods.findAllUserCredentials(1)); // передаем id пользователя


    }
}
