package Praktikum;

public class Buku {
    private String kategoriBuku;
    private String judulBuku;
    private String penulisBuku;

    public void setKategoriBuku(String kategori){
        kategoriBuku = kategori;
    }
    public void setJudulBuku(String judul){
        judulBuku = judul;
    }
    public void setPenulisBuku(String penulis){
        penulisBuku = penulis;
    }

    private void displayInfo(){
        System.out.println("Buku " + judulBuku);
        System.out.println("dengan penulis " + penulisBuku );
        System.out.println("ada di kategori " + kategoriBuku);
    }

    public void displayKategori(String kategoriBuku){
        if (kategoriBuku == this.kategoriBuku){
            displayInfo();
        }
    }
}
