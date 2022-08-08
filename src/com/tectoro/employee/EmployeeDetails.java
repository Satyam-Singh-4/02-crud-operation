package com.tectoro.employee;

import java.util.ArrayList;
import java.util.Scanner;

import com.tectoro.employee.service.EmployeeService;

public class EmployeeDetails {

	
	
	public static void main(String[] args) {
		
		 Integer eid=null;
		 String ename=null;
		 String address=null;
		 Double esalary=null;
		 String dept=null;
		 int n=0;
		 int count=0;
		 
		 EmployeeService empl=new EmployeeService();
		
		Scanner sc=new Scanner(System.in);
		
		//Empty ArrayList to save employee data
		
		ArrayList<Employee>emp=new ArrayList<>();
		
		//Switch case statement
		
		do {
			System.out.println("\n------------Employee management system-------------------\n");
			System.out.println("1.Add Employee\n"
					+"2.getAlllEmployee\n"
					+"3.getEmpById\n"+
					"4.updateById:\n"+
					"5.deleteAll:\n"+
					"6.deleteById:\n"+
					"7.exit");
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			switch (ch) {
			//Save employee details
			
			case 1:System.out.println("\nEnter employee details:\n");
			       System.out.println("\n how many employee you want add:");
			       n=sc.nextInt();
			       for(int i=1;i<=n;i++) {
			       count=count+1;
			       eid=count;
			       
			       System.out.println("Enter name:");
			       ename=sc.next();
			       System.out.println("Enter address:");
                   address=sc.next();
			       System.out.println("Enter salary:");
			       
			       esalary=sc.nextDouble();
			       System.out.println("Enter department:");
                   dept=sc.next();
                   
                   emp.add(new Employee(eid,ename,address,esalary,dept));
                   }
			       
                   break;
                   
                   
			//getAll employeeDetails
                   
			case 2:System.out.println("GetAll Employee details-");
			
			        empl.display(emp);
			        
			        break;
			        
			        
           //getEmployee By Id
			        
			case 3:System.out.println("Enter employeeid:-");
			       eid=sc.nextInt();
			       int i=0;
			       
			       for (Employee employee : emp) {
			    	   if (eid==employee.getEid()) {
			    		   System.out.println(employee+"\n");
			    		  i++;
			    	   }
			         }
			       
			    	   if(i==0) {
			    		   System.out.println("Employee not found");
			    	   }
				
			      break;
			    
			    
			//Update Employee By id
			      
			case 4: System.out.println("Enter id to update");  
			         eid=sc.nextInt();
			         
			         
			         for (Employee employee : emp) {
			        	 if(eid==employee.getEid()) {
			        		 int id=0;
			        		 id++;
			        	 
			        		 
			        		 do {
								
			        			 int ch1=0;
			        			 System.out.println("\n edit employee details:\n");
			        			 System.out.println("\nenter your choice:\n"+
			        			 
			        			 "1.Name\n"+
			        			 "2.Address\n"+
			        			 "3.Salary\n"+
			        			 "4.Dept\n"
			        			 );
			        			
			        			 System.out.println("enter your choice:");
			        			 ch1=sc.nextInt();
			        			 
			        			 switch (ch1) {
								case 1:System.out.println("Enter your new name");
								       ename=sc.next();
								       employee.setEname(ename);
								       break;
								
								case 2:System.out.println("Enter your new Address:");	       
									   address=sc.next();
									   employee.setAddress(address);
									   break;
								
							   //updateSalary 		   
								case 3: System.out.println("Enter your updated salary:");

									    do {

								       esalary=sc.nextDouble();
								       if(esalary>10000.00) {
								    	   employee.setEsalary(esalary);
								    	   break;
								       }else {
								    	   System.err.println("Enter your correct salary");
								       }
							      	} while (true);
									    
									 break;
								                
								     								      
								case 4:System.out.println("Enter your new dept:");	
								       dept=sc.next();
								       employee.setDept(dept);
								       break;

								default:System.out.println("Employee not exist"+eid);
									break;
								}
							} while (false);
			        	
			         } else {
			        	 System.err.println("emloyee not existed");
			        	 break;
			         }
			         }
			         break;
			        
			        
			case 5: System.out.println("delete employee by employee id-");   
			        eid=sc.nextInt();
			        
			        
			        for (Employee employee : emp) {
						if(eid==employee.getEid()) {
						  emp.remove(employee);
						  break;
						}
						
						break;
					}
			        
			case 6:System.out.println("Delete all employee"); 
			       emp.removeAll(emp);
			       break;
			       
			case 7:
				   break;
			
			   default: System.out.println("invalid choice");
				break;
			}
			
		} while (true);
		
	}
}
