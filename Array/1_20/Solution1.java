import java.util.*;

public class Main {
    private int[] sortTillMissingPositiveNumber(int[] arr){
        int positive=1;
        int position=0;
        while(positive<=arr.length){
            boolean isPresent=false;
            for(int i=0;i<arr.length;i++){
                if(positive==arr[i]){
                    isPresent=true;
                    int temp=arr[i];
                    arr[i]=arr[position];
                    arr[position++]=temp;
                    positive++;
                    break;
                }
            }if(!isPresent){
                break;
            }
        }System.out.println(positive);
        return arr;
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
        array=m.sortTillMissingPositiveNumber(array);
        System.out.print(Arrays.toString(array));
    }
}
