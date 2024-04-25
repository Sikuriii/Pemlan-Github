package Tugas4;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("1. Manusia:");
        System.out.println("a. Laki-laki telah menikah:");
        Manusia a1 = new Manusia();
        a1.setNama("Asep");
        a1.setNik("300000000001");
        a1.setJenisKelamin(true);
        a1.setMenikah(true);
        System.out.println(a1);

        System.out.println("1. Manusia:");
        System.out.println("b. Perempuan telah menikah:");
        Manusia a2 = new Manusia();
        a2.setNama("Elly");
        a2.setNik("300000000002");
        a2.setJenisKelamin(false);
        a2.setMenikah(true);
        System.out.println(a2);

        System.out.println("1. Manusia:");
        System.out.println("c. belum menikah:");
        Manusia a3 = new Manusia();
        a3.setNama("Ujang");
        a3.setNik("300000000003");
        a3.setJenisKelamin(true);
        a3.setMenikah(false);
        System.out.println(a3);

        System.out.println("\n2. MahasiswaFilkom:");
        System.out.println("a. IPK kurang dari 3:");
        MahasiswaFILKOM b1 = new MahasiswaFILKOM();
        b1.setNim("255150200111000");
        b1.setIpk(2.2);
        b1.setNama("Dadang");
        b1.setNik("300000000004");
        b1.setJenisKelamin(true);
        b1.setMenikah(false);
        System.out.println(b1);

        System.out.println("\n2. MahasiswaFilkom:");
        System.out.println("b. IPK antara 3 dan 3.5:");
        MahasiswaFILKOM b2 = new MahasiswaFILKOM();
        b2.setNim("205150100111000");
        b2.setIpk(3.4);
        b2.setNama("Rena");
        b2.setNik("300000000005");
        b2.setJenisKelamin(false);
        b2.setMenikah(true);
        System.out.println(b2);

        System.out.println("\n2. MahasiswaFilkom:");
        System.out.println("c. IPK antara 3.5 dan 4:");
        MahasiswaFILKOM b3 = new MahasiswaFILKOM();
        b3.setNim("235150400111000");
        b3.setIpk(3.8);
        b3.setNama("Dadang");
        b3.setNik("300000000006");
        b3.setJenisKelamin(true);
        b3.setMenikah(false);
        System.out.println(b3);

        System.out.println("\n3. Pekerja:");
        System.out.println("a. Lama bekerja 2 tahun, anak 2:");
        Pekerja c1 = new Pekerja();
        c1.setGaji(1000);
        c1.setTahunMasuk(2016);
        c1.setBulanMasuk(3);
        c1.setTanggalMasuk(2);
        c1.setJumlahAnak(4);
        c1.setNama("Kasep");
        c1.setNik("300000000007");
        c1.setJenisKelamin(true);
        c1.setMenikah(true);
        System.out.println(c1);

        System.out.println("\n3. Pekerja:");
        System.out.println("b. Lama bekerja 9 Tahun:");
        Pekerja c2 = new Pekerja();
        c2.setGaji(2250);
        c2.setTahunMasuk(2009);
        c2.setBulanMasuk(5);
        c2.setTanggalMasuk(21);
        c2.setJumlahAnak(5);
        c2.setNama("Samsul");
        c2.setNik("300000000008");
        c2.setJenisKelamin(true);
        c2.setMenikah(true);
        System.out.println(c2);

        System.out.println("\n3. Pekerja:");
        System.out.println("c. Lama bekerja 20 tahun, anak 10:");
        Pekerja c3 = new Pekerja();
        c3.setGaji(10000);
        c3.setTahunMasuk(2000);
        c3.setBulanMasuk(1);
        c3.setTanggalMasuk(1);
        c3.setJumlahAnak(10);
        c3.setNama("krisna");
        c3.setNik("300000000007");
        c3.setJenisKelamin(true);
        c3.setMenikah(true);
        System.out.println(c3);

        System.out.println("\n4. Manager:");
        Manager d = new Manager();
        d.setDepartemen("Keuangan");
        d.setGaji(7500);
        d.setTahunMasuk(2005);
        d.setBulanMasuk(2);
        d.setTanggalMasuk(23);
        d.setJumlahAnak(5);
        d.setNama("Kuri");
        d.setNik("3000000000078");
        d.setJenisKelamin(true);
        d.setMenikah(true);
        System.out.println(d);
    }
}
