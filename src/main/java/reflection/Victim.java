package reflection;

/**
 * Created by Администратор on 21.06.2017.
 */
public class Victim {
    @Deprecated
    @VictimAnnotation
    private String str;

    @Deprecated
    private Integer i;

    private void noToDo() {
        System.out.println("No to do");
    }

    public String getStr() {
        return str;
    }

    public Integer getI() {
        return i;
    }
}
