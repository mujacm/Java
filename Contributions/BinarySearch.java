public class binarySearch {
    public static void main(String[] args) {
        int[]arr ={1,4,7,23,78,1011};
        int target=23;
        int ans=binary(arr,target);
        System.out.println(ans);
     }
     static int binary(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
        int middle= start + (end-start)/2;
        while(start<=end){
            if(arr[middle]<target){
                start=middle+1;
            }
            else if(arr[middle]>target){
                end=middle-1;
            }
            else{
                return middle;
            }
        }
         return -1;
     }

}
