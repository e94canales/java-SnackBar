package snackbarpackage;

public class Main {

	private static void executeCode(){

		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBars = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzels = new Snack("Pretzels", 30, 2.00, food.getId());
		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		jane.buySnacks(soda.totalCost(3));
		System.out.println(soda.buy(3, jane.getName()));
		System.out.println(jane.getCashOnHand());

		System.out.println(" "); ///////

		jane.buySnacks(pretzels.totalCost(1));
		System.out.println(pretzels.buy(1, jane.getName()));
		System.out.println(jane.getCashOnHand());

		System.out.println(" "); ///////

		bob.buySnacks(soda.totalCost(2));
		System.out.println(soda.buy(1, bob.getName()));
		System.out.println(bob.getCashOnHand());

		System.out.println(" "); ///////

		System.out.println(jane.addCashToHand(10, jane.getName()));

		System.out.println(" "); ///////

		jane.buySnacks(chocolateBars.totalCost(1));
		System.out.println(chocolateBars.buy(1, jane.getName()));
		System.out.println(jane.getCashOnHand());

		System.out.println(" "); ///////

		System.out.println(pretzels.addQuantity(12));

		System.out.println(" "); ///////

		bob.buySnacks(pretzels.totalCost(3));
		System.out.println(pretzels.buy(3, bob.getName()));
		System.out.println(bob.getCashOnHand());



		// System.out.println(jane);
		// System.out.println(bob);
		// System.out.println(food);
		// System.out.println(drink);
		// System.out.println(office);
		// System.out.println(chips);
		// System.out.println(chocolateBars);
		// System.out.println(pretzels);
		// System.out.println(soda);
		// System.out.println(water);

	}

	public static void main(String[] args){
		executeCode();
	}
}