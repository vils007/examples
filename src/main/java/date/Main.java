package date;

import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        String str = "20170622:103033";

        DateFormat dataFormat = new SimpleDateFormat("yyyyMMdd:HHmmss");

        System.out.println(dataFormat.parse(str));
    }
}
