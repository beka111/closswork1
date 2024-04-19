public class Animal {

    private int age;

    public Animal(){}

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("Ошибка. Возраст отрицательный");
        }
    }

    public void makeVoice(){
        System.out.println("Животное издает звук");
    }

    public final void makeVoice(String name){
        System.out.println(name + " издает звук");
    }
}