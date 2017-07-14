package integro;

/**
 * Created by Администратор on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {
      //  String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS[МЕСТРО РОЖДЕНИЯ]/G/8NNNNNNNNN9>D010117S1Т99O[ПП31111112/FAMILIYA=IMYA]";
        String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS[МЕСТРО РОЖДЕНИЯ]/G/8NNNNNNNNN9>D010117S1Т99";

        String namber, typeDoc, namberPasport, name, sername,
                fathername, datePasport, citizenship, placeOfBirth,
                gender, phoneNamber, dateReg, statusAccount, rate;

        String namberPasport2 = null, typeDoc2 = null, name2 = null, sername2 = null;

        if (str.startsWith("P04R103")) {

            namber = str.substring(8, 21);
            typeDoc = str.substring(23, 25);
            namberPasport = str.substring(25, str.indexOf("/"));
            sername = str.substring(str.indexOf("/") + 1, str.indexOf("="));
            name = str.substring(str.indexOf("=") + 1, str.indexOf("=", str.indexOf("=") + 1));
            fathername = str.substring(str.indexOf("=", str.indexOf("=") + 1) + 1, str.indexOf("/", str.indexOf("/") + 1));
            datePasport = str.substring(str.indexOf("/", str.indexOf("/") + 1) + 1, str.indexOf("/", str.indexOf("/") + 1) + 9);
            citizenship = str.substring(str.indexOf("[") - 3, str.indexOf("["));
            placeOfBirth = str.substring(str.indexOf("[") + 1, str.indexOf("]/"));
            gender = str.substring(str.indexOf("]/") + 2, str.indexOf("]/") + 3);
            phoneNamber = str.substring(str.indexOf("]/") + 4, str.indexOf(">"));
            dateReg = str.substring(str.indexOf(">D") + 2, str.indexOf(">D") + 8);
            statusAccount = str.substring(str.indexOf(">D") + 9, str.indexOf(">D") + 10);
            rate = str.substring(str.indexOf(">D") + 11, str.indexOf(">D") + 13);

            if (str.contains("O[")) {
                typeDoc2 = str.substring(str.indexOf("O[") + 2, str.indexOf("O[") + 4);
                namberPasport2 = str.substring(str.indexOf("O[") + 4, str.lastIndexOf("/"));
                sername2 = str.substring(str.lastIndexOf("/")+1,str.lastIndexOf("="));
                name2 = str.substring(str.lastIndexOf("=")+1,str.lastIndexOf("]"));

            }

            System.out.println(namber);
            System.out.println(typeDoc);
            System.out.println(namberPasport);
            System.out.println(sername + " " + name + " " + fathername);
            System.out.println(datePasport);
            System.out.println(citizenship + " " + placeOfBirth + " " + gender + " " + phoneNamber + " " + dateReg + " " + statusAccount);
            System.out.println(rate);

            System.out.println("");
            System.out.println(typeDoc2);
            System.out.println(namberPasport2);
            System.out.println(sername2);
            System.out.println(name2);


            ///System.out.println((String) rate.isEmpty());

        }

        rate = null;
        // if (rate.trim().length() == 0 || rate.equals(null)) {
        if (rate != null) {
            System.out.println("in rate 0");
        } else {
            System.out.println("it is rate = " + rate);
        }

    }


}
