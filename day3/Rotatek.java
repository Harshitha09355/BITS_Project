
public class Rotatek {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        k=k%arr.length;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[arr.length-k+i]=temp[i];
        }
        System.out.println("Array after rotating left by " + k + " elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

