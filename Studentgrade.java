import java.util.Scanner;
class Studentgrade
{
    public static void main(String[] args) 
    {
         Scanner s1 = new Scanner(System.in);
         String stname;
         double math,java,ai,eng,it,py,totalmarks,avgper;
         char grade;
         System.out.println("Enter Student name:");
         stname=s1.next();
         System.out.println("Enter obtained maths marks out of 100:");
         math=s1.nextDouble();
         System.out.println("Enter obtained java marks out of 100:");
         java=s1.nextDouble();
         System.out.println("Enter obtained Artifical Intelligence marks out of 100:");
         ai=s1.nextDouble();
         System.out.println("Enter obtained English marks out of 100:");
         eng=s1.nextDouble();
         System.out.println("Enter obtained Information Technology marks out of 100:");
         it=s1.nextDouble();
         System.out.println("Enter obtained Python marks out of 100:");
         py=s1.nextDouble();
         totalmarks=math+java+ai+eng+it+py;
         avgper=(totalmarks/6);
         System.out.println("TotalMarks:"+totalmarks);

         if(avgper>=80)
         {
            grade = 'A';
         }
         else if(avgper>=60)
         {
            grade = 'B';
         }
         else if(avgper>=40)
         {
            grade = 'C';
         }
         else 
         {
            grade = 'D';
         }
         System.out.println("Average Percentage:"+avgper);
         System.out.println("Grade:"+grade);

        }
    }
    