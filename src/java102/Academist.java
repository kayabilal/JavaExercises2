package java102;

public abstract class  Academist extends Employee {
    private String bolum;
    private String unvan;
    public Academist(String adSoyad,String telefon,String eposta,String bolum,String unvan){
        super(adSoyad,telefon,eposta);
        this.bolum=bolum;
        this.unvan=unvan;

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    /*public void abstract derseGir(){
        System.out.println(this.getAdsoyad() + "entered the course");
    }*/
    public abstract void  derseGir(String dersSaati);

    @Override
    public void giris(){
        System.out.println(this.getAdsoyad()+"akademisyeni entered through Gate A");
    }
}
