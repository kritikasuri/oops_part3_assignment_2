package com.acadgild.assignment.inheritance.buildings;

public class main {
	public static void main(String[] args) {
		
		System.out.println("Different types of buildings");
		residential_buildings res = new residential_buildings();
		res.type="Residential";
		res.area=2500.00;
		res.nbr_floors=5;
		res.color="light yellow";
		res.attributes_res();
		
		educational_buildings edu = new educational_buildings();
		edu.type="Educational";
		edu.area=1500.00;
		edu.nbr_floors=4;
		edu.color="grey";
		edu.attributes_edu();	   	
	}
}
