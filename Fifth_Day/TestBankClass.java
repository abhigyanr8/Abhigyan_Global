package Fifth_day;

public class TestBankClass 
{
	public static void main(String args[])
	{
		ICICIBANK i = new ICICIBANK();
		KotakM k = new KotakM();
		
		System.out.println("Interest rate of Saving account of ICICIBANK  "+i.getSavingsInterestrate());
		System.out.println("Interest rate of Fixed account of ICICIBANK   "+i.getFixedDepositeInterestRate());
		
		System.out.println("Interest rate of Saving account of KotakM  "+k.getSavingsInterestrate());
		System.out.println("Interest rate of Fixed account of KotakM   "+k.getFixedDepositeInterestRate());
	}

}
