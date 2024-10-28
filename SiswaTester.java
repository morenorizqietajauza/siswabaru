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
        Siswa gilam = new Siswa(19, "gilamm", 999);
        Siswa azam= new Siswa(22, "azzamm", 100);
        Siswa nibras = new Siswa(29, "ibraa", 100);
        Siswa burhan = new Siswa(26, "burhann", 100);
        Siswa tegar = new Siswa(24, "tegarr", 100);
        Siswa moreno = new Siswa(16, "morenoooo", 100);

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

        // gilam.print();
        // azam.print();
        // nibras.print();
        // burhan.print();
        // tegar.print();
        // moreno.print();
        // input.close();
    }
}