package wyjatki;

public class FinallyExample {

    public static void main(String[] args) {

        int[] array = new int[5];

        try {
            array[10] = 3 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("oops wyjatek");
        } finally {
            //Kod w finally wykona sie zawsze
            System.out.println("koniec finally");
        }

        //Ten kod nie wykona sie, jesli w try poleci inny wyjatek niz ten lapany w catch
        System.out.println("koniec");
    }

}
