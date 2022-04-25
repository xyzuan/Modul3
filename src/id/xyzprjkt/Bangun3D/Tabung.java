package id.xyzprjkt.Bangun3D;

public class Tabung extends id.xyzprjkt.LKVBangun.VBangun3D{
    private double jarijari;
    private double tinggi;

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume( Math.PI * getJarijari() * getJarijari() * getTinggi());
        super.hitungVolume(Bangun);
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
