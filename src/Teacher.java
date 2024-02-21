public class Teacher {
    String name,gender;
    double phone;

    public Teacher(String name, String gender, double phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
    void GetAllData(){
        System.out.printf("Hello %s .your gender is %s and you are %.0f ",this.name,this.gender,this.phone);
    }
    static int sum(int ... num){
        int y=0;
        for(int x:num){
            y=y+x;
        }
        return y;
    }

}
