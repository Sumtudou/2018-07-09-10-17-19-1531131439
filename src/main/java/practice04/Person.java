package practice04;

public class Person {
    private Integer age;
    private String name;

    public Person(String name ,Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String basicIntroduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }


    public String introduce() {
      return basicIntroduce();
    }

}
