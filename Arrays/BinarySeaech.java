public class BinarySeaech {
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,11,15,17};//in binary search - array always sorted
        int target = 11;
        System.out.print(binarySearch(arr,target));

    }
    public static int binarySearch(int arr[],int target)
    {
        int low=0,high=arr.length-1,mid=(low+high)/2;
        while(low<=high)
        {
            if(arr[mid] == target)
            return mid;
            else if(arr[mid]>target)
            {
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
                mid=(low+high)/2;
            }
        }
        return -1;
    }
    
}
