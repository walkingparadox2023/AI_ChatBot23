import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int s = scanner.nextInt();
        int k = scanner.nextInt();
        int result = (k % s);
        System.out.println(result);
    }
}