package Praktikum;

public class Buku {
    private String kategoriBuku;
    private String judulBuku;
    private String penulisBuku;

    public Buku (String kategori, String judul, String penulis){
        kategoriBuku = kategori;
        judulBuku = judul;
        penulisBuku = penulis;
    }
    private void displayMassage(){
        System.out.println("Buku " + judulBuku);
        System.out.println("dengan penulis " + penulisBuku );
        System.out.println("ada di kategori " + kategoriBuku);
    }

    public void displaykategori(String kategoriBuku){
        if (kategoriBuku == this.kategoriBuku){
            displayMassage();
        }
    }
}
