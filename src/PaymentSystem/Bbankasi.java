package PaymentSystem;

public class Bbankasi implements IBanka {
    private String bankaAdi;
    private String terminalId;
    private String password;

    public Bbankasi(String bankaAdi,String terminalId,String password){
        this.bankaAdi=bankaAdi;
        this.terminalId=terminalId;
        this.password=password;
    }
    /*public void conn(String str){
        System.out.println(this.bankaAdi + "bağlanıldı.");
    }

    public void sendPayment(double price){
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("The Transaction was successfull");
    }*/

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip:" + ipAddress);
        System.out.println("makine ip:"+ this.hostIpAdress);
        System.out.println(this.bankaAdi + "bağlanıldı.");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("The Transaction was successfull");
        return true;
    }
}
