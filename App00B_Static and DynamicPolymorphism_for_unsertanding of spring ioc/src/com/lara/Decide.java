package com.lara;

public class Decide
{
	public void withdrowMyAccount(Account acc)
	{
		//case : 1
		//acc.withdrow();
		//acc.overDraft(); not present
		
		/*the method which is present in the Top class that method is only accessible here
		i.e. withdrow()
		and if the method present in the Top class(Account) and these method are overriden in the child
		class and we are passing the instance of child class then the overridden method of that
		child class will be executed*/
		
		//case : 2
		
		/*CurrentAccount c1 = (CurrentAccount)acc;
		c1.withdrow();
		c1.overDraft();*/
		
		
		//case:3 overcome the problem of ClassCastException
		if(acc instanceof CurrentAccount)
		{
			CurrentAccount c = (CurrentAccount)acc;
			c.withdrow();
			c.overDraft();
		}
		else
		{
			SavingAccount s = (SavingAccount)acc;
			s.withdrow();
		}
		
		
	}
}
/*
	Here acc is Account Type but we do not know which account it may be SA and CA
	based on Account Type it will call the corresponding method.
*/