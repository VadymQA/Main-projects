package Homework_3;

public class Main {

    public static void main(String[] args) {

    Male John = new Male(true, "John", "Smith", 1.88f, 70f);
    Male Andrew = new Male(true, "Andrew", "Robinson",1.90f, 68f);
    Female Emmy = new Female(false, "Emmy", "Parker", 1.69f, 52f);
    Female Ashley = new Female(false, "Ashley", "Bush", 1.72f, 62f);


       //Andrew.spendTimeTogether(John);
        // System.out.println(Andrew.Speak(John));
        //System.out.println(Andrew.Speak(Emmy));

        System.out.println(Emmy);
        System.out.println(John);
        Emmy.giveBirth(John);


}
}
