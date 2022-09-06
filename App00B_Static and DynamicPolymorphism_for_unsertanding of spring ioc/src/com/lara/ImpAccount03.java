package com.lara;

public class ImpAccount03
{
	public static void main(String[] args)
	{
		SavingAccount s = new SavingAccount();
		s.withdrow();
		
		CurrentAccount c = new CurrentAccount();
		c.withdrow();
		/*
			we can call the SA and CA withdrow() by creating the instance of corresponding class
			if we go for above mention code then it is highly coupled of very tight coupled application.
			CA and SA is highly coupled with this implementation class i.e. ImpAccount03
		
		*/
	}
}
