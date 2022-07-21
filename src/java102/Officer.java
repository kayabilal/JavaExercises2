package java102;

public abstract class Officer extends Employee {
    private String departman;
    private String mesai;

    public Officer(String adSoyad,String telefon,String eposta,String departman,String mesai){
        super(adSoyad,telefon,eposta);
        this.departman=departman;
        this.mesai=mesai;
    }
    public String getDepartman(){
        return this.departman;
    }
    public void setDepartman(String departman){
        this.departman=departman;
    }

    public String getMesai(){
        return this.mesai;
    }
    public void setMesai(){
        this.mesai=mesai;
    }

    public void calis(){
        System.out.println(this.getAdsoyad() +"officer doing their job");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdsoyad() + " entered through C Gate ");
    }
}


