import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        

        if (num >= 1 && num <= 1000) {
            System.out.println(num + " is in the range 1 to 1000");
        } else {
            System.out.println(num + " is not in the range 1 to 1000");
        }
    }
}

