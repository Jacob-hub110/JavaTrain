package kolekcje;

import java.util.*;
import java.util.stream.Collectors;

public class Zadanie1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Poniedzialek");
        list.add("Poniedzialek");
        list.add("Wtorek");
        list.add("Wtorek");
        list.add("Wtorek");
        list.add("Wtorek");
        list.add("Wtorek");
        list.add("Poniedzialek");
        list.add("Sroda");
        list.add("Sroda");
        list.add("Sroda");
        list.add("Sroda");
        list.add("Sroda");
        list.add("Czwartek");
        list.add("Piatek");

        System.out.println(retriveOriginals(list));
    }

    public static List<String> retriveOriginals(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<String> retriveOriginalsStream(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
