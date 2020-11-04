class Vehicle {
    protected static String brand = "Ford";
    public static void honk() {
        System.out.println("car sound!");
    }
}

class Usecar extends Vehicle {
    private static String modelName = "Car550" ;
    public static void main(String[] args) {


        Usecar Usecar = new Usecar();

        Usecar.honk();

        System.out.println(Usecar.brand + "That is my car " + Usecar.modelName);

        Maruti m=new Maruti(1001);
        Santro s=new Santro(5005);

        car ref;
        ref=m;
        ref.openTank();
        ref.steering(1,90);
        ref.braking(500);

        ref=s;
        ref.openTank();
        ref.steering(1,90);
        ref.braking(500);
    }
}
