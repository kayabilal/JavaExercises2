package java102;

public class SecurityGuard extends Officer {
    private String belge;

    public SecurityGuard(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getAdsoyad()+"kept watch");
    }
}
