/**
 * Created by StasMaster on 17.11.17.
 */
public class MailSender {

    public boolean sendMail(MailInfo info) {
        System.out.println("This mail is sent to " + info.getClient().getName() );
        System.out.println("Content%");
        System.out.println(info.getLetter());
        return true;
    }

}
