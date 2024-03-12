package Praktikum.Tugas1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Perpustakaan {
    private String kampus;
    private List<Buku> daftarBuku = new ArrayList<>();

    public Perpustakaan(String kampus) {
        this.kampus = kampus;
    }

    public void displaySemuaBuku() {
        for (Buku buku : daftarBuku) { buku.displayInfo(); }
    }

    public void displayInfoBuku() {
        HashMap<Buku.Tipe, Integer> map = new HashMap<>();

        for (Buku buku : daftarBuku) {
            boolean isContains = map.containsKey(buku.getKategoriBuku());
            if (isContains) {
                // Jika kategori buku ada di map
                // tambahkan jumlah buku di map dg 1
                map.put(
                        buku.getKategoriBuku(),
                        map.get(buku.getKategoriBuku()) + 1
                );
            } else {
                // Jika kategori buku gk ada di map
                // tambahkan kategori buku ke map.
                // set jumlah buku = 1
                map.put(buku.getKategoriBuku(), 1);
            }
        }

        for (Buku.Tipe kategori : map.keySet()) {
            System.out.println("Kategori " + kategori.toString() + " memiliki " + map.get(kategori) + " buku");
        }
        // map.forEach((k, v) -> System.out.println("Kategori " + k + " memiliki " + v + " buku"));
    }

    public String getKampus() {
        return kampus;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void hapusBuku(Buku buku) {
        daftarBuku.remove(buku);
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
}