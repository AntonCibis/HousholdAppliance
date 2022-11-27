package de.uni.koeln.sse.se;

public interface Visitor {

	public void calculateGlassCosts(Glass g);
	public void calculateFurnitureCosts(Furniture f);
	public void calculateElectronicCosts(Electronic c);
	
	public void GlassPackingInstructions(Glass g);
	public void FurniturePackingInstructions(Furniture f);
	public void ElectronicPackingInstructions(Electronic c);
	
}

