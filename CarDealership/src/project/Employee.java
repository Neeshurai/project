package project;

public class Employee {
	String name;
	
public void handleCustomer(Customer cust,boolean finance, Vehicle vehicle)
{
	if(finance==false)
	{
		double loanAmount=vehicle.getPrize()-cust.getCashInHand();
		runCreditHistory(cust,loanAmount);
	}
	else if(vehicle.getPrize()<=cust.getCashInHand())
	{
		processTransaction(cust,vehicle);
	}
	else
		System.out.println("Customer Needs more money to purchase Vehicle "+vehicle);
}
public void runCreditHistory(Customer cust, double loanAmount )
{
	System.out.println("Credit history ran for Customer "+cust);
	System.out.println(cust+" has been approved for purchase vehical ");
}
public void processTransaction(Customer customer, Vehicle vehicle)
{
	System.out.println(customer +" is approved to buy the "+vehicle+" on the prize of "+vehicle.getPrize());
}
}
