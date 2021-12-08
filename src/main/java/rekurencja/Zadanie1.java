package rekurencja;

public class Zadanie1 {

    public static void main(String[] args) {
        System.out.println(Zadanie1.digitSum(5));
    }
    //Napisz metode rekurencyjnie, ktora policzy sume liczb od 1 do podanej jako argumenty liczby.
    //np. dla n = 5, metoda zwróci 15 (1+2+3+4+5)
    public static int digitSum(int num) {
        return num == 1 ? 1 : num + digitSum(num - 1);
    }
}
