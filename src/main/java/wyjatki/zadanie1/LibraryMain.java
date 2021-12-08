package wyjatki.zadanie1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library("krzycka 32-117");
        User user1 = User.create("admin555", "Kropelka1", "Jan", "jan@gmail.com");
        User user2 = User.create("admin555", "Kropelka1", "Jan", "jan@gmail.com");

        try {
            int i = 5/0;
            library.addUser(user1);
            library.addUser(user2);
        } catch (UserAlreadyExistException e) {
            System.out.println("err");
        } finally {
            System.out.println("Zawsze sie wyswietli");
        }
        System.out.println("koniec");
    }
}
