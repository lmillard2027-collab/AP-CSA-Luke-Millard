/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anatomyclass1;

/**
 *
 * @author lmillard2027
 */
//1) A class can be designed to represent the behaviors of an object, while an object is a specific instance defined by the specifications from the class. 


//2)Generally passes back a string of the object's important variable(s).


//3)The scope in a program is the area where data can be referenced. If a variable is defined in a method it can only be used in a method, but if a variable is made in a class it can be referenced with a wider scope.
 








public class AnatomyClass1 {
    public static void main(String[] args) {

        Car prius = new Car("Toyota Prius");
        prius.setHorsePower(194);
        prius.setMaxSpeed(112.0);
        prius.setPrice(29000.0);
        System.out.println(prius);
        System.out.println();

        Car bug = new Car("VW Bug");
        bug.setHorsePower(60);
        bug.setMaxSpeed(85.0);
        bug.setPrice(25000.0);
        System.out.println(bug);
        System.out.println();
        
        Car bmw = new Car("BMW i8");
        bmw.setHorsePower(200);
        bmw.setMaxSpeed(135);
        bmw.setPrice(100000.00); 
        System.out.println(bmw); 
        System.out.println();
        
        Car tesla = new Car("Tesla Model 3");
        tesla.setHorsePower(300);
        tesla.setMaxSpeed(150);
        tesla.setPrice(40000.00);
        System.out.println(tesla);
    }
}

class Car {
    private String carBrand = "";
    private int horsePower;
    private double maxSpeed;
    private double price;

    
    public Car(String inBrand) {
        carBrand = inBrand;
        horsePower = 0;
        maxSpeed = 0.0;
        price = 0.0;
    }

    
    public void setCarBrand(String inBrand) {
        carBrand = inBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    
    public void setHorsePower(int inHP) {
        horsePower = inHP;
    }

    public int getHorsePower() {
        return horsePower;
    }

    
    public void setMaxSpeed(double inMS) {
        maxSpeed = inMS;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setPrice(double inPrice) {
        price = inPrice;
    }

    public double getPrice() {
        return price;
    }

    
    @Override
    public String toString() {
        return "The Car Brand Is: " + carBrand
            + "\nThe car's horsepower is: " + horsePower
            + "\nThe car's max speed is: " + maxSpeed + " MPH"
            + "\nThe car's price is: $" + price;
    }
}



