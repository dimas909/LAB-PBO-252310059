package Code;

class Hewan {    
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan");
    }
}

class Kucing extends Hewan { 
    void mengeong() {
        System.out.println(nama + " bilang: Meong");
    }
}

public class Nomor03 { 
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Tom";
        k.makan();      
        k.mengeong();  
    }
}