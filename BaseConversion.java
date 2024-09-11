import java.util.Scanner;

class BaseConversion {
    static String conversion(int num, int base) {
        StringBuilder ans = new StringBuilder();
        char[] baseChars = "0123456789ABCDEF".toCharArray();
        
        while (num != 0) {
            ans.append(baseChars[num % base]);
            num = num / base;
        }
        
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Enter base (2 for binary, 8 for octal, 16 for hexadecimal):");
        int base = scanner.nextInt();
        String ans = conversion(number, base);
        System.out.println("The converted number is: " + ans);
    }
}
