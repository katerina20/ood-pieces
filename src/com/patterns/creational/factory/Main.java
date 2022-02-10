package com.patterns.creational.factory;

import com.patterns.creational.factory.model.Animal;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        final Optional<Animal> maybeParrot = animalFactory.createAnimal("Parrot");
        maybeParrot.ifPresent(Animal::sound);
    }
}
