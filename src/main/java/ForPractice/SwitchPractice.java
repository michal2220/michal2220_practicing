package ForPractice;

public class SwitchPractice {


    public static void main(String[] args) {

        String day = "Monday";

        switch (day) {
            case "Sunday":
                System.out.println("It's Sunday!");
                break;
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Friday":
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
