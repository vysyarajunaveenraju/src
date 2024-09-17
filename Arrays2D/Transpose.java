package Arrays2D;

public class Transpose {
    public static void main(String[] args) {
        String [][] arr ={{"a11","a12","a13"},{"a21","a22","a23"}};
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
