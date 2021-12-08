package wzorce_projektowe.builder.Zad1;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("a@d.com", "ewsrf")
                .pesel("234325465")
                .build();
        System.out.println(user);
        // "GOF" czterech autorów którzy przygotowali sporo wzorcow

    }
}
