import java.util.Scanner;
class note{
    public static String Note(int percentage)
    {
        switch (percentage /10) {
            case 10:
                return "your grade : A+";
            case 9:
                return "your grade : A";
            case 8:
                return "your grade : B+";
            case 7:
                return "your grade : B";
            case 6:
                return "your grade : C";
            case 5:
                return "your grade : D";
            default:
                 return "F";
        }
    }
}
public class Grade {
    public static void main(String[] args) {
         note g =new note();
         Scanner variable =new Scanner(System.in);
         System.out.println("please enter the number of subjects :");
         int nubmarks=variable.nextInt();
         float sum=0;
         for(int i=0;i<nubmarks;i++)
         {
            float mark;
            System.out.println("please enter your mark" +(i+1));
            mark=variable.nextFloat();
            sum+=mark;

         }
         int  percentage = (int )(sum / nubmarks);
         String grade= g.Note(percentage);
         System.out.println("total marks :" +sum);
         System.out.println("percentage :" +percentage);
         System.out.println("Final result :" +grade);
         variable.close();
    }
}
