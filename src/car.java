public abstract class car {

    int registrationNO;

    //initialising the value
    car(int r) {
        registrationNO = r;
    }

    void openTank() {
        System.out.println("Fill the tank");
    }

    abstract void steering(int direction, int angle);

    abstract void braking(int force);
}
