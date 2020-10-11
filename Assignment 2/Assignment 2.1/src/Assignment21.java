import java.util.Scanner;
public class Assignment21 {
	
    public static void main(String[] args) {
        float Marks, total = 0, Average, Percentage;
        Scanner x = new Scanner (System.in);
        
        System.out.println ("Enter number of subjects: ");
        int sub = x.nextInt();
        
        System.out.println ("Enter the marks for " + sub + " subjects: ");
        for (int i=0; i<sub; i++)
        {
            Marks = x.nextInt();
            total = total + Marks;
        }
        
        Average = total / sub;
        Percentage = (total / (sub*100)) * 100;
        
        System.out.println ("Total marks for " + sub + "subjects is: " + total);
        System.out.println ("Average marks for " + sub + "subjects are: " + Average);
        System.out.println ("Percentage for " + sub + " subjects is: " + Percentage);
        
        if (Average >= 90)
        {
            System.out.println ("Student has got Grade A.");
            System.out.println ("Student has got " + Percentage + " percent marks.");
        }
        
        else if (Average >= 81 && Average < 90)
        {
            System.out.println ("Student has got Grade B.");
            System.out.println ("Student has got " + Percentage + " percent marks.");
        }
        
        else if (Average >= 71 && Average < 81)
        {
            System.out.println ("Student has got Grade C.");
            System.out.println ("Student has got " + Percentage + " percent marks.");
        }
        
        else if (Average >= 61 && Average < 71)
        {
            System.out.println ("Student has got Grade D.");
            System.out.println ("Student has got " + Percentage + " percent marks.");
        }
        
        else 
        {
            System.out.println ("Student is Fail.");
            System.out.println ("Student has got " + Percentage + " percent marks.");
        }
    }
    
}
