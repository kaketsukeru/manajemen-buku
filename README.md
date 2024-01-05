# manajemen-buku
Untuk tes seleksi Javan

[README]
Petunjuk:
- Buka project di IDE
- Import "library.sql" ke MySql
- Buka src/resources/application.properties, ganti spring.datasource.username dan spring.datasource.password yang sesuai dengan credentials MySQL Anda
- Buka terminal dan ketikkan "mvn install" untuk menginstall semua dependency dalam project
- Lalu "mvn spring-boot:run" untuk menjalankan project
- Buka PostMan, pilih method GET, dan ketikkan URL http://localhost:8080/books untuk menampilkan semua daftar buku
- Pilih method GET, dan buka http://localhost:8080/books/{ID} untuk menampilkan detail buku tersebut
- Pilih method POST, dan buka http://localhost:8080/books untuk menambah daftar buku. Parameter yang diisi adalah (title, author, year, isbn, pages, country, genre, language)
- Pilih method PUT, dan buka http://localhost:8080/books untuk mengedeit detail buku. Parameter yang diisi adalah (id, title, author, year, isbn, pages, country, genre, language)
- Pilih method DELETE, dan buka http://localhost:8080/books/{ID} untuk menghapus buku yang dipilih