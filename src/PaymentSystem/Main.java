package PaymentSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        double price=input.nextDouble();
        System.out.print("Enter the CardNO: ");
        String cardNumber=input.next();
        System.out.print("Son kullanma tarihini giriniz: ");
        String date=input.next();
        System.out.print("Güvenlik kodunu giriniz: ");
        String cvc =input.next();

        System.out.println("1. A bankası");
        System.out.println("2. B bankası");
        System.out.println("3. C bankası");
        System.out.print("Banka seçiniz");
        int selectBank= input.nextInt();

        switch(selectBank){
            case 1:
                Abankasi aPos=new Abankasi("A bankası","123113","13212312");
                aPos.connect("127.0.0.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                Bbankasi bPos=new Bbankasi("B bankası","123113","13212312");
                bPos.connect("asd");
                bPos.payment(price,cardNumber,date,cvc);
            default:
                System.out.println("Geçerli banka giriniz");
        }



    }



}
