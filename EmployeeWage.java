class EmployeeWage
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to the Employee wage program.");
		int FULL_TIME= 1;
		double empCheck=Math.floor(Math.random() *10)%2;
		if(empCheck == FULL_TIME)
		System.out.println("Employee is present.");
		else
		System.out.println("Employee is absent.");
	}

}
