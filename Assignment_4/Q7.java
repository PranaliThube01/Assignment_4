import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Selling Price: ");
        double sellingPrice = scanner.nextDouble();
        System.out.print("Enter Cost Price: ");
        double costPrice = scanner.nextDouble();
        

        if (sellingPrice > costPrice) {
            System.out.println("Profit of " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss of " + (costPrice - sellingPrice));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}

