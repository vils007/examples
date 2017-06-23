package integro;

/**
 * Created by Администратор on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        String str = "P04R103W9002301000041X<ПП0111111112/ФАМИЛИЯ=ИМЯ=ОТЧЕСТВО/ДДММГГГГ/RUS[МЕСТРО РОЖДЕНИЯ]/G/8NNNNNNNNN9>D010117S1Т99O[ПП11111111/FAMILIYA=IMYA]";

        String namber, typeDoc, namberPasport, name, sername,
                fathername, datePasport, citizenship, placeOfBirth,
                gender, phoneNamber, dateReg, statusAccount, rate;

        if (str.startsWith("P04R103")) {

            namber = str.substring(8, 21);
            typeDoc = str.substring(23, 25);
            namberPasport = str.substring(25, str.indexOf("/"));
            sername = str.substring(str.indexOf("/") + 1, str.indexOf("="));
            name = str.substring(str.indexOf("=") + 1, str.indexOf("=", str.indexOf("=") + 1));
            fathername = str.substring(str.indexOf("=", str.indexOf("=") + 1) + 1, str.indexOf("/", str.indexOf("/") + 1));
            datePasport = str.substring(str.indexOf("/", str.indexOf("/") + 1)+1,str.indexOf("/", str.indexOf("/") + 1)+9);
            citizenship = str.substring(str.indexOf("[")-3,str.indexOf("["));
            placeOfBirth = str.substring(str.indexOf("[")+1, str.indexOf("]/"));
            gender = str.substring(str.indexOf("]/")+2,str.indexOf("]/")+3);
            phoneNamber = str.substring(str.indexOf("]/")+4,str.indexOf(">"));
            dateReg = str.substring(str.indexOf(">D")+2,str.indexOf(">D")+8);
            statusAccount = str.substring(str.indexOf(">D")+9,str.indexOf(">D")+10);
            rate =str.substring(str.indexOf(">D")+11,str.indexOf(">D")+13);

            System.out.println(namber);
            System.out.println(typeDoc);
            System.out.println(namberPasport);
            System.out.println(sername + " " + name + " " + fathername);
            System.out.println(datePasport);
            System.out.println(citizenship +" "+ placeOfBirth + " " + gender + " " + phoneNamber + " " +dateReg +" "+ statusAccount);
            System.out.println(rate);
        }
    }


}
