package operacjenastringach;

public class StringPool {

    public static void main(String[] args) {

        //"wordA" trafia do StringPool
        String wordA = "wordA";
        //Zostaje wykorzystany StringPool wiec pod wordB trafia wczesniej przechowywany obiekt
        String wordB = "wordA";
        //Wymuszamy stworzenie nowego obiektu
        String wordC = new String("wordA");


        //Equals porownuje wartosci
        System.out.println(wordA.equals(wordB)); //true
        System.out.println(wordA.equals(wordC)); //true

        // == porownuje obiekty ; ja: "Wydaje mi się, że miejsca w pamięci."
        System.out.println(wordA == wordB); //true
        System.out.println(wordA == wordC); //false
    }

}
