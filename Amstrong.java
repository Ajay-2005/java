import java.util.Scanner;

class Armstrong {
    static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n; 
        int d;

        while (n > 0) {
            d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }

        return (original == sum);
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
