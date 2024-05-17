package Tugas5;

public class Main {
    public static void main(String[] args) {

        Kue[] arrayKue = new Kue[20];

        arrayKue[0] = new KuePesanan("Brownies", 15.0, 0.5);
        arrayKue[1] = new KuePesanan("Lapis Legit", 20.0, 1.0);
        arrayKue[2] = new KueJadi("Donat", 10.0, 12);
        arrayKue[3] = new KueJadi("Kue Sus", 8.0, 20);
        arrayKue[4] = new KuePesanan("Bolu", 13.0, 0.5);
        arrayKue[5] = new KuePesanan("Lapis Surabaya", 20.0, 0.7);
        arrayKue[6] = new KueJadi("Cokelat", 9.0, 12);
        arrayKue[7] = new KueJadi("Kue Keju", 8.0, 20);
        arrayKue[8] = new KuePesanan("Kue Sus", 7.0, 0.5);
        arrayKue[9] = new KuePesanan("Kue Apem", 5.0, 1.0);
        arrayKue[10] = new KueJadi("Mochi", 12.0, 5);
        arrayKue[11] = new KueJadi("Kue Sus", 8.0, 20);
        arrayKue[12] = new KuePesanan("Kue Cubit", 11.0, 0.8);
        arrayKue[13] = new KuePesanan("Kue Kacang", 20.0, 1.2);
        arrayKue[14] = new KueJadi("Rainbow Cake", 10.0, 12);
        arrayKue[15] = new KueJadi("Klepon", 7.0, 20);
        arrayKue[16] = new KuePesanan("Kastengel", 13.0, 0.9);
        arrayKue[17] = new KuePesanan("Kue Pandan", 12.0, 0.5);
        arrayKue[18] = new KueJadi("Nastar", 10.0, 12);
        arrayKue[19] = new KueJadi("Kue Lumpur", 6.0, 20);

        System.out.println("=============== Daftar Kue =================");
        for (Kue kue : arrayKue) {
            if (kue != null) {
                System.out.println("- " + kue.toString() + " (" + kue.getClass().getSimpleName() + ")");
            }
        }
        System.out.println("============================================");

        double totalHarga = 0.0;
        for (Kue kue : arrayKue) {
            if (kue != null) {
                totalHarga += kue.hitungHarga();
            }
        }
        System.out.println("Total Harga Semua Jenis Kue: " + totalHarga);

        double totalHargaPesanan = 0.0;
        double totalBeratPesanan = 0.0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan : " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan : " + totalBeratPesanan);

        double totalHargaJadi = 0.0;
        double totalJumlahJadi = 0.0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi    : " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi   : " + totalJumlahJadi);

        double hargaTerbesar = 0.0;
        Kue kueTerbesar = null;
        for (Kue kue : arrayKue) {
            if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        if (kueTerbesar != null) {
            System.out.println("Kue dengan Harga Terbesar   : " + kueTerbesar.toString());
        }
    }
}

