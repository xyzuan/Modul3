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
package id.xyzprjkt.Bangun2D

import id.xyzprjkt.LKVBangun.LKBangun2D
import kotlin.math.*

class Segitiga : LKBangun2D() {
    var alas = 0.0
    var tinggi = 0.0
    public override fun hitungKeliling(Bangun: String) {
        keliling = 2 * sqrt((0.5 * alas).pow(2.0) + tinggi.pow(2.0)) + alas
        super.hitungKeliling(Bangun)
    }

    public override fun hitungLuas(Bangun: String) {
        luas = 0.5 * alas * tinggi
        super.hitungLuas(Bangun)
    }
}