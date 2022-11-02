package inheritance;

public class Main {
    public static void main(String[] args) {
        CustumerManeger custumerManeger=new CustumerManeger();
        custumerManeger.add(new DatabaseLogger());
        custumerManeger.add(new FileLogger());
        custumerManeger.add(new EmailLogger());



    }
}
