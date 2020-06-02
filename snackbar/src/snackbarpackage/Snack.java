package snackbarpackage;
import java.text.*;

public class Snack {
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId){
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

// GETTERS

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getQuantity(){
		return quantity;
	}
	public double getCost(){
		return cost;
	}
	public int vendingMachineId(){
		return vendingMachineId;
	}

// SETTERS

	public void setName(String name){
		this.name = name;
	}
	public void setCost(double cost){
		this.cost = cost;
	}
	public void setVendingMachineId(int vendingMachineId){
		this.vendingMachineId = vendingMachineId;
	}
	public String addQuantity(int quantity){
		this.quantity = this.quantity + quantity;
		return quantity + " " + this.name + "'s have been added! There is now " + this.quantity + " available.";
	}
	public double totalCost(int quantity){
		return this.cost * quantity;
	}
	public String buy(int quantity, String name){
		DecimalFormat df = new DecimalFormat("0.00");
		this.quantity = this.quantity - quantity;
		return name + " purchased " + quantity + " " + this.name + "'s for $" + df.format(totalCost(quantity)) + "! There's " + this.quantity + " left in stock.";
	}

	@Override
	public String toString(){
		return quantity + " " + name + " at " + "$" + cost;
	}

}