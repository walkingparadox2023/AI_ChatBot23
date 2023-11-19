import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A + B > C && A + C > B || A + B > C && B + C > A ) {
            System.out.println("YES");
        } else if ( B + C > A && A + C > B || A + C > B && A + B > C ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
