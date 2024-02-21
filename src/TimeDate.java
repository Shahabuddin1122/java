import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class TimeDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime =  time.format(formatter);
        System.out.println(formattedTime);

        Random rand = new Random();
        int randomNumber = rand.nextInt(1000);
        String formattedNumber = String.format("%03d", randomNumber);
        System.out.println("Random 3-digit number: " + formattedNumber);

    }
}
