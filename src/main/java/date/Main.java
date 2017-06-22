package date;

import java.text.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String str = "2017/06/22 10:30:33";

        DateFormat dataFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.println(dataFormat.parse(str));
        System.out.println(dataFormat.format(new Date()));
        System.out.println(dataFormat.format(System.currentTimeMillis()));
    }
}
