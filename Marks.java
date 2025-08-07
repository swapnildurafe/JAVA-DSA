import java.util.*;
class Marks{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of semester: ");
        int semester = sc.nextInt();

        int[] subject = new int[semester];
        for(int i=0;i<semester;i++){
            System.out.print("Enter no of subject in semester " + (i+1) +": ");
            subject[i] = sc.nextInt();
        }
        String[] marks = new String[semester];
        for(int i=0;i<semester;i++){
            System.out.print("Enter the marks in Sem "+(i+1)+" :");
            marks[i] = sc.next();
        }

        for(int i=0;i<semester;i++){
            int max = Integer.MIN_VALUE;
            String m = marks[i];
            int subjects = subject[i];

            if(m.length() != 2 * subjects ){
                System.out.print("Invalid Input for semester "+(i+1)+" ");
            }

            for(int j=0;j<m.length();j = j + 2){
                int mark = Integer.parseInt(m.substring(j,j+2));

                if(mark<0 || mark>100){
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                if(mark>max){
                    max = mark;
                }
            }
            System.out.println("Maximum mark in " + (i + 1) + " semester: " + max);
        }  
    }
}