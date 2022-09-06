package com.lara;

public class ImpAccount04
{
	public static void main(String[] args)
	{
		Decide d = new Decide();
		
		d.withdrowMyAccount(new CurrentAccount());
		
		//good here because we are passing the reference of CA to the withdrowMyAccount(--)
		// so that Account acc is properly downcasted in CA and acc call the overDraft() method
		
		
		d.withdrowMyAccount(new SavingAccount());
		d.withdrowMyAccount(new CurrentAccount());
		//but if we pass here SA reference then we will got ClassCastExeption
		//in the Decide class we are forcefully downcasted SA reference to the CA
		//no complie time error because the compiler does not know type of Account
		//we can overcome this problem by checking the instance type
	}
}

/*
Inversion of Control(IoC)is an object-oriented programming practice whereby 
the object coupling is bound at run time by an "assembler"
object and are typical not knowable at compile time using the static analysis
*/
