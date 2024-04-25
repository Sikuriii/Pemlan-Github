package Tugas4;

class Manager extends Pekerja {
    private String departemen;

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * getGaji());
    }

    public String toString() {
        return String.format("%s" +
                             "departemen     : %s%n",
                             super.toString(), departemen);
    }
}