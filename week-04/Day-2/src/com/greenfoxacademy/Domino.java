package com.greenfoxacademy;

public class Domino implements Printable {

    protected Integer leftSide;
    protected Integer rightSide;

    public Domino(int leftSide, int rightSide){
        this.leftSide=leftSide;
        this.rightSide=rightSide;
    }
    @Override
    public void printAllFields() {
        System.out.println("Domino a side: " + leftSide + ", B side: " + rightSide);
    }
}
