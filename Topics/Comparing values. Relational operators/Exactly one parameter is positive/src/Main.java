import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean check1 =  a > 0 && b <= 0 && c <= 0;
        boolean check2 =  a <= 0 && b > 0 && c <= 0;
        boolean check3 = a <= 0 && b <= 0 && c > 0;
        boolean last = check1 || check2 || check3;

        System.out.println(last);
    }
}