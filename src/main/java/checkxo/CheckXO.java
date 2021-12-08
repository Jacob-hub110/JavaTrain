package checkxo;

public class CheckXO {

    /**
     * Metoda zwraca true, jeśli wyraz zawiera tyle samo znakow 'x' oraz 'o'.
     * Wielkość liter nie ma znaczenia.
     * @param word dowolny wyraz
     */
    public static boolean check(String word) {
        int sumX = 0;
        int sumO = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'x'){
                sumX++;
            } else if (c == 'o'){
                sumO++;
            }
        }
        return sumX == sumO;
    }

}
