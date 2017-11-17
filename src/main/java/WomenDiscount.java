/**
 * Created by StasMaster on 17.11.17.
 */
public class WomenDiscount implements EventCode  {
    private String name = "Women day discounts";
    public boolean check(Client client) {
        if(client.getSex().toString().equals(Sex.WOMAN.toString())){
            return  true;
        }
        return false;
    }

    public String formLetter(Client client) {
        String dear = "Mrs";

        return "Theme of the email " + name + "\n Dear "+ dear + " "+ client.getName() + " you have a new discount \n Sincerely yours, Administration";
    }
}
