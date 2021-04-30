package denemeler;

public class Car {
	public Car(){
		
	}
	



private int id;
private String carBrand;
private String color;
private double dicount;
private double unitPriceAfterDiscount;



public Car(int id, String carBrand, String color , double discount, double unitPriceAfterDiscount) {
	super();
	this.id = id;
	this.carBrand = carBrand;
	this.color = color;
	this.dicount=discount;
	this.unitPriceAfterDiscount=unitPriceAfterDiscount;
	
	
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getCarBrand() {
	return carBrand;
}



public void setCarBrand(String carBrand) {
	this.carBrand = carBrand;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public double getDicount() {
	return dicount;
}



public void setDicount(double dicount) {
	this.dicount = dicount;
}



public double getUnitPriceAfterDiscount() {
	return unitPriceAfterDiscount;
}
}



