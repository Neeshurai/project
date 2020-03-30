package project;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust=new Customer();
		cust.setName("Jony");
		cust.setAddress("Pune,Maharastra");
		cust.setCashInHand(500000);
		Vehicle vehicle=new Vehicle();
		vehicle.setModel("OODI");
		vehicle.setMake("Honda");
		vehicle.setPrize(70000);
		Employee employee=new Employee();
		cust.purchaseCar(vehicle, employee, true);
		
	}

}
