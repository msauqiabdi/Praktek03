package praktek03;
public class SmartphoneAksi {
    public static void main (String[] args) {
        Smartphone s = new Smartphone();
     
     s.setOs    ("Android");
     s.setMerk  ("Samsung S9");
     s.setWarna ("Silver");
     s.setHarga (5000000);
    
     s.cetakInfo();
    }
}
