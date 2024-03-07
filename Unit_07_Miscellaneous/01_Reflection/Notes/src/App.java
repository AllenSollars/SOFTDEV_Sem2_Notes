import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("John", 24);
        System.out.println(person1.getClass().getName());
        Method[] person1Methods = person1.getClass().getMethods();
        for(int i = 0; i < person1Methods.length; i++){
            System.out.println(person1Methods[i].getName());
            if(person1Methods[i].getName() == "getAge"){
                person1Methods[i].invoke(person1);

            }
        }




    }
}
