package praktek03;
public class SmartphoneAksi {
    public static void main (String[] args) {
        Smartphone s = new Smartphone();
     
     s.setOs    ("Android");
     s.setMerk  ("Samsung S9");
     s.setWarna ("Silver");
     s.setHarga (5000000);
     
     s.cetakInfo();
    
     System.out.print("Osnya   \t:");
     System.out.println(s.getOs());
     System.out.print("Merknya \t:");
     System.out.println(s.getMerk());
     System.out.print("Warnanya \t:");
     System.out.println(s.getWarna());
     System.out.print("Harganya \t:");
     System.out.println(s.getHarga());
    
     Handphone Hp = new Handphone();
     Hp.setMerk("Nokia");
     Hp.setWarna("Hitam");
     Hp.setHarga(500000);
     Hp.setMerkHandphone("Genggam");
     Hp.cetakInfo();
     System.out.println("Jenis \t:"+Hp.getMerkHandphone());
     Hp.throttle();
    }
    
}
