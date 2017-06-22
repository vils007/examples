package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Администратор on 21.06.2017.
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Victim victim = new Victim();
        Ripper ripper = new Ripper();
        System.out.println(ripper.getClassName(victim));
        System.out.println(" ");

        Field fields[] = ripper.getClassFields(victim);
        for (Field field : fields) {
            System.out.println(field + "; fild name = " + field.getName());
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
        }
        System.out.println(" ");
        Method[] methods = ripper.getClassMethods(victim);
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println();
        System.out.println(victim.getStr());
        System.out.println(victim.getI());
        System.out.println();

        Field fields2[] = ripper.getClassFields(victim);
        for (Field field : fields2) {
            Annotation annotation = field.getAnnotation(VictimAnnotation.class);
            if (annotation == null) {
                continue;
            }

            field.setAccessible(true);
            field.set(victim, "ONE");
            field.setAccessible(false);
        }

        System.out.println();
        System.out.println(victim.getStr());
        System.out.println(victim.getI());
        System.out.println();

    }
}
