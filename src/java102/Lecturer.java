package java102;

public class Lecturer extends Academist {
    private String kapiNo;
    public Lecturer(String adSoyad,String telefon,String eposta,String bolum,String unvan,String kapiNo){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.kapiNo=kapiNo;
    }
    public String getKapiNo(){
        return kapiNo;
    }
    public void setKapiNo(String kapiNo){
        this.kapiNo=kapiNo;
    }
    @Override
    public void giris(){
        System.out.println(this.getAdsoyad()+ "entered B gate");
    }
    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdsoyad() + " öğretim görevlisi derse"+ saat +"entered");
    }
}
