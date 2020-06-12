class EmployeeWage
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to the Employee wage program.");
		int IS_PRESENT= 1;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOUR=8;
		int DAILY_WAGE;
		double empCheck=Math.floor(Math.random() *10)%2;
		if(empCheck == IS_PRESENT)
		{
			DAILY_WAGE=WAGE_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Employee's Daily wage is : " + DAILY_WAGE);
		}
		else
		{
			System.out.println("Employee is absent.");
		}
	}

}
