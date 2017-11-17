/**
 * Created by StasMaster on 17.11.17.
 */
public class StudentEvent implements EventCode {

    private String name = "Student man discount events";

    public boolean check(Client client) {
        if(client.getAge() < 25 ) {
           return  true;
        }
        return false;
    }

    public String formLetter(Client client) {
        String dear = "Mr";
        if(client.getSex().toString().equals(Sex.WOMAN.toString())) {
            dear = new String("Mrs");
        }
        return "Theme of the email " + name + "\n Dear "+ dear + " "+ client.getName() + " you have a new discount \t Sincerely yours, Administration";
    }

}
