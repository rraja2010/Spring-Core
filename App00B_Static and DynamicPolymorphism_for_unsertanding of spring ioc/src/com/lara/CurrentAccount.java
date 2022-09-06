package com.lara;

public class CurrentAccount extends Account {
	@Override
	public void withdrow() {
		System.out.println("----CurrentAccount class withdrow()------");
	}

	public void overDraft() {
		System.out.println("---------overDraft CurrentAccount section----------");
	}
}
