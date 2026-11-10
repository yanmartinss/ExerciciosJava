package list.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        IO.println(list.size());

        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            IO.println(x);
        }

    }
}
