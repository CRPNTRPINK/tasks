package easy.ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DateFormat {

    public List<LocalDate> checkFormat(String date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format, Locale.ENGLISH);
        List<LocalDate> validDate = new ArrayList<>();
        String[] dateList = date.replace(" ", "").split(",");
        for (String d : dateList) {
            try {
                LocalDate dateParse = LocalDate.parse(d, formatter);
                validDate.add(dateParse);
            } catch (DateTimeParseException ex) {
                assert true;
            }
        }
        return validDate;
    }
}
