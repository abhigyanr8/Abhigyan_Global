package Fifth_day;

public class ICICIBANK extends Generalbank
{

	@Override
	float getSavingsInterestrate() 
	{
		return 4;
	}

	@Override
	float getFixedDepositeInterestRate() 
	{
		return 8.5f;
	}
	

}
