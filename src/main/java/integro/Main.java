package integro;

/**
 * Created by Администратор on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        // String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS[МЕСТРО РОЖДЕНИЯ]/G/8NNNNNNNNN9>D010117S1Т99O[ПП31111112/FAMILIYA=IMYA]";
        String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS[МЕСТРО РОЖДЕНИЯ]/G/8NNNNNNNNN9>D010117S0Т99";
        // String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS/G/8NNNNNNNNN9>";

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


            String string = str.substring(str.indexOf("/", str.indexOf("/") + 1) + 9);

            System.out.println(string);
            citizenship = string.substring(1, 4);
            if (string.substring(3, 6).contains("[")) {
                placeOfBirth = string.substring(string.indexOf("[") + 1, string.indexOf("]/"));
            } else {
                placeOfBirth = null;
            }
            String string2 = string.substring(4);
            System.out.println(string2);
            gender = string2.substring(string2.indexOf("/") + 1, string2.indexOf("/") + 2);
            String string3 = string2.substring(string2.indexOf("/") + 1);
            System.out.println(string3);
            phoneNamber = string3.substring(string3.indexOf("/") + 1, string3.indexOf(">"));
            // dateReg = str.substring(str.indexOf(">D") + 2, str.indexOf(">D") + 8);

            if (string.contains("S0")) {
                if (string3.contains("[")) {
                    if (string3.substring(0, string.indexOf("[")).contains("S0")) {
                        statusAccount = "0";
                    } else statusAccount = "1";
                } else statusAccount = "0";
            } else statusAccount = "1";

            //statusAccount = string.substring(str.indexOf(">D") + 9, string.indexOf(">D") + 10);
            rate = "99";

            if (string3.contains("O[")) {
                typeDoc2 = string3.substring(string3.indexOf("O[") + 2, string3.indexOf("O[") + 4);
                namberPasport2 = string3.substring(string3.indexOf("O[") + 4, string3.lastIndexOf("/"));
                sername2 = string3.substring(string3.lastIndexOf("/") + 1, string3.lastIndexOf("="));
                name2 = string3.substring(string3.lastIndexOf("=") + 1, string3.lastIndexOf("]"));

            }

            System.out.println(namber);
            System.out.println(typeDoc);
            System.out.println(namberPasport);
            System.out.println(sername + " " + name + " " + fathername);
            System.out.println(datePasport);
            System.out.println(gender);
            System.out.println(citizenship + " " + placeOfBirth + " gender = " + gender + " phoneNamber= " + phoneNamber + " statusAccount =  " + statusAccount);
            System.out.println(rate);

            System.out.println("");
            System.out.println(typeDoc2);
            System.out.println(namberPasport2);
            System.out.println(sername2);
            System.out.println(name2);


            ///System.out.println((String) rate.isEmpty());

        }
        if (true) {
            System.out.println("in 1");
        } else {
            System.out.println("in 2");
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
