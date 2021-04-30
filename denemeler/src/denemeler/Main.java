package denemeler;


public class Main {
	
	public static void main (String[] args) {
	
		
		Car car1=new Car(1,"Honda","Kýrmýzý",10, 13500);
		
		Car car2=new Car();
		car2.setId(2);
		car2.setCarBrand("Mercedes");
		car2.setColor("Siyah");
		car2.setDicount(10);
		car2.getUnitPriceAfterDiscount();
		
		
		
		Personel personel1 = new Personel();
		personel1.id=1;
		personel1.personelName="DamlaK.";
		personel1.personelDepartment="Engineer";
		
		Car[] cars= {car1,car2}; 
		
		
		System.out.println("Sistemde Bulunan Arabalar:");
	for(Car car:cars) {
		System.out.println(car.getCarBrand());
	}

	System.out.println("--------------------");
	Personel[] personels= {personel1};
	
	System.out.println("Sisteme Kayýtlý Personel: "+ personel1.personelName);
	for(Personel personel:personels) {
		
		
		System.out.println("Personel id: " + personel.id);
		System.out.println("Departmaný: "+personel.personelDepartment);
		System.out.println("Personelin Arabasý: " +car1.getCarBrand());
	}
	
		CarManager carManager =new CarManager();
		carManager.Add(car1);
		
		
	
		
	
		
	
		
		
	}

}
