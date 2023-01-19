package oop1;

public class emp {

	String ename;
	int eid;
	private double esalary;
	public void getesal (double b)
	{
		this.esalary=b;
	}
	public void work()
	{
		System.out.println(ename+" is working");
		
				
	}
	public void details()
	{
		System.out.println("ename:"+ename);
		System.out.println("eid:"+eid);
		System.out.println("esal:+esalary");
	}
	emp(String n,int i,double s)
	{
		
		this.ename=n;
		this.eid=i;
		this.esalary=s;
	}




	
		}


