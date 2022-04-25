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
package id.xyzprjkt.LKVBangun;

public class LKBangun2D {
    protected double Luas, Keliling;

    protected void inputData(String Data) {
        System.out.print("Masukkan " + Data + " : ");
    }

    protected void hitungKeliling(String Bangun) {
        // Placeholder for Keliling Operation isHere
        System.out.println("Keliling dari Bangun " + Bangun + " tersebut adalah " + getKeliling());
    }

    protected void hitungLuas(String Bangun) {
        // Placeholder for Luas Operation isHere
        System.out.println("Luas dari Bangun " + Bangun + " tersebut adalah " + getLuas());
    }

    protected double getLuas() {
        return Luas;
    }

    protected void setLuas(double luas) {
        Luas = luas;
    }

    protected double getKeliling() {
        return Keliling;
    }

    protected void setKeliling(double keliling) {
        Keliling = keliling;
    }
}