import java.util.Scanner;

class Armstrong {
    public static boolean isArmstrong(int n) {
        int originalNum = n, sum = 0, digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Armstrong range");
        int range = scanner.nextInt();
        
        System.out.println("Armstrong series");
        for (int i = 0; i < range; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close(); 
    }
}
