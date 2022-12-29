package de.uni.koeln.sse.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client implements Visitor{
	
public static void main(String[] args) {
	Client c = new Client();
		

		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		List<HouseholdItem> namesList = Arrays.asList(microwaveOven, tv, wineGlass, coffeeTable, bed, cupboard);
		householdItmes.addAll(namesList);

		c.calculateElectronicCosts(microwaveOven);
		c.ElectronicPackingInstructions(microwaveOven);
		c.calculateElectronicCosts(tv);
		c.ElectronicPackingInstructions(tv);
		c.calculateGlassCosts(wineGlass);
		c.GlassPackingInstructions(wineGlass);
		c.calculateGlassCosts(coffeeTable);
		c.GlassPackingInstructions(coffeeTable);
		c.calculateFurnitureCosts(cupboard);
		c.FurniturePackingInstructions(cupboard);
		c.calculateFurnitureCosts(bed);
		c.FurniturePackingInstructions(bed);

	}

	public void calculateGlassCosts(Glass g) {
		double costs = 0;

		if (g.tickness == 1) {

			costs = ((double) g.lenght) * 2;
		}
		if (g.tickness == 2) {

			costs = ((double) g.lenght) * 1.2;
		}
		if (g.tickness == 3) {

			costs = ((double) g.lenght) * 0.7;
		}
		System.out.println("Totafor" + g.getName() + " is: " + costs);
	}

	public void calculateFurnitureCosts(Furniture f) {
		double costs = 0;

		costs = ((double) f.getWeight() / 20) * 5;

		System.out.println("Total for" + f.getName() + " is: " + costs);
	}

	public void calculateElectronicCosts(Electronic e) {
		double costs = 0;

		if (e.getFragile() == true) {
			costs = ((double) e.getWeight() / 10) * 5;
		} else {
			costs = ((double) e.getWeight() / 15) * 5;

		}
		System.out.println("Total Costs for " + e.getName() + " is: " + costs);
	}

	public void GlassPackingInstructions(Glass g) {

		System.out.println(" >should be wrapped with Bubble Wraps and packed in a box with dimension: " + g.getLenght()
				+ 1 + "x" + g.getWidth() + 1 + "x" + g.getHeight() + 1);
	}

	public void FurniturePackingInstructions(Furniture f) {

		System.out.println(" >should be covered with waterproof covers with area of: " + f.getLenght() + "x"
				+ f.getWidth() + "x" + f.getHeight());

	}

	public void ElectronicPackingInstructions(Electronic c) {
		System.out.println(" > should be coverd with Polythylne foam film and packed in a box with dimension: "
				+ c.getLenght() + 1 + "x" + c.getWidth() + 1 + "x" + c.getHeight() + 1);

	}

}
