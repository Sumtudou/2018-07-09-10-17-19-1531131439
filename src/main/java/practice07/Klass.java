package practice07;

public class Klass {
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        //Class 2
        return "Class "+number;
    }

    public Klass(Integer number) {
        this.number = number;
    }
}
