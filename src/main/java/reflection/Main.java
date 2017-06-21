package reflection;

import java.lang.reflect.Field;

/**
 * Created by Администратор on 21.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        Victim victim = new Victim();
        Ripper ripper = new Ripper();
        System.out.println(ripper.getClassName(victim));
        System.out.println(" ");

        Field fields [] = ripper.getClassFields(victim);
        for (Field field : fields) {
            System.out.println(field + "; fild name = " + field.getName());
        }

    }
}
