package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Anggi Putri"
    val lastName = "Meriani"
    val Alamat = "Kuningan, Jawa Barat"
    val age = 21
    val isNotSingle = true
    val keterangan = "Menti Mobile Development di Infinite Learning"

    println("Nama : $firstName $lastName")
    println("Alamat : $Alamat")
    println("Umur : $age tahun")
    if (isNotSingle) {
        println("Status = Tidak Single")
    } else {
        println("Status = Single")
    }
    println("keterangan : $keterangan")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama Team Marge : $groupId")

    println("Anggota : ")
    var i = 0
    for(member in groupMember) {
        i++
        println("$i. $member")
    }

    println("Sesi : $session")

    return """
        Informasi Team
        Grup : $groupId
        Anggota : ${groupMember.size}
        Sesi : $session
    """.trimIndent()
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val member = listOf(
        "Adella Maulana Annur Ramadhan (WEB)",
        "Ahmad Yusup (MOBILE)",
        "Alvito Kurnia Fahrio (WEB)",
        "Anggi Putri Meriani (MOBILE)",
        "Billy Dwi Prakoso (WEB)",
        "Dimas Anggoro Harahap (MOBILE)",
        "Fadhlan Akbarullah (WEB)",
        "Inayatul maula (MOBILE)",
        "Muhammad Zaki Raihan (WEB)",
        "Rafi Kahfi Yugi (WEB)",
        "Yassar Muwwafaq (MOBILE)")

    val myName = member.get(3)

    return listOf(myName)
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Joy", "Maulana")
    val countOfGroup = arrayOf<String>(
        "Adella Maulana Annur Ramadhan (WEB)",
        "Ahmad Yusup (MOBILE)",
        "Alvito Kurnia Fahrio (WEB)",
        "Anggi Putri Meriani (MOBILE)",
        "Billy Dwi Prakoso (WEB)",
        "Dimas Anggoro Harahap (MOBILE)",
        "Fadhlan Akbarullah (WEB)",
        "Inayatul maula (MOBILE)",
        "Muhammad Zaki Raihan (WEB)",
        "Rafi Kahfi Yugi (WEB)",
        "Yassar Muwwafaq (MOBILE)")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("BingBang & Dinosaur", listOf("Adella Maulana Annur Ramadhan (WEB)", "Ahmad Yusup (MOBILE)", "Alvito Kurnia Fahrio (WEB)","Anggi Putri Meriani (MOBILE)","Billy Dwi Prakoso (WEB)", "Dimas Anggoro Harahap (MOBILE)", "Fadhlan Akbarullah (WEB)", "Inayatul maula (MOBILE)", "Muhammad Zaki Raihan (WEB)", "Rafi Kahfi Yugi (WEB)", "Yassar Muwwafaq (MOBILE)"), "Pagi")

}