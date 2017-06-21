package reflection;

/**
 * Created by Администратор on 21.06.2017.
 */
public class Victim {
    @Deprecated
    private String str;

    @Deprecated
    @VictimAnnotation
    private  Integer i;

    private void noToDo(){
        System.out.println("No to do");
    }
}
