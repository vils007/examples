package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
            Annotation [] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
        }
        System.out.println(" ");
        Method[] methods = ripper.getClassMethods(victim);
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }
}
