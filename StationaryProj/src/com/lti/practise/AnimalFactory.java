package com.lti.practise;

public class AnimalFactory {
public Animal createAnimal(String type)
{
	if (type.equalsIgnoreCase("Carnivores"))
		return new Carnivores();
	else
		return new Herbivores();
}
}
