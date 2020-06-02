package snackbarpackage;
import java.text.*;

public class Customer{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand){
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

// GETTERS
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getCashOnHand(){
		return this.name + "'s cash on hand: " + "$" + this.cashOnHand;
	}

// SETTERS
	public void setName(String name){
		this.name = name;
	}
	public String addCashToHand(double cash, String name){
		DecimalFormat df = new DecimalFormat("0.00");
		this.cashOnHand = this.cashOnHand + cash;
		return "$" + df.format(cash) + " have been added to " + name + "'s hand! Their new total is: $" + this.cashOnHand;
	}
	public void buySnacks(double snackTotalCost){
		this.cashOnHand = this.cashOnHand - snackTotalCost;
	}

	@Override
	public String toString(){
		return name + " with " + "$" + cashOnHand;
	}

}