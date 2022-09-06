package com.lara;

public class ImpAccount01
{
	public static void main(String[] args)
	{
		Account acc = new CurrentAccount();
		acc.withdrow();
		
		/*
		
		Here instance of CA is existing in acc so that it will withdrow() of CA.
		Here we are creating the generic variable of Account type and storing the
		reference of any child class through that we are accessing the child class method.
	    
	    Account is the top level class
	    
	    why we go for this type we can also create the instance of CA and called the withdrow()
	    Reasons:-Here we are achieving the polymorphism (having many form)
	    
	    acc is the variable of Account or types of representation of  Account.
	    and Account is representing many types of Account like SavingAccount,CurrentAccount,FixedDeposit and
	    many other accounts.
	    
	    Here we are achieving static polymorphism or compile time polymorphism.
	    At compile time we decide the program flow.
	    Here at CT we decide the acc is containing the reference of CA and it will call the withdrow() of CA.
	    
	    THIS IS THE STATIC POLYMORPHISM (VVI) 
	     
	    How to achieve the dynamic polymorphism?
	    ---------------------------------------
	    we want to at RunTime what the acc of Account offer.
	    based on the user choice it will invoke or choose the CA,SA, withdrow()
	    
	    */
	}
}
