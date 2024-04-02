package com.example.controllerTask.service;

public class dogService implements AnimalService{


    @Override
    public void handleAnimal(String animalName) {
        System.out.println("i handle dog:"+ animalName);
    }
}
