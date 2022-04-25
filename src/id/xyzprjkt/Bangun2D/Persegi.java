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

public class Persegi extends id.xyzprjkt.LKVBangun.LKBangun2D {
    private double Sisi;

    @Override
    public void hitungKeliling(String Bangun) {
        this.setKeliling(getSisi() * 4);
        super.hitungKeliling(Bangun);
    }
    @Override
    public void hitungLuas(String Bangun) {
        this.setLuas(getSisi() * getSisi());
        super.hitungLuas(Bangun);
    }

    public double getSisi() {
        return Sisi;
    }

    public void setSisi(double sisi) {
        Sisi = sisi;
    }
}