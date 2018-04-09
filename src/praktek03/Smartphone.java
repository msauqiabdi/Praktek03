package praktek03;

public class Smartphone {
    private String os;
    private String merk;
    private String warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("Os \t: "+os+"\n"+
                "Merk \t: "+merk+"\n"+
                "Warna \t: "+warna+"\n"+
                "Harga \t: "+harga);
    } 

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
