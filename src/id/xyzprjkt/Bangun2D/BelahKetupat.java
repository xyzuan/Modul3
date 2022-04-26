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

import java.util.Objects;
import java.util.Scanner;

public class BelahKetupat extends id.xyzprjkt.LKVBangun.LKBangun2D{
    private double Sisi, d1, d2;

    @Override
    public void inputData(String Data) {
        if (Objects.equals(Data, "Sisi")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setSisi(in.nextDouble());
        } else if (Objects.equals(Data, "Diagonal-1")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setD1(in.nextDouble());
        } else if (Objects.equals(Data, "Diagonal-2")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setD2(in.nextDouble());
        } else {
            System.out.println("DEBUG : " + "Exception Parameters [" + Data + "] are not registered in the subclass" );        }
    }

    @Override
    public void hitungKeliling(String Bangun) {
        this.setKeliling(( 4 * getSisi()));
        super.hitungKeliling(Bangun);
    }
    @Override
    public void hitungLuas(String Bangun) {
        this.setLuas(( 0.5 * getD1() * getD2()));
        super.hitungLuas(Bangun);
    }

    private double getSisi() {
        return Sisi;
    }

    public void setSisi(double sisi) {
        Sisi = sisi;
    }

    private double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    private double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}