import java.util.*;
import java.io.*;


public class ticket
{
	public static void main(String[] args) 
	{
	
	Scanner keyboard=new Scanner(System.in);
	
	char ticket_type;
	String ticket , yesno ;
	boolean yn = true;
	int total , quantity ;
	
	 while(true){
	
    System.out.println("\nTicket Type: ");
    System.out.println("1- Normal Ticket | 30$");
    System.out.println("2- Gold Ticket | 75$");
    System.out.println("3- Vip Ticket | 100$");
    System.out.print("Enter Ticket Type: ");
    ticket_type=keyboard.next().charAt(0);
    
    if (ticket_type =='1'){
        System.out.print("Price: 30$ | ");
        System.out.print("Enter the number of tickets: ");
        quantity=keyboard.nextInt();  
        total = quantity * 30;
        System.out.println("Total price is: "+total);
        System.out.println("\n*****************************");
        System.out.println("Please review the information");
        System.out.println("Ticket Type: Normal Ticket");
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+total);
        System.out.println("*****************************");
    } 
    if (ticket_type =='2'){
        System.out.print("Price: 75$ | ");
        System.out.print("Enter the number of tickets: ");
        quantity=keyboard.nextInt();  
        total = quantity * 75;
        System.out.println("Total price is: "+total);
        System.out.println("*****************************");
        System.out.println("Please review the information");
        System.out.println("Ticket Type: Gold Ticket");
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+total);
        System.out.println("*****************************");
    } 
    if (ticket_type =='3'){
        System.out.print("Price: 100$ | ");
        System.out.print("Enter the number of tickets: ");
        quantity=keyboard.nextInt();  
        total = quantity * 100;
        System.out.println("Total price is: "+total);
        System.out.println("*****************************");
        System.out.println("Please review the information");
        System.out.println("Ticket Type: Vip Ticket");
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+total);
        System.out.println("*****************************");
    }
    
        System.out.print("\nIs all the information correct?: ");
        yesno=keyboard.next();

        switch(yesno){
        case "yes":
            yn = false;
            System.out.println("Thank You, Visit us again");
            return;
        case "no": 
            yn = true;
            System.out.print("Enter Again\n");
            break;
        }
    }
	
	
	
	}
}
