package practice04;

public class Student extends Person{
    private Integer klass;

    public Student( String name,Integer age,Integer classNo) {
        super(name, age);
        this.klass = classNo;
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        return this.basicIntroduce()+" I am a Student. I am at Class "+this.getKlass()+".";
    }
}
