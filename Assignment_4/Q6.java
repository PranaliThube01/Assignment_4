import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        

        if (age > 0) {
            System.out.println("Valid age for voting");
        } else {
            System.out.println("Invalid age");
        }
    }
}

