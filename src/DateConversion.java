import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

// #2: Write a function that converts user entered date string formatted as M/D/YYYY to a string in this format: YYYYMMDD
public class DateConversion {

    public static void main(String[] args) throws Exception {
        System.out.println(convertDate("9/9/2019"));

    }

    private static String convertDate(String date1) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
        Date date = sdf.parse(date1);
        return new SimpleDateFormat("YYYYMMdd").format(date);
    }
}
