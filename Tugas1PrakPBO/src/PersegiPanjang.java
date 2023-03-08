public class PersegiPanjang implements MenghitungBidang{
    private float panjang, lebar;
    
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float keliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public float luas() {
        return panjang*lebar;
    }
    
}
