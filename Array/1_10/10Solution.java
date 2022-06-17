private int[] incrementByOne(int[] arr){
  int last=++arr[arr.length-1];
  if(last>9){
      if(arr.length==1){
          return new int[]{last/10,0};
      }else{
          arr[arr.length-2]++;
          arr[arr.length-1]=last%10;
      }
   }
   return arr;
}
