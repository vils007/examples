package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Администратор on 21.06.2017.
 */
public class Ripper {

    public String getClassName(Object object) {
        Class clazz = object.getClass();
        return clazz.getName();
    }

    public Field[] getClassFields(Object object) {
        Class clazz = object.getClass();
        Field fields[] = clazz.getDeclaredFields();
        return fields;
    }

    public Method[] getClassMethods(Object object) {
        Class clazz = object.getClass();
        return clazz.getMethods();
    }

}
