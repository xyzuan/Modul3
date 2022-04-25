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

package Bangun2D;

public class Segitiga extends id.xyzprjkt.lkbangun.LKBangun2D {
    private double Alas, Tinggi;

    @Override
    public void hitungKeliling(String Bangun) {
        this.setKeliling(( 2 * (Math.sqrt(Math.pow(0.5 * getAlas(), 2) + Math.pow(getTinggi(), 2))) + getAlas()));
        super.hitungKeliling(Bangun);
    }
    @Override
    public void hitungLuas(String Bangun) {
        this.setLuas(( 0.5 * getAlas() * getTinggi()));
        super.hitungLuas(Bangun);
    }

    public double getAlas() {
        return Alas;
    }

    public void setAlas(double alas) {
        Alas = alas;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double tinggi) {
        Tinggi = tinggi;
    }
}