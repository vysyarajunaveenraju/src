public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {1,5,8,10,17};
        int target = 10;
        System.out.print(linearSearch(arr,target));
    }
    public static int linearSearch(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            return i;
        }
        return -1;
    }
    
}
