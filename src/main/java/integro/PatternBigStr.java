package integro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 26.06.2017.
 */
public class PatternBigStr {
    public static void main(String[] args) {
        String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS[МЕСТРО РОЖДЕНИЯ]/G/8NNNNNNNNN9>D010117S1Т99//O[ПП11111111/FAMILIYA=IMYA]";

        String namber, typeDoc, namberPasport, name, sername,
                fathername, datePasport, citizenship, placeOfBirth,
                gender, phoneNamber, dateReg, statusAccount, rate;

        Pattern pattern = Pattern.compile("P04R103W(%s)X<(%s)/(%s)=%s=%s/%s/%s[%s]/%s/%s>D%sS%sT%s%s");
        //  P04R103W%sX<%s/%s=%s=%s/%s/%s[%s]/%s/%s>D%sS%sT%s%s
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.matches());

        /*String regexp = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
        String url = "http://habrahabr.ru/post/260767/";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(url);*/


    }
}
