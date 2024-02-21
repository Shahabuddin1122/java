package Inheritance;

public class Teacher extends Person{
    private String qualification;

    public Teacher(String name, int age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    @Override
    public void getValue() {
        System.out.printf("My name is %s at %d and i have done my %s",this.getName(),this.getAge(),this.getQualification());
    }
}
