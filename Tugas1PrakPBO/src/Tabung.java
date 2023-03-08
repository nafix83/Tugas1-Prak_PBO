public class Tabung extends Lingkaran implements MenghitungRuang{
    private float tinggi;
    
    public Tabung(Float tinggi, Float jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    // buat yg overload aku masih kurang paham sih mbak , maaf klo salah
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
        // return ((keliling()*tinggi)+2*luas());
        return kali(keliling(), tinggi) + kali(2, luas());
    }

    // @Override // overriding method volume() dari interface MenghitungRuang
    public double volume() {
        // return luas()*tinggi;
        return kali(luas(), tinggi);
    }

    @Override // overriding method cetak() dari interface MenghitungRuang
    public void cetak(){
        System.out.println("Keliling        = " + super.keliling());
        System.out.println("Luas            = " + super.luas());
        System.out.println("Luas Permukaan  = " + luas_per());
        System.out.println("Volume          = " + volume());

    }
}
