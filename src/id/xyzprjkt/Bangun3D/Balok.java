package id.xyzprjkt.Bangun3D;

public class Balok extends id.xyzprjkt.LKVBangun.VBangun3D{
    private double panjang, lebar, tinggi;

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume( getPanjang() * getLebar() * getTinggi() );
        super.hitungVolume(Bangun);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
