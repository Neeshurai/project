package project;

public class Customer {
String name;
String address;
double cashInHand;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getCashInHand() {
	return cashInHand;
}
public void setCashInHand(double cashInHand) {
	this.cashInHand = cashInHand;
}
public void purchaseCar(Vehicle vehicle,Employee employee,boolean finance)
{
	employee.handleCustomer(this, finance, vehicle);
}
@Override
public String toString() {
	return "Customer [name=" + name + ", address=" + address + ", cashInHand="
			+ cashInHand + "]";
}

}
 