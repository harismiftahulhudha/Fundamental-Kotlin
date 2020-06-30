fun main () {
    var nama: String = "haris "
    var kalimat: String = "nama saya adalah "
    var perkenalan: String = kalimat + nama
    println(perkenalan)

    nama = "hudha "
    var namaSaya: String = "nama saya adalah ${nama}"
    println(namaSaya)

    var panjang: Int = 4
    var lebar: Int = 5
    var kelilingPersegiPanjang: Int = panjang + lebar + panjang + lebar
    println("keliling persegi panjang adalah ${kelilingPersegiPanjang}")

    var hasilPengurangan: Int = kelilingPersegiPanjang - panjang
    println("hasil pengurangan dari ${kelilingPersegiPanjang} - ${panjang} adalah ${hasilPengurangan}")

    var luasPersegiPanjang: Int = panjang * lebar
    println("hasil dari luas persegi panjang ${panjang} * ${lebar} adalah ${luasPersegiPanjang}")

    var hasilPembagian: Int = luasPersegiPanjang / lebar
    println("hasil dari pembagian ${luasPersegiPanjang} / ${lebar} adalah ${hasilPembagian}")

    var hasilModulus: Int = 7 % 3
    println("hasil dari 7 % 3 adalah ${hasilModulus}")

    // 3 * 2 = 6 + 1 = 7

    var kelvin: Double = 5.0 / 9.0 * (20 - 23) + 273.0
    println(kelvin)
}

/**
 * var = mutable = dapat dirubah nilainya / datanya
 * val = immutable = tidak dapat dirubah nilainya / datanya
 */

/**
 * Operator aritmatika Penjumlahan menggunakan simbol tambah atau plus (+)
 * Operator aritmatika Pengurangan menggunakan simbol kurang (-)
 * Operator aritmatika Perkalian menggunakan simbol bintang (*)
 * Operator aritmatika Pembagian menggunakan simbol garis miring (/)
 * Operator aritmatika Sisa bagi / Modulus menggunakan simbol persen (%)
 */

/**
 * 1. "saya "
 * 2. "adalah "
 * 3. "budi"
 * hasil = "saya adalah budi"
 */






















