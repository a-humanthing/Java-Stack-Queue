package sorting;

public class Selection {
    static void selectionSort(int[] arr){
        for(int i= 0;i<arr.length;i++){
            int pos=0;
            int max=arr[pos];
            for(int j= 1;j<arr.length-i;j++){
                if(max<arr[j]){
                    max=arr[j];
                    pos=j;
                }
            }
            int t = arr[pos];
            arr[pos] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }
        System.out.println("selection sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,1};
        selectionSort(arr);
    }
}
