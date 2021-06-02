package easy.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

    Pattern pattern = Pattern.compile("\\d+");

    public Double sum(String text){
        Matcher matcher = pattern.matcher(text);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()){
            numbers.add(Integer.parseInt(text.substring(matcher.start(), matcher.end())));
        }
        return numbers.stream().mapToDouble(i -> i).sum();
    }
}
