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

class PersegiPanjang : LKBangun2D() {
    var panjang = 0.0
    var lebar = 0.0
    public override fun hitungKeliling(Bangun: String) {
        keliling = panjang * 2 + lebar * 2
        super.hitungKeliling(Bangun)
    }

    public override fun hitungLuas(Bangun: String) {
        luas = panjang * lebar
        super.hitungLuas(Bangun)
    }
}