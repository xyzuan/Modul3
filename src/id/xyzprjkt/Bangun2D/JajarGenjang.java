/*
 * Copyright (C) 2022 xyzuan ( Jody Yuantoro )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package id.xyzprjkt.Bangun2D;

public class JajarGenjang extends id.xyzprjkt.LKVBangun.LKBangun2D {
    private double alas, tinggi, miring;

    @Override
    public void hitungKeliling(String Bangun) {
        this.setKeliling(( 2 * ( getAlas() + getMiring())));
        super.hitungKeliling(Bangun);
    }

    @Override
    public void hitungLuas(String Bangun) {
        this.setLuas(( getAlas() * getTinggi()));
        super.hitungLuas(Bangun);
    }

    private double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    private double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double getMiring() {
        return miring;
    }

    public void setMiring(double miring) {
        this.miring = miring;
    }
}