import java.util.*;

public class Main {
    private int twoSum(int[] arr){
        int cost=0;
        int len=arr.length;
        while(len>1){
            if(arr[len-2]>arr[len-1]){
                cost+=arr[len-1];
                len--;
            }else{
                cost+=arr[len-2];
                len--;
            }
            if(arr[len-2]<arr[len-1]){
                len--;
            }
        }return cost;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        Main m=new Main();
        int result=m.twoSum(array);
        System.out.print(result);
    }
}
