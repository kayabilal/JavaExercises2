package java102;

public class LabAssistant extends Assistant{
    public LabAssistant(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(this.getAdsoyad()+"enter the lab");

    }
    public void derseGir(){
        System.out.println(this.getAdsoyad()+"enter the course");
    }
}
