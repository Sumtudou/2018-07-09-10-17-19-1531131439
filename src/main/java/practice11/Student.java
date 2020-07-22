package practice11;

public class Student extends Person {
    private Klass klass;
    public Student(Integer id,String name, Integer age,Klass klass) {
        super(id,name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        // 未设置班长
        if(klass.getLeader() == null){
            return super.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
        }
        if(klass.getLeader().equals(this)){
            return super.introduce()+" I am a Student. I am Leader of "+klass.getDisplayName()+".";
        }
        return super.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
    }
}
