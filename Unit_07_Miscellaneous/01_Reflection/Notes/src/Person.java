public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
        this.age = 0;
    }

    public String getName(){
        return name;
    }
}
