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

open class LKBangun2D {
    var luas = 0.0
    var keliling = 0.0
    fun inputData(Data: String) {
        print("Masukkan $Data : ")
    }

    protected open fun hitungKeliling(Bangun: String) {
        // Placeholder for Keliling Operation isHere
        println("Keliling dari Bangun $Bangun tersebut adalah $keliling")
    }

    protected open fun hitungLuas(Bangun: String) {
        // Placeholder for Luas Operation isHere
        println("Luas dari Bangun $Bangun tersebut adalah $luas")
    }
}