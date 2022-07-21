public class Main {
    static boolean isMonoNumber(char[] arr){
        int n=arr.length;
        int single=arr[0]-'0',i=1;
        boolean isMono=true;
        while(i<n){
            if(arr[i]-'0'==single){
                i++;
            }else if(i<n-1&&(arr[i]-'0')+(arr[i+1]-'0')==single){
                i+=2;
            }else{
                isMono=false;
                break;
            }
        }
        if(isMono)
            return true;
        int pairs=arr[0]-'0'+arr[1]-'0';
        i=2;
        isMono=true;
        while(i<n){
            if(arr[i]-'0'==pairs){
                i++;
            }else if(i<n-1&&(arr[i]-'0')+(arr[i+1]-'0')==pairs){
                i+=2;
            }else{
                isMono=false;
                break;
            }
        }
        if(isMono)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String num="211";
        System.out.print(isMonoNumber(num.toCharArray()));
    }
}
