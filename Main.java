
import java.util.*;
import java.util.Arrays;


public class Main {
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of table");
		int n =sc.nextInt();
		int [] element = new int[n+1];
		System.out.println("Enter the case");
		int task = sc.nextInt();
			switch(task)
		{
			case 1:
				for(int i=0;i<n;i++){
				int bill=sc.nextInt();
				element[i]=bill;
				
				
				}
				
			case 2:	
				for(int i=0;i<n;i++){
					System.out.println(element[i]+"$");
					
				}
			case 3:
				System.out.println("To Update");
				System.out.println("Enter the table Number");
				int chairnumber=sc.nextInt();
				int change=sc.nextInt();
				element[chairnumber-1]=change;
				for(int i=0;i<n;i++){
					System.out.println(element[i]+"$");
					
				}
		
			case 4:
				for(int i=0;i<n;i++) {
				if(element[i]!=0) {
					System.out.println("Amount paid for table" +i);
				}
					else {
						System.out.println("Amount not paid for table" +i);
					}
				}
					
					
				}
				
			    
				
		
		}

	}


