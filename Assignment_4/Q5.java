import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float number: ");
        float floatNum = scanner.nextFloat();
        

        if (floatNum % 6 == 0) {
            System.out.println(floatNum + " is divisible by 6");
        } else {
            System.out.println(floatNum + " is not divisible by 6");
        }
    }
}

