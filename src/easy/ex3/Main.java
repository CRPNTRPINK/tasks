package easy.ex3;

public class Main {
    public static void main(String[] args) {
        // 3.	Написать функцию, которая принимает на вход строку и формат даты, и возвращает
        // список найденных дат в заданной строке, соответствующих заданному формату
        DateFormat dateFormat = new DateFormat();
        System.out.println(dateFormat.checkFormat("15/07/2023, 15.07.2023, 12/02/2020", "dd/MM/yyyy"));
    }
}
