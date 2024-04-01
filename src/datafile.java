import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class datafile {
    public static void main(String[] args) {

        String namaFile = "./src/data_mhs.txt";

        List<Mahasiswa> dataMhs = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                String[] row = line.split(", ");
                Mahasiswa m = new Mahasiswa();
                m.nim = row[0];
                m.nama = row[1];
                m.tahunMasuk = Integer.valueOf(row[2]);
                m.beasiswa = Boolean.valueOf(row[3]);

                dataMhs.add(m);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }


        System.out.println("Total data = " + dataMhs.size());

        System.out.println("Data Mahasiswa dengan Beasiswa Unggulan:");
        for (Mahasiswa mhs : dataMhs) {
            if (mhs.beasiswa) {
                System.out.println("NIM: " + mhs.nim + ", Nama: " + mhs.nama);
            }
        }



    }

}