public class Segitiga {
    int alas;
    int Tinggi;
    private int tinggi;

    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.Tinggi = Tinggi;
    }
    public int getAlas(){
        return this.alas;
    }
    public int getTinggi(){
        return this.Tinggi;
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void Segitiga(int alas,int tinggi){
        System.out.println();
    }
    public float luas(){
        return (float) (0.5*alas*tinggi);
    }
    public void gambar(){
        System.out.println();
    }

}
