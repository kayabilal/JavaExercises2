package java102;

public abstract class Employee {
    private String adsoyad;
    private String telefon;
    private String eposta;

    public Employee(String adsoyad,String telefon,String eposta){
        this.adsoyad=adsoyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

    public String getAdsoyad(){
        return this.adsoyad;
    }
    public void setAdsoyad(String adsoyad){
        this.adsoyad=adsoyad;
    }
    public String getTelefon(){
        return this.telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }
    public String getEposta(){
        return this.eposta;
    }
    public void setEposta(){
        this.eposta=eposta;
    }

    public void giris(){
        System.out.println(this.adsoyad +"entered the university");
    }
    public void giris(String girisSaati){
        System.out.println(this.adsoyad + " at " + girisSaati + " checked in.");
    }
    public void cikis(){
        System.out.println(this.adsoyad+"left the university");
    }

    public void yemekhane(){
        System.out.println(this.adsoyad+"entered the dining hall");
    }
    public static void girisYapanlar( Employee[] loginUsers ){
        for (Employee e: loginUsers){
            e.giris();
        }
    }
}
