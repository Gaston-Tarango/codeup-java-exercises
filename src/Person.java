import java.lang.reflect.Array;

public class Person {

    private String name;
    public String getName(){
        return name;
    };
    public void setName(String name){
        this.name = name;
    };
    public void sayHello(){
        System.out.println("Hello from " + this.name);
    };
    //constructors
    Person(String nameExt){
        this.name = nameExt;
    }



    public static void main(String[] args) {
        Person per = new Person("Jacob");
        per.sayHello();

    }
    }