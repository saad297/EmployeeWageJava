class EmployeeWage
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to the Employee wage program.");
		int IS_PRESENT= 1;
		int WAGE_PER_HOUR=20;
		int WORKING_DAYS_PER_MONTH=20;
		int TOTAL_WORKING_HOURS=100;
		int FULL_DAY_HOUR=8;
		int PART_TIME_HOUR=4;
		int PART_TIME=2;
		int FULL_TIME=1;
		int DAILY_WAGE;
		int DAY=1;
		int PRESENT_HOURS=1;
		int MONTHLY_WAGE;

		while(DAY <= WORKING_DAYS_PER_MONTH && PRESENT_HOURS < TOTAL_WORKING_HOURS)
		{
			int EMP_HOURS=1;
			double empCheck=Math.floor(Math.random() *10)%3;
			int randomCheck=(int)empCheck;

			switch (randomCheck)
			{
			case 1:
				EMP_HOURS=8;

			break;
			case 2:
				EMP_HOURS=4;
			break;
			default:
				EMP_HOURS=0;
			}
		
                        DAILY_WAGE=WAGE_PER_HOUR * EMP_HOURS;
                        MONTHLY_WAGE=WORKING_DAYS_PER_MONTH * DAILY_WAGE;
                        System.out.println("Employee's Monthly wage for part time is : " + MONTHLY_WAGE);
			DAY++;
		}
	}

}
