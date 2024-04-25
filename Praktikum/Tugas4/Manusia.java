package Tugas4;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        return String.format("nama           : %s%n" +
                             "nik            : %s%n" +
                             "jenisKelamin   : %s%n" +
                             "pendapatan     : %.1f",
                             nama, nik, gender, getPendapatan());
    }
}
