package id.xyzprjkt.Bangun3D;

public class Kubus extends id.xyzprjkt.LKVBangun.VBangun3D{
    private double rusuk;

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume( getRusuk() * getRusuk() * getRusuk());
        super.hitungVolume(Bangun);
    }

    public double getRusuk() {
        return rusuk;
    }

    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }
}
