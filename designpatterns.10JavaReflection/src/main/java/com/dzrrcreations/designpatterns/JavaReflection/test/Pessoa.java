package com.dzrrcreations.designpatterns.JavaReflection.test;

public class Pessoa implements Animal, Humano {

	@Override
	public void temPernas() {
		System.out.println("Tenho pernas");
	}

	@Override
	public void temCelulasComMembranaNuclearIndividualizada() {
		System.out.println("Tenho Células com Membra Nuclear Individualizada");
	}

}
