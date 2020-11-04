public class Santro extends car {
    Santro(int registrationNO)
    {
        super(registrationNO);
    }

    @Override
    void steering(int direction, int angle) {
        System.out.println("Take a turn");
        System.out.println("This is power steering");
    }

    @Override
    void braking(int force)
    {
        System.out.println("brakes applied");
        System.out.println("Uses gas brakes");

    }

}
