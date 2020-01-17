package Homework_3;

public class Main {

    public static void main(String[] args) {

    Male John = new Male(true, "John", "Smith", 1.75f, 67.5f);
    Male Andrew = new Male(true, "Andrew", "Roberson", 1.85f, 97.5f);
    Female Emmy = new Female(false, "Emmy", "Parker", 1.69f, 52f);
    Female Ashley = new Female(false, "Ashley", "Bush", 1.72f, 62f);

       /* John.haveRelationship(John.sex, Emmy.sex);
        John.haveRelationship(John.sex, Andrew.sex);*/

       /* System.out.println(Human.Speak(John.sex, Ashley.sex));
        System.out.println(Human.Speak(John.sex, Andrew.sex));
        System.out.println(Human.Speak(John.sex, Andrew.sex));
        System.out.println(Human.Speak(Andrew.sex, Emmy.sex));*/

        //System.out.println(Human.Endure(John.sex,Emmy.sex));
        System.out.println(Human.Endure(Ashley.sex,Emmy.sex));
        System.out.println(Human.Endure(Ashley.sex,Emmy.sex));
        System.out.println(Human.Endure(Ashley.sex,Emmy.sex));
        System.out.println(Human.Endure(Ashley.sex,Emmy.sex));
       // System.out.println(Human.Endure(John.sex,Andrew.sex));
}
}
