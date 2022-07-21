package java102;

public class Book {
    public String name;
    public int pageNumber;


    public Book(String name,int pageNumber){
        this.name=name;
        if(pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(){
        this.pageNumber=pageNumber;
    }




}
