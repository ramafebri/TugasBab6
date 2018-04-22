package tugasmodul5_kel26;
import java.util.Scanner;
public class TugasModul5_Kel26 {
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);
        input_output objek = new input_output();
        objek.nama("Rama Febriansyah");
        System.out.println(objek.nim("(2110117140023)"));
        objek.nama("Nareswari Dyah P");
        System.out.println(objek.nim("(2110117120002)"));
        System.out.println(" ");
        objek.daftar();
        System.out.print("Pilih nomor: ");
        pilih  = sc.nextInt();
        if (pilih>2 && 1<pilih)
            System.out.println("Pilih nomor yang benar");
        switch (pilih){
            case 1:
                operasi_fungsi objek1 = new operasi_fungsi();
                objek1.setpersegipjg();
                objek1.getpersegipjg();
                break;
            case 2:
                operasi_fungsi objek2 = new operasi_fungsi();
                objek2.setsegitiga();
                objek2.getsegitiga();
                break;
        }        
    }    
}
