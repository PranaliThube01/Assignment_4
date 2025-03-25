import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percent: ");
        int  percent = scanner.nextInt();
        

        if (percent >= 75.00) {
            System.out.println("Passed: First class with distinction");
        } else if (percent >= 60.00) {
            System.out.println("Passed: First class");
        } else if (percent >= 50.00) {
            System.out.println("Passed: Second class");
        } else if (percent >= 40.00) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

