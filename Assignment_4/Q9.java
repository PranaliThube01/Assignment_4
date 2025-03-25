import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        if (a * a + b * b == c * c)  {
            System.out.println("It is a Pythagorean triplet.");
        } else {
            System.out.println("It is not a Pythagorean triplet.");
        }
    }
}

