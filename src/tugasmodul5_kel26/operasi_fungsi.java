package tugasmodul5_kel26;
import java.util.Scanner;
public class operasi_fungsi {
    float p, l, a, t, luas, luas1;
    Scanner sc1 = new Scanner(System.in);
    public void setpersegipjg(){
    System.out.println(" ");
    System.out.println("    Luas Persegi Panjang");
    System.out.print("masukkan panjang: ");
    p = sc1.nextFloat();
    System.out.print("masukkan lebar: ");
    l = sc1.nextFloat();
    luas = p*l;
    }
    public float getpersegipjg(){
        System.out.println("Luas nya adalah "+luas);
        return(luas);
    }
    public void setsegitiga(){
    System.out.println(" ");
    System.out.println("    Luas Segitiga");
    System.out.print("masukkan alas: ");
    a = sc1.nextFloat();
    System.out.print("masukkan tinggi: ");
    t = sc1.nextFloat();
    luas1 = (a*t)/2;
    }
    public float getsegitiga(){
        System.out.println("Luas nya adalah "+luas1);
        return(luas1);
    }    
}
