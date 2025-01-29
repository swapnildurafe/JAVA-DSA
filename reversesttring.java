import java.util.Scanner;

class reversestring{
    public static String revStringWord(String input)
    {
        String[] words=input.split(" ");
        int left=0; 
        int right=words.length - 1;
        while(left<right)
        {
            String temp = words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;

        }
        return String.join(" ",words);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = revStringWord(input);
        System.out.println(ans);
    }
}