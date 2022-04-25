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
package id.xyzprjkt.LKVBangun

import id.xyzprjkt.Bangun2D.Persegi
import id.xyzprjkt.Bangun2D.PersegiPanjang
import id.xyzprjkt.Bangun2D.Segitiga
import id.xyzprjkt.Bangun2D.Lingkaran
import id.xyzprjkt.Bangun2D.JajarGenjang
import id.xyzprjkt.Bangun2D.BelahKetupat
import id.xyzprjkt.Bangun3D.Kubus
import id.xyzprjkt.Bangun3D.Balok
import id.xyzprjkt.Bangun3D.Tabung
import id.xyzprjkt.Bangun3D.Bola
import java.util.*
import kotlin.jvm.JvmStatic
import kotlin.system.exitProcess

/* 2D & 3D Chill Class
   Including 2D : Persegi, Persegi Panjang, Belah Ketupat, Jajar Genjang
                  Lingkaran, Segitiga.
   Including 3D : Kubus, Balok, Tabung, Bola.
*/   class Main {
    var `in` = Scanner(System.`in`)
    private var isBangun: String? = null
    private var backMenu = 0.toChar()
    fun mainMenu() {
        val obj = Main()
        println(/* !!! Hit visitElement for element type: class org.jetbrains.kotlin.nj2k.tree.JKErrorExpression !!! */)
        println("1. Menghitung Bangun 2 Dimensi\n2. Menghitung Bangun 3 Dimensi\n0. Keluar")
        print("Pilih menu : ")
        when (`in`.nextInt()) {
            1 -> {
                obj.hitung2D()
            }
            2 -> {
                obj.hitung3D()
            }
            else -> {
                exitProcess(0)
            }
        }
    }

    private fun hitung2D() {
        do {
            println("Aplikasi Penghitung Luas & Keliling Bangun Datar")
            println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Belah Ketupat\n0. Kembali")
            print("Pilih menu : ")
            when (`in`.nextInt()) {
                1 -> {
                    isBangun = "Persegi"
                    val psg = Persegi()
                    psg.inputData("Sisi")
                    psg.sisi = `in`.nextDouble()
                    psg.hitungKeliling(isBangun!!)
                    psg.hitungLuas(isBangun!!)
                }
                2 -> {
                    isBangun = "Persegi Panjang"
                    val psgp = PersegiPanjang()
                    psgp.inputData("Panjang")
                    psgp.panjang = `in`.nextDouble()
                    psgp.inputData("Lebar")
                    psgp.lebar = `in`.nextDouble()
                    psgp.hitungKeliling(isBangun!!)
                    psgp.hitungLuas(isBangun!!)
                }
                3 -> {
                    isBangun = "Segitiga"
                    val sgt = Segitiga()
                    sgt.inputData("Alas")
                    sgt.alas = `in`.nextDouble()
                    sgt.inputData("Tinggi")
                    sgt.tinggi = `in`.nextDouble()
                    sgt.hitungKeliling(isBangun!!)
                    sgt.hitungLuas(isBangun!!)
                }
                4 -> {
                    isBangun = "Lingkaran"
                    val crcl = Lingkaran()
                    crcl.inputData("jari - jari")
                    crcl.jarijari = `in`.nextDouble()
                    crcl.hitungKeliling(isBangun!!)
                    crcl.hitungLuas(isBangun!!)
                }
                5 -> {
                    isBangun = "Jajar Genjang"
                    val jg = JajarGenjang()
                    jg.inputData("Alas")
                    jg.alas = `in`.nextDouble()
                    jg.inputData("Tinggi")
                    jg.tinggi = `in`.nextDouble()
                    jg.inputData("Sisi Miring")
                    jg.miring = `in`.nextDouble()
                    jg.hitungKeliling(isBangun!!)
                    jg.hitungLuas(isBangun!!)
                }
                6 -> {
                    isBangun = "Belah Ketupat"
                    val bk = BelahKetupat()
                    bk.inputData("Sisi")
                    bk.sisi = `in`.nextDouble()
                    bk.inputData("Diagonal-1")
                    bk.d1 = `in`.nextDouble()
                    bk.inputData("Diagonal-2")
                    bk.d2 = `in`.nextDouble()
                    bk.hitungKeliling(isBangun!!)
                    bk.hitungLuas(isBangun!!)
                }
                0 -> mainMenu()
            }
            print("Kembali ke menu ? Y/n : ")
            backMenu = `in`.next()[0]
        } while (backMenu == 'Y' || backMenu == 'y')
    }

    private fun hitung3D() {
        do {
            println("Aplikasi Penghitung Volume Bangun Ruang")
            println("1. Kubus\n2. Balok\n3. Tabung\n4. Bola\n0. Kembali")
            print("Pilih bangun ruang yang ingin di hitung : ")
            when (`in`.nextInt()) {
                1 -> {
                    isBangun = "Kubus"
                    val cube = Kubus()
                    cube.inputData("Rusuk")
                    cube.rusuk = `in`.nextDouble()
                    cube.hitungVolume(isBangun!!)
                }
                2 -> {
                    isBangun = "Balok"
                    val blk = Balok()
                    blk.inputData("Panjang")
                    blk.panjang = `in`.nextDouble()
                    blk.inputData("Lebar")
                    blk.lebar = `in`.nextDouble()
                    blk.inputData("Tinggi")
                    blk.tinggi = `in`.nextDouble()
                    blk.hitungVolume(isBangun!!)
                }
                3 -> {
                    isBangun = "Tabung"
                    val tb = Tabung()
                    tb.inputData("Jari - jari")
                    tb.jarijari = `in`.nextDouble()
                    tb.inputData("Tinggi")
                    tb.tinggi = `in`.nextDouble()
                    tb.hitungVolume(isBangun!!)
                }
                4 -> {
                    isBangun = "Bola"
                    val ball = Bola()
                    ball.inputData("Jari - jari")
                    ball.jarijari = `in`.nextDouble()
                    ball.hitungVolume(isBangun!!)
                }
                0 -> mainMenu()
            }
            print("Kembali ke menu ? Y/n : ")
            backMenu = `in`.next()[0]
        } while (backMenu == 'Y' || backMenu == 'y')
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val obj = Main()
            obj.mainMenu()
        }
    }
}