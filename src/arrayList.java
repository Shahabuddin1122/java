import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(23);
        numbers.add(56);
        System.out.println("ArrayList: "+numbers);

        for(int x:numbers){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        Iterator itr = numbers.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println("Before Sorting: "+numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("After Sorting: "+numbers);

    }
}
