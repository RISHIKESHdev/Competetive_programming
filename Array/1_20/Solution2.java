import java.util.*;

public class Main {
    private int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }else{
                map.put(arr[i],i);
            }
        }return null;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }sc.nextLine();
        int target=sc.nextInt();
        Main m=new Main();
        int[] result=m.twoSum(array,target);
        System.out.print(Arrays.toString(result));
    }
}
