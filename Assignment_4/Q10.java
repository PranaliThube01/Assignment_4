import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        

        if (age < 5) {
            System.out.println("Ticket is free!");
        } else if (age <= 18) {
            System.out.println("Ticket price:100");
        } else {
            System.out.println("Ticket price:200");
        }
    }
}

