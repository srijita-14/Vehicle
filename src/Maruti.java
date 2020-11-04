
public class Maruti extends car{
            Maruti(int registrationNO)
            {
                super(registrationNO);
            }

    @Override
    void steering(int direction, int angle) {
        System.out.println("Take a turn");
        System.out.println("This is ordinary steering");
    }

    void braking(int force)
    {
        System.out.println("brakes applied");
        System.out.println("These are hydraulic brakes");

    }

}



