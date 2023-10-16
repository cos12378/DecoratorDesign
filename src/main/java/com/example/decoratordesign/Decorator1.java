package com.example.decoratordesign;

public class Decorator1 implements MainDeco{

    protected MainDeco deco1;
    protected String factorName;
    protected int factorNumber;

    public Decorator1(MainDeco deco1, String factorName, int factorNumber) {
        this.deco1 = deco1;
        this.factorName = factorName;
        this.factorNumber = factorNumber;
    }

    @Override
    public int getNumber(){
        return deco1.getNumber() + this.factorNumber;
    }


    @Override
    public String showInfo() {
        String deco1Info = deco1.showInfo();
        System.out.println("deco1 " + this.factorName + "Name is " + deco1Info);
        return deco1Info;
    }
}
