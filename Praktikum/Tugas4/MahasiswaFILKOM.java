package Tugas4;

class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String prodiStr = "";
        switch (prodi) {
            case 2:
                prodiStr = "Teknik Informatika";
                break;
            case 3:
                prodiStr = "Teknik Komputer";
                break;
            case 4:
                prodiStr = "Sistem Informasi";
                break;
            case 6:
                prodiStr = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodiStr = "Teknologi Informasi";
                break;
            default:
                prodiStr = "Prodi tidak dikenal";
        }
        return String.format("%s, %d", prodiStr, 2000 + angkatan);
    }

    public double getBeasiswa() {
        if (ipk >= 3.5 && ipk <= 4)
            return 75.0;
        else if (ipk >= 3 && ipk < 3.5)
            return 50.0;
        else
            return 0.0;
    }
    
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }
    public String toString() {
        return String.format("%s%n" +
                             "nim            : %s%n" +
                             "ipk            : %.1f%n" +
                             "status         : %s%n",
                             super.toString(), nim, ipk, getStatus());
    }
}
