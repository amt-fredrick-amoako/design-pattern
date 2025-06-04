package com.pdt.simplefactory.decorators.starbuzz;

/**
 * Hello world!
 *
 */
public abstract class Beverage
{
    protected String description = "Unknown Beverage";
    protected int size = 0;
    public abstract double cost();
    public String getDescription() {
        return description;
    }

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
}
