class Solution {
    public static int max(int []arr,int a){
        // if(a==arr.length-2){
            // return arr[arr.length-1];//can be fixed after fixing last bug
        // }
        if(a==arr.length-1){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int i = a+1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                a=a+1;
            }
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int arro[] = {-1};
        if(arr.length==1){
            return arro;
        }
        int [] array = new int[arr.length];
        for(int j = 0 ;j<arr.length;j++){
            array[j]=max(arr,j);
        }
        return array;
    }
}