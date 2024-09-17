package Arrays2D;

public class count {
    public static void main(String[] args) {
        int [][] arr = {{4,7,8},{8,8,7}};
        int target =7;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j] == target)
                c++;
            }
        }
        System.out.print("Count = "+c);
    }
    
}
