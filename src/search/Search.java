package search;

public class Search {
    static int binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int index=binarySearch(arr,12);
        if(index==-1){
            System.out.println("Target is not found");
        }
        else{
        System.out.println("target found at index = "+index);
        }
    }
}
