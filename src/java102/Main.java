package java102;

public class Main {
    public static void main(String[] args) {
        //Employee e1=new Employee("Mustafa Çetindağ","0532","infopatika@gmail.com");
        //Academist a1=new Academist("Mahmut Hoca","0543","mahmut@gmail.com","ceng","Docent");
         //Officer o1=new Officer("Ali Veli","0643","apatika@gmail.com","Bilgi Islem","09-18");
         Lecturer l1=new Lecturer("Cemal Çetindağ","000","ert@gmail.com","CENG","Doçent","12");
         Assistant s1=new Assistant("Erdinç Kemal","0000","emal@gmail.com","CENG","Docent",20);
         IT i1=new IT("bilal kaya","08875","man@gmail.com","IT","10-19","Yazılım");
        LabAssistant r1=new LabAssistant("Elem rede","23098490","er@mgial.com","dfadaf","dafadf",12);
        //e1.giris("18:00");

        /*Employee e2=new Academist("Kodluyoruz","0543","mahmut@gmail.com","ceng","Docent");
        e2.giris();*/
       /* Employee[] loginUser={e1,a1,o1,l1};

        Employee.girisYapanlar(loginUser);*/

        l1.derseGir("10:00");





    }











}
