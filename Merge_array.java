import java.util.Scanner;

class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 5;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] merge = new int[size * 2]; 

        System.out.println("Enter " + size + " elements for the first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
            merge[i] = arr1[i]; 
        }

        System.out.println("Enter " + size + " elements for the second array:");
       
        int k = size; 
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
            merge[k] = arr2[i]; 
            k++;
        }

     
        System.out.println("The array after merging:");
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }

        scanner.close();
    }
}
