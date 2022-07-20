package Giris;
import java.util.Arrays;
public class StringClass {
    public static void main(String[] args) {
        String str="patika";
        String patika="paTiKa";
        String[] sp=str.split("a");
        //System.out.println(Arrays.toString(sp));
        System.out.println(str.endsWith("a"));
        System.out.println(str.indexOf("p"));
        System.out.println(str.replace("a","b"));
    }
}
