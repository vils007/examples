package integro;

import java.util.regex.*;

/**
 * Created by Администратор on 26.06.2017.
 */
public class PatternStr {

    public static void main(String[] args) {


    Pattern p = Pattern.compile(".*?IP is 192\\.168\\.(\\d+)\\.(\\d+)");
    Matcher matcher = p.matcher("Your IP is 192.168.1.30");
   if (matcher.matches()) {
       String subnet = matcher.group(1);  // 1
       String machine = matcher.group(2);  // 30
       System.out.println(subnet);
       System.out.println(machine);

   }

}
}