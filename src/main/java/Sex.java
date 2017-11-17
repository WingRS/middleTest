/**
 * Created by StasMaster on 17.11.17.
 */
public enum Sex {
    WOMAN("Woman"), MAN("Man");

    private String name;

     Sex(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
         return  name;
    }
}
