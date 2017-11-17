import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by StasMaster on 17.11.17.
 */
public class MailBox {

    private ArrayList<MailInfo> infos = new ArrayList<>();

    public MailBox() {

    }

    public MailBox(ArrayList<MailInfo> infos) {
        this.infos.addAll(infos);
    }

    public boolean addMailInfo(MailInfo info) throws Exception {
        if(infos.indexOf(info) != -1) {
            return false;
        }
        try {
            checkInfo(info);
            infos.add(info);
            return true;
        }catch (Exception a) {
            System.out.println("This is user hasn't a valid email");
        }
        return false;
    }

    public void checkInfo(MailInfo info) throws Exception {
        Client client = info.getClient();
        if(client.getEmail().isEmpty()) {
            throw new Exception();
        }

    }

    public boolean  sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo info:
             infos) {
            sender.sendMail(info);
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        MailBox box = new MailBox();
        MailInfo info = new MailInfo(new Client("Yur",20,Sex.MAN, "yra100@gmail.com"),new StudentEvent());
        MailInfo infoWomen = new MailInfo(new Client("Lilya",20,Sex.WOMAN, "lilya@mail.com"), new WomenDiscount());
        box.addMailInfo(info);
        box.addMailInfo(infoWomen);
        box.sendAll();
    }
}
