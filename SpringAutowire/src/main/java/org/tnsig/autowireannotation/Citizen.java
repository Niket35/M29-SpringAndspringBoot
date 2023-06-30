package org.tnsig.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Citizen {
	
	private MunicipalCorporation mc;
	
	@Autowired
	@Qualifier("m2")
	public void setMc (MunicipalCorporation mc) {
		this.mc = mc;
	}
	
	public void display()
	{
		mc.corporate();
		System.out.println("Result: " + mc.getMayorName() + " " + mc.getArea());
	}

}
