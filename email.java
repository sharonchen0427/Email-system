package emailSystem;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String emaill;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail="schen@gmail.com";
	private String companySuffix="abcompany.com";
	
	//constructor the first name last name  
	public email(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("EMAIL CREATED:"+this.firstName+" "+this.lastName);
		
		//call a method asking for the department-return the department
		this.department=setDepartment();
				//System.out.println("department:"+ this.department);
		//call method that return a random password
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("Your password is"+this.password);
		
		//combine elements to generate email
		emaill=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("your email is:"+email);
				
	}
	//ask for the department
	private String setDepartment() {
		System.out.println("Hello! "+firstName+".\nPlease enter your department codes\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\nEnter depart code");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {
			return "sales";
		}else if(depChoice==2){
			return "dev";
		}else if(depChoice==3){
			return "acct";
		}else {
			return"";
		}
		
	}

	//generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			//random
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);
		
	}
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set the alternate mail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
				//function,  args, 
		      //this.local variable=args
		 
	}
	//change the password
	
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "Display name: "+firstName+" "+lastName+" "+
				"\nCompany email: "+emaill+" "+
				"\nEmail password is: "+password+" "+
				"\nAlternate email: "+alternateEmail+" "+
				"\nMailbox capacity: "+mailboxCapacity+"mb";
		
	}

}
