fun main () {
    val nyawa: Int = 5
    if (nyawa < 1) {
        println("Permainan Selesai")
    }

    if (nyawa > 1) {
        println("Permainan Belum Selesai")
    }

    if (nyawa == 3) {
        println("Total Nyawa Adalah 3")
    }

    if (nyawa != 3) {
        println("Total Nyawa bukan 3")
    }

    if (nyawa >= 3) {
        println("Total Nyawa lebih besar atau sama dengan 3")
    }

    if (nyawa <= 3) {
        println("Total Nyawa lebih kecil atau sama dengan 3")
    }



    if (nyawa < 1) {
        println("Permainan Selesai")
    } else {
        println("Permainan Belum Selesai")
    }



    if (nyawa < 1) {
        println("Permainan Selesai")
    } else if (nyawa == 3) {
        println("Total Nyawa Tersisa 3")
    } else if (nyawa == 4) {
        println("Total Nyawa Tersisa 4")
    } else {
        println("Total Nyawa melebihi Batas")
    }


    if (nyawa > 0 && nyawa < 100) {
        println("Total nyawa berada di rentang 0 - 100")
    }

    if (nyawa > 0 || nyawa == 4) {
        println("Total nyawa lebih dari 0 atau tersisa 4")
    }

    if (!(nyawa < 0)) {
        println("Nyawa anda masih tersisah")
    }

    when(nyawa) {
        4 -> {
            println("Nyawa tersisa 4")
        }
        5 -> {
            println("Nyawa tersisa 5")
        }
        else -> {
            println("Nyawa melebihi batas")
        }
    }
}

/**
 * KONDISI / PERCABANGAN
 * 1. IF merupakan struktur percabangan yang paling sederhana karena hanya melibatkan 1 buah ekspresi untuk di periksa.
 *       jika bernilai salah atau false, maka perintah yang ada di dalam IF ini tidak akan di kerjakan.
 * 2. IF-ELSE merupakan struktur percabangan yang terdiri dari 2 kondisi. Dalam struktur ini terdapat 2 statemen yaitu,
 *            statemen yang dikerjakan jika kondisi bernilai benar dan statemen yang dikerjakan jika kondisi bernilai salah.
 * 3. IF-ELSE-IF merupakan perluasan dari struktur percabangan dengan 1 kondisi atau 2 kondisi atau lebih dari 2 kondisi.
 * 4. WHEN merupakan percabangan yang hampir sama dengan IF-ELSE-IF. Perbedaannya, WHEN hanya dipakai ketika memiliki 1 data pembanding saja.
 *
 *
 * OPERATOR PEMBANDING
 * 1. Lebih Besar untuk membandingkan 2 data mana yang lebih besar. Penulisan sintaks menggunakan simbol (>).
 *    contoh: 3 > 1
 * 2. Lebih Kecil untuk membandingkan 2 data mana yang lebih kecil. Penulisan sintaks menggunakan simbol (<).
 *    contoh: 1 < 3
 * 3. Sama Dengan untuk membandingkan apakah 2 datanya sama. Penulisan sintaks menggunakan simbol (==)
 *    contoh: 3 == 3
 * 4. Tidak Sama Dengan untuk membandingkan apakah 2 datanya tidak sama. Penulisan sintaksnya menggunakan simbol (!=)
 *    contohnya: 3 != 1
 * 5. Lebih Besar atau Sama Dengan untuk membandingkan 2 data mana yang lebih besar atau sama dengan data yang dibandingkan.
 *    Penulisan sintaks menggunakan simbol (>=)
 *    contoh: 3 >= 1
 * 6. Lebih Kecil atau Sama Dengan untuk membandingkan 2 data mana yang lebih kecil atau sama dengan data yang dibandingkan.
 *    Penulisan sintaks menggunakan simbol (<=)
 *    contoh: 1 <= 3
 *
 *
 * OPERATOR LOGIKA
 * operator logika adalah operator yang digunakan untuk membandingkan 2 kondisi logika.
 * yaitu logika benar dan logika salah
 * 1. AND penulisan sintaks menggunakan simbol (&&)
 * 2. OR penulisan sintaks menggunakan simbol (||)
 * 3. Negasi / Kebalikan penulisan sintaks menggunakn simbol (!)
 */





















