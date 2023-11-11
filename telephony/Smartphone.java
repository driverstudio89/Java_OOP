package telephony;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new LinkedList<>(numbers);
        this.urls = new LinkedList<>(urls);
    }

    @Override
    public String browse() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (String url : urls) {
            if (Validator.containsDigit(url)) {
                sj.add("Invalid URL!");
            }else {
                sj.add("Browsing: " + url + "!");
            }
        }
        return sj.toString();
    }

    @Override
    public String call() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (String number : numbers) {
            if (Validator.containsNonDigit(number)) {
                sj.add("Invalid number!");
            } else {
                sj.add("Calling... " + number);
            }
        }
        return sj.toString();
    }

}
