package Exception;

public class Main {
    public static void divide(int a,int b) throws Exception {
        int k =a/b;
        if(a<0){
            throw new Exception("a can't be zero");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            divide(-3,4);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Done");
        }
    }
}
