class Produk(
    val nama: String,
    val harga: Double,
    var stok: Int
) {
    fun tampilkanInformasi() {
        println("Nama Produk: $nama")
        println("Harga: $harga")
        println("Stok: $stok")
    }

    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("$jumlah $nama berhasil dibeli.")
        } else {
            println("Stok tidak mencukupi. Stok saat ini: $stok")
        }
    }
}

fun main() {
    val produk = Produk("Laptop", 7000000.0, 10)

    produk.tampilkanInformasi()

    produk.beliProduk(5)

    produk.tampilkanInformasi()
}