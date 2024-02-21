import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        boolean a = true;
//        short b = 234;
//        double c = 12.34f;
//        float d = 12.3f;
//        System.out.printf("Short: %d \n", b);
//        System.out.printf("Float: %f \n", d);
//        System.out.printf("Double: %.2f \n", c);


//        Scanner input = new Scanner(System.in);
//        String text;
//        System.out.print("Enter a number: ");
//        text = input.nextLine();
//        System.out.printf("Number: %s",text);

//        Scanner number = new Scanner(System.in);
//        double a;
//        a= number.nextInt();
//        if(a>0){
//            System.out.println("pos");
//        }
//        else {
//            System.out.println("Neg");
//        }

//        for(int i=0;i<5;i++){
//            System.out.println(i);
//        }

//        int [] array = new int[5];
//        for(int i=1;i<=4;i++){
//            array[i] = i;
//            System.out.println(Math.pow(array[i],i));
//        }

//        int [] numbers = {13,4,54,32,33};
//        Arrays.sort(numbers);
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(33);
//        numbers.add(21);
//        numbers.add(9);
//
////        for(int x:numbers){
////            System.out.println(x);
////        }
//        Iterator itr = numbers.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
//        System.out.println("");
//        System.out.println("ArrayList: "+numbers);
//        System.out.println("Size: "+numbers.size());
//        boolean check = numbers.contains(30);
//        System.out.println("Index of 30: "+check);

        Teacher teacher1 = new Teacher("Shahabuddin Akhon","Male",345);
        teacher1.GetAllData();
        int a= Teacher.sum(3,4,5,9);
        System.out.println(a);
    }
}