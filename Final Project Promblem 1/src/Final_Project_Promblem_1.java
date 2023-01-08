
//Programmer Name: ENRICO L. PEDRAJETA JR.              Section: BSCS I-E1
//Date Started: APRIL 30, 2022                          Date Started: MAY 4, 2022   

import java.io.*;
import java.text.DecimalFormat;
public class Final_Project_Promblem_1 {
    
    public static void main(String[] args) throws IOException {
    	
    	DataInputStream E = new DataInputStream(System.in);
    	DecimalFormat dec = new DecimalFormat("#,##0.00");
    	
    	String PayRoll_Type, Employee_Name;
    	double Regular_Wage_Per_Hour, Hours_Worked, Semi_Monthly_Annual_Salary, Monthly_Annual_Salary, Over_Time_Wage_Per_Hour, 
    		   Regular_Pay, Over_Time_Pay, Gross_Pay, Annual_Salary;
    	
    	 for(int str = 1; str<=3; str++){
    	 	
    	System.out.print("\n\nPayroll Type (A) Weekly, (B) Semi-Monthly, (C) Monthly : ");
    	char PayRoll_Type_response = (char) E.read();
    		E.read();
    	
    	if(PayRoll_Type_response == 'A'){
    		
    		System.out.print("\nPayroll type: Weekly ");
    		System.out.print("\nEmployee Name: ");
    		// Employee Name
    		Employee_Name = E.readLine();
   			System.out.print("Regular Wage Per Hour: ");
   			//Regular Wage Per Hour
	    	Regular_Wage_Per_Hour = Double.parseDouble(E.readLine());
	    	System.out.print("Overtime Wage: ");
	    	//Overtime Wag Per Hour
	    	Over_Time_Wage_Per_Hour = Double.parseDouble(E.readLine());
	    	System.out.print("Work Hours: ");
	    	//Hours Worked
	    	Hours_Worked = Double.parseDouble(E.readLine());
      
    		
    	if(Hours_Worked >= 44){
    		//Computing Total Gross Pay
    		Regular_Pay = 44 * Regular_Wage_Per_Hour;
    		Over_Time_Pay = (Hours_Worked - 44) * Over_Time_Wage_Per_Hour;	
    		Gross_Pay = Regular_Pay + Over_Time_Pay;
    		System.out.print("Gross Pay: " + dec.format(Gross_Pay));}
    	else{
    		Gross_Pay = Hours_Worked * Regular_Wage_Per_Hour;
    		System.out.print("Gross Pay: " + dec.format(Gross_Pay));}
    		
    		}
    	
    	else if(PayRoll_Type_response == 'B'){
    		
    		System.out.print("\nPay Roll Type: Semi-Monthly ");
    		System.out.print("\nEmployee Name: ");
    		//Employee Name
    		Employee_Name = E.readLine();
    		System.out.print("Annual Salary: ");
    		//Annual Salary
    		Annual_Salary = Double.parseDouble(E.readLine());
    		//Computing Semi-monthly Total Gross Pay
    		Semi_Monthly_Annual_Salary = Annual_Salary /24;
    		System.out.print("Gross Pay: " + dec.format(Semi_Monthly_Annual_Salary));}
    	
    	else if(PayRoll_Type_response == 'C'){
    	
    		System.out.print("\nPay Roll Type: Monthly ");
    		System.out.print("\nEmployee Name: ");
    		//Employee Name
    		Employee_Name = E.readLine();
    		System.out.print("Annual Salary: ");
    		//Annual Salary
    		Annual_Salary = Double.parseDouble(E.readLine());
    		//Computing Monthly Total Gross Pay
    		Monthly_Annual_Salary = Annual_Salary / 12;
    		System.out.print("Gross Pay: " + dec.format(Monthly_Annual_Salary));}
    		
    		
    	 }
    		
    }
    
}
