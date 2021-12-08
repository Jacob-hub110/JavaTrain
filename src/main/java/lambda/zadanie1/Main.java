package lambda.zadanie1;


import java.util.Locale;

/**
 * 1. Stwórz interfejs funkcyjny StringOperation z metodą:
 * • String operation(String input)
 * 2. Utwórz klasę StringProcessor, która będzie zawierać pole typu
 * StringOperation.
 * 3. W klasie StringProcessor, napisz metodę String process(String input),
 * która skorzysta z StringOperation i na jego podstawie zwróci wynik.
 * 4. W metodzie main przetestuj swoje rozwiązanie.
 * 1) Stwórz StringProcessor, który zwróci napis dużymi literami „abc” -> „ABC”.
 * 2) Zmień działanie StringProcessora, używając settera tak aby zwracał teraz
 * napis małymi literami.
 *
 * 3) Zmień działanie StringProcessora, tak aby zwracał trzy pierwsze litery
 * podanego Stringa.
 */
public class Main {

    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor(String::toUpperCase);

        System.out.println(stringProcessor.process("abc"));
        System.out.println(stringProcessor.process("def"));
        System.out.println(stringProcessor.process("zyz"));

        //zmiana dzialanie
        stringProcessor.setStringOperation(String::toLowerCase);
        System.out.println(stringProcessor.process("ABC"));


        //zmiana dzialanie
        stringProcessor.setStringOperation((String input) -> input.substring(0, 3));
        System.out.println(stringProcessor.process("kowedk"));
    }
}
