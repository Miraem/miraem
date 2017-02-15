package com.miraem;

public class PetRock {
    private String name;
    private boolean happy = false;

    public PetRock(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }


}
