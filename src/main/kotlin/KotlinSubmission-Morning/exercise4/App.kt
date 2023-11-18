package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    println("contoh try sukses :")
    checkSuccess()
    println("contoh try gagal :")
    checkFailed()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun checkSuccess(){
        var number = listOf(1,2,3)
        try {
            println(number[2])
        }
        catch (e:Exception){
            println("data yang anda masukkan tidak valid")
        }
    }
fun checkFailed(){
    var number = listOf(1,2,3)
    try {
        println(number[4])
    }
    catch (e:Exception){
        println("data yang anda masukkan tidak valid")
    }
}
