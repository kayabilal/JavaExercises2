package java102;

public class Assistant extends Academist {
    private int ofisSaati;

    public Assistant(String adSoyad,String telefon,String eposta,String bolum,String unvan,int ofisSaati){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.ofisSaati=ofisSaati;

    }
    public int getOfisSaati(){
        return this.ofisSaati;
    }
    public void setOfisSaati(int ofisSaati){
        this.ofisSaati=ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdsoyad()+"did a quiz.");
    }
    public void derseGir(String saat){
        System.out.println(this.getAdsoyad() + "saat" +saat +"derse girdi");
    }
}
