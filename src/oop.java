public class oop {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();

        m1.nim = "12350111267";
        m1.nama = "Rendy";
        m1.tahunMasuk = 2023;
        m1.beasiswa = false;

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "1235678122";
        m2.nama = "Yanto";
        m2.tahunMasuk = 2023;
        m2.beasiswa = false;

        System.out.println("M1 =" +m1);
        System.out.println("M2 =" +m2.nim + "\nNama = "+m2.nama);
    }
}
