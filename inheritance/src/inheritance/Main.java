package inheritance;

public class Main {
    public static void main(String[] args) {
        Custumer custumer = new Custumer();
        IndivdualCustumer halil=new IndivdualCustumer();
        halil.custumerNumber="12345";


        CorporateCustumer acuraCar= new CorporateCustumer();
        acuraCar.custumerNumber="155445";

        CustumerManager custumerManager =new CustumerManager();
        custumerManager.add(acuraCar);
        custumerManager.add(halil);





    }
}
