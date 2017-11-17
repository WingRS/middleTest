/**
 * Created by StasMaster on 17.11.17.
 */
public interface EventCode {

    String name = null;
    boolean check(Client client);
    String formLetter(Client client);
}
