public class Balok extends PersegiPanjang implements MenghitungRuang{
    private float tinggi; // tinggi balok
    
    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    

    // overload method kali()
        public float kali(int a, float b){
            return a * b;
        }
        // overload method kali()
        public float kali(float a, float b){
            return a * b;
        }


        // @Override // overriding method luas_per() dari interface MenghitungRuang
        public float luas_per() {
            return kali(2, luas()) +kali(keliling(), tinggi);
        }

        // @Override // overriding method volume() dari interface MenghitungRuang
        public double volume() {
            return kali(luas(), tinggi);
        }

        @Override // overriding method cetak() dari interface MenghitungRuang over_write
        public void cetak(){
            System.out.println("Luas Persegi Panjang \t\t= " + super.luas());
            System.out.println("Keliling Persegi Panjang \t= " + super.keliling());
            System.out.println("Luas Permukaan Balok \t\t= "+luas_per());
            System.out.println("Volume Balok \t\t\t= "+volume());

        }
}
