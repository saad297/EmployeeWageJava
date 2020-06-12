class EmployeeWage
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to the Employee wage program.");
		int IS_PRESENT= 1;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOUR=8;
		int PART_TIME_HOUR=4;
		int PART_TIME=2;
		int FULL_TIME=1;
		int DAILY_WAGE;
		double empCheck=Math.floor(Math.random() *10)%3;
		System.out.println(empCheck);
		if(empCheck == FULL_TIME)
		{
			DAILY_WAGE=WAGE_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Employee's Daily wage for full time is : " + DAILY_WAGE);
		}
		else if (empCheck == PART_TIME)
		{
			DAILY_WAGE=WAGE_PER_HOUR * PART_TIME_HOUR;
                        System.out.println("Employee's Daily wage for part time is : " + DAILY_WAGE);
		}
		else
		{
			System.out.println("Employee is absent.");
		}
	}

}
