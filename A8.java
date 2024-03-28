import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter a day (1-7): ");
        int dayNumber = inputScanner.nextInt();
        String day = "";

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                return; 
        }

        System.out.println("The day is: " + day);
    }
}
			