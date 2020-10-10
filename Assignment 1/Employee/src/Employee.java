import java.util.Scanner;
public class Employee {

    String name;
    int age;
    String city;
    
    public void getInput()
    {
        Scanner x = new Scanner (System.in);
        
        System.out.println ("Enter the name of employee: ");
        name = x.next();
        System.out.println ("Enter the age of the employee: ");
        age = x.nextInt();
        System.out.println("Enter the city of the employee: ");
        city = x.next();
    }
    
    public void display()
    {
        System.out.println ("Name of the employee is: " + name);
        System.out.println ("Age of the employee is: " + age);
        System.out.println ("City of the employee is: " + city);
    }
    public static void main(String[] args) {
        Employee e[] = new Employee[2];
        
        for (int i=0; i<2; i++)
        {
            e[i] = new Employee();
            e[i].getInput();
        }
        
        System.out.println ("Details of the employees: ");
        
        for (int i=0; i<2; i++)
        {
            e[i].display();
        }
    }
    
}
