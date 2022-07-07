import java.util.*;
public class Main {
    static void kLargest(int arr[], int k){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = n - 1; i > k; i--){
            System.out.print(arr[i] + " ");
        }      
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        kLargest(arr, k);
    }
}