package com.cmput301.penguindive;

public class Binomial_Trial {

    // passes/fails count
    private int numPasses;
    private int numFails;

    // constructor
    public Binomial_Trial(int numPasses, int numFails) {
        this.numPasses = numPasses;
        this.numFails = numFails;
    }

    // functions that add one pass/fail when run, used bc storyboard indicates this format
    public void addOnePass() {
        numPasses++;
    }

    public void addOneFail() {
        numFails++;
    }

    // getters
    public int getNumPasses() {
        return numPasses;
    }
    public int getNumFails() {
        return numFails;
    }
}
