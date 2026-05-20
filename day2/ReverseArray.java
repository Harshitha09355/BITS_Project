public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,6};
        System.out.println("Given array:");
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i] +" ");
        }
       System.out.println("Reverse array:"); 
       for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i] +" ");
        }
    }
}
