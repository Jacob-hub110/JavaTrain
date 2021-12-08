package kolekcje.zbiory;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    //Zbiory nie przechowuja duplikatow, duplikaty odrzucane sa na etapie dodawania.
    //Zbiory nie posiadaja indexow
    public static void main(String[] args) {
        //HashSet nie zapamietuje kolejnosci dodawania
        Set<String> namesSet = new HashSet<>();

        namesSet.add("Andrzej");
        namesSet.add("Tomek");
        namesSet.add("Basia");
        namesSet.add("Andrzej");
        namesSet.add("Kasia");
        namesSet.add("Delma");

        System.out.println(namesSet);

        //LinkedHashSet zapamietuje kolejnosc dodawania + robi to samo co HashSet
        namesSet = new LinkedHashSet<>();

        namesSet.add("Andrzej");
        namesSet.add("Tomek");
        namesSet.add("Basia");
        namesSet.add("Andrzej");
        namesSet.add("Kasia");
        namesSet.add("Delma");

        System.out.println(namesSet);

        //Uklada elementy sortujaco ; alfabetycznie
        namesSet = new TreeSet<>();

        namesSet.add("Andrzej");
        namesSet.add("Tomek");
        namesSet.add("Basia");
        namesSet.add("Andrzej");
        namesSet.add("Kasia");
        namesSet.add("Delma");

        System.out.println(namesSet);
    }
}
