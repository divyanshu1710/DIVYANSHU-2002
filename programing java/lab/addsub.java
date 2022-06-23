import java.util.Scanner;
                 
public class addsub
{
    public static void main(String args[])
  {
    int first, second, add, subtract ;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
  
    

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
  
}
}
