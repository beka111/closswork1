import java.util.Arrays;

public final class Dog extends Pet{

    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public Dog(String name, String breed,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("Собака издает звук");
    }

    public void makeVoice(String voice){
        System.out.println("Собака издает звук " + voice);
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}