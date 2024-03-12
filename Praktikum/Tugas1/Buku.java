package Praktikum.Tugas1;

public class Buku {
    private Buku.Tipe kategoriBuku;
    private String judulBuku;
    private String penulisBuku;

    public Buku(String judulBuku, String penulisBuku, Buku.Tipe kategoriBuku){
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.kategoriBuku = kategoriBuku;
    }

    public void displayInfo(){
        System.out.println("Buku " + judulBuku);
        System.out.println("dengan penulis " + penulisBuku );
        System.out.println("ada di kategori " + kategoriBuku);
    }

    public Buku.Tipe getKategoriBuku(){
        return kategoriBuku;
    }

    public String getJudulBuku(){
        return judulBuku;
    }

    public String getPenulisBuku(){
        return penulisBuku;
    }

    enum Tipe {
        TEKNOLOGI,
        FILSAFAT,
        SEJARAH,
        AGAMA,
        PSIKOLOGI,
        POLITIK,
        FIKSI,
    }
}