package practice09;

public class Person {
    private Integer id;
    private Integer age;
    private String name;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private Integer getId() {
        return id;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Person) {
            Integer id = ((Person) object).getId();
            return id.equals(this.getId());
        }
        return false;
    }

}