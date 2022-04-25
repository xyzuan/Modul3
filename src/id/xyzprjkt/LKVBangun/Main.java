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

import java.util.Scanner;

/* 2D Chill Class
   Including : Persegi, Persegi Panjang, Belah Ketupat, Jajar Genjang
               Lingkaran, Segitiga.
*/
import id.xyzprjkt.Bangun2D.*;

/* 3D Chill Class
   Including : Kubus, Balok, Tabung, Bola.
*/
import id.xyzprjkt.Bangun3D.*;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.MainMenu();
    }

    public void MainMenu(){
        Scanner in = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("""
                =========================================================
                Selamat Datang di Aplikasi LKV
                Menghitung Luas Keliling Volume Akan Menjadi Mudah
                =========================================================""");
        System.out.println("1. Menghitung Bangun 2 Dimensi\n2. Menghitung Bangun 3 Dimensi\n0. Keluar");
        System.out.print("Pilih menu : ");
        int pilihMenu = in.nextInt();
        if (pilihMenu == 1){
            obj.hitung2D();
        } else if (pilihMenu == 2){
            obj.hitung3D();
        } else {
            System.exit(0);
        }
    }

    public void hitung2D(){
        Scanner in = new Scanner(System.in);
        char backMenu;
        do {
            System.out.println("Aplikasi Penghitung Luas & Keliling Bangun Datar");
            System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Belah Ketupat\n0. Kembali");
            System.out.print("Pilih menu : ");
            int menu = in.nextInt();
            String isBangun;
            switch (menu) {
                case 1 -> {
                    isBangun = "Persegi";
                    Persegi psg = new Persegi();
                    psg.inputData("Sisi"); psg.setSisi(in.nextDouble());
                    psg.hitungKeliling(isBangun); psg.hitungLuas(isBangun);
                }
                case 2 -> {
                    isBangun = "Persegi Panjang";
                    PersegiPanjang psgp = new PersegiPanjang();
                    psgp.inputData("Panjang"); psgp.setPanjang(in.nextDouble());
                    psgp.inputData("Lebar"); psgp.setLebar(in.nextDouble());
                    psgp.hitungKeliling(isBangun); psgp.hitungLuas(isBangun);
                }
                case 3 -> {
                    isBangun = "Segitiga";
                    Segitiga sgt = new Segitiga();
                    sgt.inputData("Alas"); sgt.setAlas(in.nextDouble());
                    sgt.inputData("Tinggi"); sgt.setTinggi(in.nextDouble());
                    sgt.hitungKeliling(isBangun); sgt.hitungLuas(isBangun);
                }
                case 4 -> {
                    isBangun = "Lingkaran";
                    Lingkaran crcl = new Lingkaran();
                    crcl.inputData("jari - jari"); crcl.setJarijari(in.nextDouble());
                    crcl.hitungKeliling(isBangun); crcl.hitungLuas(isBangun);
                }
                case 5 -> {
                    isBangun = "Jajar Genjang";
                    JajarGenjang jg = new JajarGenjang();
                    jg.inputData("Alas"); jg.setAlas(in.nextDouble());
                    jg.inputData("Tinggi"); jg.setTinggi(in.nextDouble());
                    jg.inputData("Sisi Miring"); jg.setMiring(in.nextDouble());
                    jg.hitungKeliling(isBangun); jg.hitungLuas(isBangun);
                }
                case 6 -> {
                    isBangun = "Belah Ketupat";
                    BelahKetupat bk = new BelahKetupat();
                    bk.inputData("Sisi");
                    bk.setSisi(in.nextDouble());
                    bk.inputData("Diagonal-1"); bk.setD1(in.nextDouble());
                    bk.inputData("Diagonal-2"); bk.setD2(in.nextDouble());
                    bk.hitungKeliling(isBangun); bk.hitungLuas(isBangun);
                }
                case 0 -> MainMenu();
            }
            System.out.print("Kembali ke menu ? Y/n : ");
            backMenu = in.next().charAt(0);
        } while (backMenu == 'Y' || backMenu == 'y');
    }

    public void hitung3D(){
        Scanner in = new Scanner(System.in);
        char backMenu;
        do {
            System.out.println("Aplikasi Penghitung Volume Bangun Ruang");
            System.out.println("1. Kubus\n2. Balok\n3. Tabung\n4. Bola\n0. Kembali");
            System.out.print("Pilih bangun ruang yang ingin di hitung : ");
            int menu = in.nextInt();
            String isBangun;
            switch (menu) {
                case 1 -> {
                    isBangun = "Kubus";
                    Kubus cube = new Kubus();
                    cube.inputData("Rusuk"); cube.setRusuk(in.nextDouble());
                    cube.hitungVolume(isBangun);
                }
                case 2 -> {
                    isBangun = "Balok";
                    Balok blk = new Balok();
                    blk.inputData("Panjang"); blk.setPanjang(in.nextDouble());
                    blk.inputData("Lebar"); blk.setLebar(in.nextDouble());
                    blk.inputData("Tinggi"); blk.setTinggi(in.nextDouble());
                    blk.hitungVolume(isBangun);
                }
                case 3 -> {
                    isBangun = "Tabung";
                    Tabung tb = new Tabung();
                    tb.inputData("Jari - jari"); tb.setJarijari(in.nextDouble());
                    tb.inputData("Tinggi"); tb.setTinggi(in.nextDouble());
                    tb.hitungVolume(isBangun);
                }
                case 4 -> {
                    isBangun = "Bola";
                    Bola ball = new Bola();
                    ball.inputData("Jari - jari"); ball.setJarijari(in.nextDouble());
                    ball.hitungVolume(isBangun);
                }
                case 0 -> MainMenu();
            }
            System.out.print("Kembali ke menu ? Y/n : ");
            backMenu = in.next().charAt(0);
        } while (backMenu == 'Y' || backMenu == 'y');
    }
}