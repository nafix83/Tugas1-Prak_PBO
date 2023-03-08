abstract class Lingkaran implements MenghitungBidang{
    private float jari;

    
    public Lingkaran(Float jari) {
        this.jari = jari;
     }
    
    @Override // overriding method keliling() dari interface MenghitungBidang
    public float keliling() {
        return 2* (float) Math.PI*jari;
        }

    @Override // overriding method luas() dari interface MenghitungBidang
    public float luas() {
        return (float) Math.PI*jari*jari;
        }
}
