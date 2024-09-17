package strings;
public class Wordlength {
    public static void main(String[] args) {
        String sentence = "I am Naveen raju Vysyaraju";
        System.out.print(wordLength(sentence));
    }
    public static String wordLength(String sentence)
    {
        String [] arr = sentence.split(" ");
        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i].length()).append(" ");
        }
        return sb.toString();
    }
    
}
