package easy.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1.	Есть список занятых ip адресов в определенном диапазоне. Необходимо возвратить список свободных ip-адресов в этом диапазоне


        // ip адреса
        List<String> ip = Arrays.asList("192.168.1.1, 192.168.1.2, 192.168.1.3, 192.168.1.4, 192.168.1.5, 192.168.1.6, 192.168.1.7".replace(" ", "").split(","));
        // занятые ip адреса
        List<String> busyIp = Arrays.asList("192.168.1.2, 192.168.1.3, 192.168.1.4, 192.168.1.5".replace(" ", "").split(","));
        // вывод не занятых ip адресов
        List<String> freeIp = ip.stream().filter(i -> !busyIp.contains(i)).collect(Collectors.toList());
        System.out.println(freeIp);
    }
}
