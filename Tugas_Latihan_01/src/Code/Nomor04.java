package Code;
public class Nomor04 {
    static class Hewan {
        void bersuara() { System.out.println("..."); }
    }
    static class Kucing extends Hewan {
        @Override void bersuara() { System.out.println("Meong"); }
    }
    static class Anjing extends Hewan {
        @Override void bersuara() { System.out.println("Guk guk"); }
    }
    public static void main(String[] args) {
        Hewan[] daftar = { new Kucing(), new Anjing(), new Hewan() };
        for (Hewan h : daftar) {
            h.bersuara();  
        }
    }
}

