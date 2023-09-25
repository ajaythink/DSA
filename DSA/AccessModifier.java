public class AccessModifier {
    public static void main(String... aregs) {
        BankAccount BK = new BankAccount();
        BK.username = "ajaynice";
        BK.setPwd("abcdefghijkl");
    }
}

class BankAccount {
    public String username;
    private String password;

    void setPwd(String pwd) {
        password = pwd;
    }

}
