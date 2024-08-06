import java.util.Scanner;

class Sort{
    static void SelectionSort(int[] arr, int size){
        int min,temp;
        int i,j;
        for(i=0;i< size-1;i++){
            min=i;
            for( j=i+1;j< size;j++){
                if(arr[j]< arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("the array after sorting");
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int size=5;
        int[] arr=new int[size];
        System.out.println("Enter 5 numbers");
        for(int i=0;i< size;i++){
            arr[i]=scanner.nextInt();
        }
        SelectionSort(arr,size);
    }
}