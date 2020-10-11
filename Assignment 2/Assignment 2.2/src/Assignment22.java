import java.util.Scanner;
public class Assignment22 {

    public static void main(String[] args) {
        String name;
        int date, month, year, monIncome, annualSalary;
        double tax;
        Scanner x = new Scanner (System.in);
        
        System.out.println ("Enter the name of the employee: ");
        name  = x.next();
        
        System.out.println ("Enter the birth date of the emloyee: ");
        date = x.nextInt();
        System.out.println ("Enter the birth month of the emloyee: ");
        month = x.nextInt();
        System.out.println ("Enter the birth year of the emloyee: ");
        year = x.nextInt();
        
        System.out.println ("Enter the monthly Income of the employee: ");
        monIncome = x.nextInt();
        
        annualSalary =  12 * monIncome;
        
        if (monIncome <= 200000)
        {
            tax = 0.05 * monIncome;
        }
        
        else if (monIncome > 200000 && monIncome <= 300000)
        {
            tax = 0.1 * monIncome;
        }
        
        else if (monIncome > 300000 && monIncome <= 400000)
        {
            tax = 0.15 * monIncome;
        }
        
        else if (monIncome > 400000 && monIncome <= 500000)
        {
            tax = 0.2 * monIncome;
        }
        
        else 
        {
            tax = 0;
        }
        
        System.out.println ("The name of the employee is: " + name);
        System.out.println ("The birth date of birth of the employee is: " + date + " " + month + " " + year);
        System.out.println ("The annual salary is: " + annualSalary);
        System.out.println ("The income tax is: " + tax);
    }
    
}
