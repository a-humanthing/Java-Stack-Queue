package sorting;

public class insertion {
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int t= arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,42,4,1,0,-3};
        insertionSort(arr);
    }
}
