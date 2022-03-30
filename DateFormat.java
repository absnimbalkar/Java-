import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        System.out.println("Name: Abhishek Nimbalkar Rollno:1");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Current Date is:" + strDate);

        formatter = new SimpleDateFormat("MM-dd-yyyy");
        strDate = formatter.format(date);
        System.out.println("Current Date is:" + strDate);

        formatter = new SimpleDateFormat("EEEEEE MMMM dd yyyy");
        strDate = formatter.format(date);
        System.out.println("Current Date is:" + strDate);

        formatter = new SimpleDateFormat("E MMMM dd hh:mm:ss z yyyy");
        strDate = formatter.format(date);
        System.out.println("Current Date and Time is:" + strDate);

        formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        strDate = formatter.format(date);
        System.out.println("Current Date and Time is:" + strDate);

        formatter = new SimpleDateFormat("hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Current Time is:" + strDate);

        formatter = new SimpleDateFormat("w");
        strDate = formatter.format(date);
        System.out.println("Current Week of year is:" + strDate);

        formatter = new SimpleDateFormat("W");
        strDate = formatter.format(date);
        System.out.println("Current Week of month is:" + strDate);

        formatter = new SimpleDateFormat("D");
        strDate = formatter.format(date);
        System.out.println("Curren Day of the year is:" + strDate);

    }
}
