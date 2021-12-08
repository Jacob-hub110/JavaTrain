package instrukcjewarunkowe.switchexample;

public class SwitchExample {

    public static void main(String[] args) {

        String option = "uno";

        switch (option) {
            case "uno":
            case "jeden":
            case "first":
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }

    }

}
