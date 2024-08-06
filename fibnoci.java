import java.util.Scanner;

class Fibnoci{
    static int fibnoci(int n){
        return (n==0 || n==1) ? n:(fibnoci(n-1)+fibnoci(n-2));

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a fibnoci limit");
        int limit=scanner.nextInt();
        System.out.println("fibnoci series is");
        for(int i=0;i<limit;i++){
            System.out.println(fibnoci(i));

        }
    }
}