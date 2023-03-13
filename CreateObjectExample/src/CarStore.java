import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {
        // Yeni bir Car objesi oluşturuyoruz
        Car myCar = new Car();
        Scanner myObj = new Scanner(System.in);


        // Car özelliklerini şu an biz giriyoruz ama bunları kullanıcıdan "Scanner" ile alabiliriz

        myCar.setbrand("Toyota");
        myCar.setModel("Corolla");
        myCar.setYear(2020);
        myCar.setPrice(20000.0);
        myCar.setKilometers(60000);

        System.out.println("*******Yeni Çamoluk Oto*******");
        // Display the car details
        myCar.displayCarDetails();

        // Drive the car 200 kilometers
        System.out.println("Lütfen yeni eklenecek kilometre değerini giriniz");
        int distance = myObj.nextInt();
        myObj.close();
        myCar.drive(distance);

        // Display the car details again
        myCar.displayCarDetails();

    }

    static class Car {
    // Variables
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isSold;
    private int kilometers;

    // Methods
    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public boolean isSold() {
        return isSold;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Sold: " + isSold);
        System.out.println("Kilometers: " + kilometers);
    }

    //Girilen değeri kilometreye ekleyen metod yazıyoruz.
    public void drive(int distance) {
        System.out.println("Driving " + distance + " kilometers");
        kilometers += distance;
        System.out.println("Kilometers driven: " + kilometers);
    }
    
    public void sellCar() {
        isSold = true;
    }
}

}

