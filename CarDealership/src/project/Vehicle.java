package project;

public class Vehicle {
private String make;
private String model;
private double prize;
@Override
public String toString() {
	return "Vehical [make=" + make + ", model=" + model + ", prize=" + prize
			+ "]";
	
}
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
public Vehicle(String make, String model, double prize) {
	super();
	this.make = make;
	this.model = model;
	this.prize = prize;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrize() {
	return prize;
}
public void setPrize(double prize) {
	this.prize = prize;
}
}
