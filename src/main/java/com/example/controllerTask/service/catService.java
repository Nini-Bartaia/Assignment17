package com.example.controllerTask.service;

public class catService implements AnimalService{
    @Override
    public void handleAnimal(String animalName) {
        System.out.println("i handle cat:"+ animalName);
    }
}
