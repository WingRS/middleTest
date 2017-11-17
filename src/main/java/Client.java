import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by StasMaster on 17.11.17.
 */
public class Client {

    private String name;
    private int age;
    private Sex sex;
    private String email;
    private static final Pattern emailValidator =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public Client(String name, int age, Sex sex, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        if(validateEmail(email)){
            this.email = email;
        }

    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        this.age = age;
        return true;
    }

    public Sex getSex() {
        return sex;

    }

    public boolean setSex(Sex sex) {
        this.sex = sex;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        this.email = email;
        return true;
    }

    private boolean validateEmail(String emailStr) {
        Matcher matcher = emailValidator.matcher(emailStr);
        return matcher.find();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (age != client.age) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (sex != client.sex) return false;
        return email != null ? email.equals(client.email) : client.email == null;
    }


}
