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

public class VBangun3D {
    protected double Volume;

    protected void inputData(String Data) {
        System.out.print("Masukkan " + Data + " : ");
    }

    protected void hitungVolume(String Bangun){
        // Placeholder for Volume Operation isHere
        System.out.println("Volume dari Bangun " + Bangun + " tersebut adalah " + getVolume());
    }

    protected double getVolume() {
        return Volume;
    }

    protected void setVolume(double volume) {
        Volume = volume;
    }
}
