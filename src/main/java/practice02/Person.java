package practice02;

public class Person {
    protected Integer age;
    protected String name;

    public Person(String name,Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        //I am a Student. I am at Class 2.
        return "My name is "+name+". I am "+age+" years old.";
    }
}
