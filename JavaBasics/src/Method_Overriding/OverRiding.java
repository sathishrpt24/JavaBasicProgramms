package Method_Overriding;

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Manufacturer battery benefits");
		
		Battery_ManuFacturer bm = new Battery_ManuFacturer();
		
		bm.Battery_Charge_Hours();
		bm.Battery_warranty();

		Mobile_Company1 mc1 = new Mobile_Company1();
		
		System.out.println("Mobile company 1 battery benefits");
		mc1.Battery_Charge_Hours();
		mc1.Battery_warranty();
		
		System.out.println("Mobile company 2 battery benefits");
		Mobile_Company2 mc2 = new Mobile_Company2();
		mc2.Battery_Charge_Hours();
		mc2.Battery_warranty();
	}

}
