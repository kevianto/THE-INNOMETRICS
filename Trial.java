
package trial;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        //System.out.println("welcome to java"
        Scanner input = new Scanner(System.in);
        
	System.out.print("Enter The year You want to get its Months: ");
	int y=input.nextInt();
	
	System.out.print("Enter The month i.e 1-12: ");
	int m=input.nextInt();
	int h=m-1;
	//checking if a year is leap or not
	int data[]={31,28,31,30,31,30,31,31,30,31,30,31};
	if((y%4==0&&y%100!=0)||(y%400==0))
	{
		data[1]=29;
	
	}
	
	int sum=0;
	//summing the days in the mgit nonths before the one u need its calendar
		
	for (int i=0;i<h;i++){
		
		sum+=data[i];
		
	}
	
	
	
	int f=((5*((y-1)%4))+(4*((y-1)%100))+(6*((y-1)%400)))%7;
	
	int fm=(f+sum)%7;
	
	
	String[] names = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	
System.out.print("Calendar for "+names[h]+" " +y );
	System.out.print("\nMO\tTU\tWE\tTH\tFR\tSA\tSU\n");
	
    int daysInMonth = data[h]; 

    for (int i = 0; i < fm; i++) {
        System.out.print("\t");
    }

    for (int day = 1; day <= daysInMonth; day++) {
        System.out.print(+day+ "\t" );
        if ((fm + day) % 7 == 0 || day == daysInMonth) {
            System.out.print("\n");
        }
    }
    }
    
}
