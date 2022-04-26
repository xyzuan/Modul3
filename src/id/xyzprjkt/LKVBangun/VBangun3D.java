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

import java.util.Objects;

public class VBangun3D {
    protected double Volume;

    protected void inputData(String Data) {
        if(
           /*
              This list object are will be used for inputData Operation
              It need to be change the if function and add setter function
              between this equal object depend on the shape
           */
                Objects.equals(Data, "Sisi") ||
                Objects.equals(Data, "Rusuk") ||
                Objects.equals(Data, "Panjang") ||
                Objects.equals(Data, "Lebar") ||
                Objects.equals(Data, "Tinggi") ||
                Objects.equals(Data, "JariJari"))
        {
            System.out.print("Masukkan " + Data + " : ");
            /*
               Placeholder for inputData Setter Function
               Example :
                    super.inputData(Data);
                    Scanner in = new Scanner(System.in);
                    setSisi(in.nextDouble());
            */
        }
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
