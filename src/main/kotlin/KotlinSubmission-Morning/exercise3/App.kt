package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini
    val score = 90

    if (score >= 90) {
        var result = "Selamat! Anda mendapatkan nilai  A"
        println(result)
    } else if (score >= 80) {
        var result = "Anda mendapatkan nilai B"
        println(result)
    } else if (score >= 70) {
        var result = "Anda mendapatkan nilai C"
        println(result)
    } else if (score >= 60) {
        var result = "Anda mendapatkan nilai D"
        println(result)
    } else {
        var result = "Anda mendapatkan nilai E"
        println(result)
    }
}