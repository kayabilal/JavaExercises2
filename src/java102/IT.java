package java102;

public class IT extends Officer{
    private String gorev;

    public IT(String adSoyad,String telefon,String eposta,String departman,String mesai,String gorev){
        super(adSoyad,telefon,eposta,departman,mesai);
        this.gorev=gorev;

    }
    public String getGorev(){
        return this.gorev;
    }
    public void setGorev(String gorev){
        this.gorev=gorev;
    }

    public void networkKurulumu(){
        System.out.println(this.getAdsoyad()+"did network installation");
    }
}
