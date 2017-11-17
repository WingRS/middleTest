/**
 * Created by StasMaster on 17.11.17.
 */
public class MailInfo  {

    private EventCode mailCode;

    private Client client;

    private String letter;

    public MailInfo(Client client, EventCode eventCode) {
        this.mailCode = eventCode;
        if(mailCode.check(client)) {
            this.client = client;
            this.letter = mailCode.formLetter(this.client);
        }

    }

    public EventCode getMailCode() {
        return mailCode;
    }

    public void setMailCode(EventCode mailCode) {
        this.mailCode = mailCode;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MailInfo mailInfo = (MailInfo) o;

        if (mailCode != null ? !mailCode.equals(mailInfo.mailCode) : mailInfo.mailCode != null) return false;
        return client != null ? client.equals(mailInfo.client) : mailInfo.client == null;
    }

    public String getLetter() {
        return letter;
    }


}
