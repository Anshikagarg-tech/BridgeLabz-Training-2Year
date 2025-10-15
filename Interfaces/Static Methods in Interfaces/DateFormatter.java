import java.text.SimpleDateFormat;
import java.util.Date;

interface DateUtils {
    static String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}

public class DateFormatter {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(DateUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println(DateUtils.formatDate(today, "EEEE, MMMM dd yyyy"));
    }
}
