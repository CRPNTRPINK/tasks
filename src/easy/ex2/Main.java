package easy.ex2;

public class Main {
    public static void main(String[] args) {
        // 2.	Написать функцию, которая принимает на вход строку и возвращает наиболее часто встречающееся в этой строке слово
        Quantity quantity = new Quantity();
        System.out.println(quantity.often("Привет, привет, привет кино?, кино!, Кино. Пойдем"));
    }
}
