package practice08;

public class Teacher extends Person{
    private Klass klass = null;

    public Teacher(Integer id,String name, Integer age,Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Teacher(Integer id,String name, Integer age) {
        super(id,name, age);
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce(){
        if(klass != null){
            return super.introduce()+" I am a Teacher. I teach "+getKlass().getDisplayName()+".";
        }else {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public  String introduceWith(Student student){
        String stuName = student.getName();
        if (this.getKlass().equals(student.getKlass())){
            return super.introduce()+" I am a Teacher. I teach "+stuName+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+stuName+".";
        }
    }
}