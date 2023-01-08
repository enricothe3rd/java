
//Programmer: ENRICO L. PEDRAJETA JR.              Year and Section: BSCS I-E1
//Date Started: APRIL 28, 2022                      //Date Finish: APRIL 30, 2022

import java.io.*;
import java.text.*;
 
public class Final_Project_Problem_2 {
    
    public static void main(String[] args) throws IOException {
    	
    	DataInputStream E = new DataInputStream(System.in);
    	String Student_Name;
    
    	double Experiments, Skills_Tests, Machine_Problems, Sum_Experiments = 0, Total_Experiments = 0,
    	 	Sum_Skills_Tests = 0, Total_Skills_Tests = 0, Sum_Machine_Problems = 0, Total_Machine_Problems = 0;
    	
  		  
  		  while (true) { 
  		  	System.out.print("Student Name: ");
  		  	Student_Name = E.readLine();
  		 
  		 System.out.print("\nExpiriments\n");
  		  	
         for(int i = 1; i<=4; i++){
           	System.out.print("Experiments Grades No. "+i + " : ");
           	//Input Experiments Grades
        	Experiments = Double.parseDouble(E.readLine());    
 			//Sum of Experiments
        	Sum_Experiments = Sum_Experiments + Experiments;
        	//Product of Experiments
        	Total_Experiments = (Sum_Experiments * .1) /2;}

           
          System.out.print("\nSkill Tests\n");
          	
          for(int j = 1; j<=4; j++){
           	System.out.print("Skills Tests Grades No. "+j + " : ");
           	//Input Skills Tests Grades
        	Skills_Tests = Double.parseDouble(E.readLine());    	
 			//Sum of Skills Tests
        	Sum_Skills_Tests = Sum_Skills_Tests + Skills_Tests;
        	//Total of Skills Tests
        	Total_Skills_Tests = (Sum_Skills_Tests * .1) /2;} 
           	
          System.out.print("\nMachine Problems\n");
           	 
          for (int m = 1; m <=2; m++){
           	System.out.print("Machine Problems Grades No. "+ m + " : ");
           	//Input Machine Problems Grades
        	Machine_Problems = Double.parseDouble(E.readLine());    
 			//Sum of Machine Problems
        	Sum_Machine_Problems = Sum_Machine_Problems + Machine_Problems;
        	//Total of Machine Problems
        	Total_Machine_Problems = Sum_Machine_Problems * .1;}
           	
           	
       double Prelim_Written_Examinations_Grades, Prelim_Practical_Examinations_Grades, Total_Prelim_Examinations_Grades,
       Final_Written_Examination_Grades, Final_Practical_Examinations_Grades, Total_Final_Examination_Grades, Total_Major_Examination_Grades, Average;
           	
           	
           	System.out.print("\nMajor Examinations");
           		
           	System.out.print("\nPreliminary Written Examination Grades /30: ");
           	//Input Preliminary Written Grades
           		Prelim_Written_Examinations_Grades = Double.parseDouble(E.readLine()); 
           	System.out.print("Preliminary Practical Examination Grades /70: ");
           	//Input Preliminary Practical Grades
           		Prelim_Practical_Examinations_Grades = Double.parseDouble(E.readLine());
           	//Total Preliminary Examination Grades	
	        Total_Prelim_Examinations_Grades = (Prelim_Written_Examinations_Grades + Prelim_Practical_Examinations_Grades) *.2;
	 
	           	

           	System.out.print("\nFinal Examinations");
           	
           	System.out.print("\nFinal Written Examination Grades /30: ");
           	//Input Final Written Grades
           	   Final_Written_Examination_Grades = Double.parseDouble(E.readLine()); 	
           	System.out.print("Final Practical Examination Grades /70: ");
           	//Input Final Practical Grades
           	   Final_Practical_Examinations_Grades = Double.parseDouble(E.readLine());
           // Total Final Examination Grades
	           Total_Final_Examination_Grades = (Final_Written_Examination_Grades + Final_Practical_Examinations_Grades) * .2;
	      

	      // Total Major Examination Total Grades     
	           Total_Major_Examination_Grades = Total_Prelim_Examinations_Grades + Total_Final_Examination_Grades;
            
  		 //Average of All Grades		
          	   Average = Total_Experiments + Total_Skills_Tests + Total_Machine_Problems + Total_Major_Examination_Grades;
          
          if(Average >= 95.57 && Average <= 100){System.out.print("\nFinal Raw Grades: " + Average);
          	System.out.print("\nGrade Point Average: 1.00 \nPassed");}
          else if(Average >= 91.12 && Average <= 95.56){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 1.25");}
          else if(Average >= 86.68 && Average <= 91.11){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 1.50");}
          else if(Average >= 82.23 && Average <= 86.67){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 1.75");}
          else if(Average >= 77.79 && Average <= 82.22){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 2.00");}
          else if(Average >= 73.34 && Average <= 77.78){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 2.25");} 
          else if(Average >= 68.90 && Average <= 73.33){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 2.50");} 
          else if(Average >= 64.45 && Average <= 68.89){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 2.75");} 
          else if(Average >= 60.00 && Average <= 64.44){System.out.print("\nFinal Raw Grades: " + Average );
          	System.out.print("\nGrade Point Average: 3.00");}
          else{System.out.print("\nFinal Raw Grades: " + Average + "\nFailed GPA is lower than 3.0");
          }	   	
    		
    	System.out.print("\n\nProcess another? Press Y: ");
	        char response = (char) E.read();
	        	E.read();
	            if (response == 'Y'){
	                continue;
	            }else{System.out.print("Thank you for using the program.");
	            break;
	            }
		}	
				   
    }
}
      