package sorting;

public class Bubble {
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = t;
                    swapped=true;
                }
            }
            if(!swapped)break;
        }
        System.out.println("Swapped Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr={3,2,4,1,6};
        bubbleSort(arr);
    }
}
