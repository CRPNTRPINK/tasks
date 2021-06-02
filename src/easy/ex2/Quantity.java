package easy.ex2;

import java.util.*;

public class Quantity {

    private StringBuilder calculate(String[] list) {
        Integer count;
        StringBuilder result = new StringBuilder();
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : list) {
            count = countMap.get(word);
            if (count == null) {
                countMap.put(word, 1);
            } else {
                countMap.put(word, count + 1);
            }
        }
        int max = Collections.max(countMap.values());
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == max) {
                result.append(entry + "\n");
            }
        }
        return result;
    }

    public StringBuilder often(String text) {
        String[] textList = text.replaceAll("[.,?!]*", "").toLowerCase().split(" ");
        return calculate(textList);
    }

}
