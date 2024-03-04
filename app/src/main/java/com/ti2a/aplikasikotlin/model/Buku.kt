package com.ti2a.aplikasikotlin.model

class Buku(
    var judul: String,
    var pengarang: String,
    var tahunTerbit: Int,
    var jumlahHalaman: Int
) {
    fun tampilkanInfo() {
        println("Judul: $judul")
        println("Pengarang: $pengarang")
        println("Tahun Terbit: $tahunTerbit")
        println("Jumlah Halaman: $jumlahHalaman")
    }
}
