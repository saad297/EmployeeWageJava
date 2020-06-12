class EmployeeWage
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to the Employee wage program.");
		int IS_PRESENT= 1;
		int WAGE_PER_HOUR=20;
		int WORKING_DAYS_PER_MONTH=20;
		int FULL_DAY_HOUR=8;
		int PART_TIME_HOUR=4;
		int PART_TIME=2;
		int FULL_TIME=1;
		int DAILY_WAGE;
		int MONTHLY_WAGE;
		double empCheck=Math.floor(Math.random() *10)%3;
		int randomCheck=(int)empCheck;

		switch (randomCheck)
		{
		case 1:

			DAILY_WAGE=WAGE_PER_HOUR * FULL_DAY_HOUR;
			MONTHLY_WAGE=WORKING_DAYS_PER_MONTH * DAILY_WAGE;
			System.out.println("Employee's Monthly wage for full time is : " + MONTHLY_WAGE);
		break;
		case 2:

			DAILY_WAGE=WAGE_PER_HOUR * PART_TIME_HOUR;
			MONTHLY_WAGE=WORKING_DAYS_PER_MONTH * DAILY_WAGE;
                        System.out.println("Employee's Monthly wage for part time is : " + MONTHLY_WAGE);
		break;
		default:
			System.out.println("Employee is absent.");
		}
	}

}
