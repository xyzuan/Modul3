package id.xyzprjkt.Bangun3D;

public class Bola extends id.xyzprjkt.LKVBangun.VBangun3D{
    private double jarijari;

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume( ( 4 / 3) * Math.PI * Math.pow(getJarijari(), 3) );
        super.hitungVolume(Bangun);
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
