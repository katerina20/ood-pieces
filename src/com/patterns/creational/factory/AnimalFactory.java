package com.patterns.creational.factory;

import com.patterns.creational.factory.model.*;

import java.util.Objects;
import java.util.Optional;

public class AnimalFactory {

    public Optional<Animal> createAnimal(String kind) {
        Objects.requireNonNull(kind, "Animal kind is required");
        final String genKind = kind.toLowerCase();
        if ("cat".equals(genKind)) return Optional.of(new Cat());
        if ("dog".equals(genKind)) return Optional.of(new Dog());
        if ("parrot".equals(genKind)) return Optional.of(new Parrot());
        return Optional.empty();
    }
}
