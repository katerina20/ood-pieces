# Solid principles

## Single Responsibility

A class should only have one responsibility. Furthermore, it should only have one reason to change.

## Open-Closed

Classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying 
existing code and causing potential new bugs.

## Liskov Substitution

If class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.

## Interface Segregation

Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need 
to be concerned about the methods that are of interest to them.

## Dependency Inversion

The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level 
modules depending on low-level modules, both will depend on abstractions.
