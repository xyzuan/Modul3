package id.xyzprjkt.LKVBangun;

public class VBangun3D {
    private double Volume;

    protected void inputData(String Data) {
        System.out.print("Masukkan " + Data + " : ");
    }

    protected void hitungVolume(String Bangun){
        // Placeholder for Volume Operation isHere
        System.out.println("Volume dari Bangun " + Bangun + " tersebut adalah " + getVolume());
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }
}
