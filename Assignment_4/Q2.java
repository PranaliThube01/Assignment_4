import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        

        if (num % 13 == 0) {
            System.out.println(num + " is in the table of 13");
        } else {
            System.out.println(num + " is not in the table of 13");
        }
    }
}

