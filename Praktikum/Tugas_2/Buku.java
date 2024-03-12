package Praktikum.Tugas_2;

public class Buku implements Cloneable {
    private String kategoriBuku;
    private String judulBuku;
    private String penulisBuku;
    private String sinopsisBuku;

    public Buku() {
        kategoriBuku = "";
        judulBuku = "";
        penulisBuku = "";
        sinopsisBuku = "";
    }

    public Buku(String kategori, String judul, String penulis, String sinopsis) {
        kategoriBuku = kategori;
        judulBuku = judul;
        penulisBuku = penulis;
        sinopsisBuku = sinopsis;
    }

    public boolean isEqual(Buku bukuLain) {
        if (bukuLain == null) {
            return false;
        }

        return this.kategoriBuku.equals(bukuLain.kategoriBuku) &&
                this.judulBuku.equals(bukuLain.judulBuku) &&
                this.penulisBuku.equals(bukuLain.penulisBuku) &&
                this.sinopsisBuku.equals(bukuLain.sinopsisBuku);
    }

    public Buku clone() {
        return new Buku(
                kategoriBuku,
                judulBuku,
                penulisBuku,
                sinopsisBuku
        );
    }

    public void setKategoriBuku(String kategori) {
        kategoriBuku = kategori;
    }

    public void setJudulBuku(String judul) {
        judulBuku = judul;
    }

    public void setPenulisBuku(String penulis) {
        penulisBuku = penulis;
    }

    public void setSinopsisBuku(String sinopsis) {
        sinopsisBuku = sinopsis;
    }

    public int getPanjangSinopsis() {
        return sinopsisBuku.split(" ").length;
    }

    public void displayInfo() {
        System.out.println("Buku: " + judulBuku);
        System.out.println("Kategori: " + kategoriBuku);
        System.out.println("Penulis: " + penulisBuku );
        System.out.println("Sinopsis: " + sinopsisBuku);
    }
}
