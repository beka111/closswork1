import java.time.DayOfWeek;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        String [] commands = {"Sit", "Run"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Dog dog = new Dog("Rex", "Senbernar", commands,
                ColorEnum.WHITE, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гав гав");
    }
}