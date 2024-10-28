//Driver class
import java.util.Scanner;
public class SiswaTester {
    public static void main(String[] args) {
        System.out.println("Inputkan Nama Siswa");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa");
        int id = input.nextInt();
        System.out.println("Inputkan IPK Siswa");
        double ipk = input.nextDouble();

        Siswa siswaBaru = new Siswa(id, nama, ipk);
        siswaBaru.print();
        // object
        // Class object = new constructor
        Siswa lam = new Siswa(19, "gilam", 100);
        Siswa zam = new Siswa(22, "azzam", 100);
        Siswa nibras = new Siswa(29, "ibra", 100);
        Siswa gus = new Siswa(26, "burhan", 100);
        Siswa meno = new Siswa(24, "moreno", 100);
        Siswa tegar = new Siswa(16, "tegar", 100);

        if(siswaBaru.getIpk() > 75) {
            System.out.println(siswaBaru.getNama() + " lulus");
        } else {
            System.out.println(siswaBaru.getNama()+" tidak lulus");;
        }

        //3 kondisi
        if(siswaBaru.getIpk() >= 90) {
            System.out.println("Excellent");
        } else if(siswaBaru.getIpk() < 90 && siswaBaru.getIpk() > 75) {
            System.out.println("Great");
        } else {
            System.out.println("So bad");
        }

        // lam.print();
        // zam.print();
        // nibras.print();
        // gus.print();
        // meno.print();
        // tegar.print();
        // input.close();
    }
}