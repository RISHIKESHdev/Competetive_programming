import java.util.*;

public class Main {
    private int[] sortTillMissingPositiveNumber(int[] arr){
        int pos=1, maxPositive=0;
        int[] result=new int[arr.length];
        while(pos<arr.length){
            boolean isPresent=false;
            for(int i=0;i<arr.length;i++){
                if(pos==arr[i]){
                    isPresent=true;
                    pos++;
                    break;
                }
            }if(!isPresent){
                maxPositive= pos;
                pos=arr.length;
            }
        }System.out.println(maxPositive==0?1:maxPositive);
        int i;
        for(i=0;i<maxPositive-1;i++){
            result[i]=i+1;
        }
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]<=0||arr[j]>maxPositive){
                result[i++]=arr[j];
            }
        }
        return result;
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
