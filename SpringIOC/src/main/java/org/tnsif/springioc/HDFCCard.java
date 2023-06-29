package org.tnsif.springioc;

public class HDFCCard implements DebitCard{

	@Override
	public void deposit() {
		
		System.out.println("HDFC - Deposting an amount of 1 Lakh rupees");
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("SBI - Withdrawing an amount of 20 thousand rupees");
		
	}

}
