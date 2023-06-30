package org.tnsig.autowireannotation;

public class MunicipalCorporation {
	
	private String area;
	private String MayorName;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMayorName() {
		return MayorName;
	}
	public void setMayorName(String mayorName) {
		MayorName = mayorName;
	}
	
	public void corporate ()
	{
		System.out.println("Municipal Corporation");
	}
	
}
