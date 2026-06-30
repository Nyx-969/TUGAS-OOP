# Sistem Informasi Nilai Mahasiswa

## Deskripsi

Sistem Informasi Nilai Mahasiswa merupakan aplikasi desktop berbasis Java yang dikembangkan untuk membantu proses pengelolaan data akademik. Aplikasi ini menyediakan fitur pengelolaan data mahasiswa, dosen, mata kuliah, Kartu Rencana Studi (KRS), serta input nilai mahasiswa.

Project ini dibuat sebagai tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)** dengan menerapkan konsep **Object Oriented Programming (OOP)** dan arsitektur **Model View Controller (MVC)**.

---

## Fitur

* Login User
* CRUD Data Mahasiswa
* CRUD Data Dosen
* CRUD Data Mata Kuliah
* CRUD Data KRS
* Input Nilai Mahasiswa
* Pencarian Data (Search)
* Pagination
* Validasi Input pada Controller
* Penyimpanan Data Menggunakan MySQL

---

## Teknologi yang Digunakan

* Java
* Java Swing
* NetBeans IDE
* MySQL
* JDBC
* MVC (Model View Controller)
* DAO (Data Access Object)

---

## Struktur Project

```text
Nilai Mahasiswa/
│
├── sql/
│   ├── schema.sql
│   ├── mahasiswa_raw.csv.enc
│   └── data_mahasiswa_raw.sql.enc
│
├── src/
│   └── nilaimahasiswa/
│       │
│       ├── controller/
│       │   ├── CourseController.java
│       │   ├── KrsController.java
│       │   ├── LecturerController.java
│       │   ├── StudentController.java
│       │   └── UserController.java
│       │
│       ├── dao/
│       │   ├── CourseDAO.java
│       │   ├── KrsDAO.java
│       │   ├── LecturerDAO.java
│       │   ├── StudentDAO.java
│       │   └── UserDAO.java
│       │
│       ├── model/
│       │   ├── Course.java
│       │   ├── KRS.java
│       │   ├── Lecturer.java
│       │   ├── Person.java
│       │   ├── Student.java
│       │   └── User.java
│       │
│       ├── util/
│       │   └── DatabaseConnection.java
│       │
│       ├── view/
│       │   ├── Dashboard.java
│       │   ├── Dashboard.form
│       │   ├── LoginForm.java
│       │   ├── LoginForm.form
│       │   ├── UITheme.java
│       │   ├── panelMahasiswa.java
│       │   ├── panelMahasiswa.form
│       │   ├── panelDosen.java
│       │   ├── panelDosen.form
│       │   ├── panelMataKuliah.java
│       │   ├── panelMataKuliah.form
│       │   ├── panelInputNilai.java
│       │   └── panelInputNilai.form
│       │
│       └── NilaiMahasiswa.java
│
├── nbproject/
├── build.xml
├── manifest.mf
└── README.md
```

---

## Database

Database aplikasi disimpan pada folder `sql/`.

Isi folder tersebut terdiri dari:

| File                         | Keterangan                                                          |
| ---------------------------- | ------------------------------------------------------------------- |
| `schema.sql`                 | Struktur database aplikasi.                                         |
| `mahasiswa_raw.csv.enc`      | Data mahasiswa dalam format CSV yang telah dienkripsi.              |
| `data_mahasiswa_raw.sql.enc` | Data SQL terenkripsi yang digunakan sebagai data pendukung project. |

### Import Database

1. Jalankan MySQL Server.
2. Buat database baru, misalnya:

```sql
CREATE DATABASE db_nilai_mahasiswa;
```

3. Import file `schema.sql`.
4. Sesuaikan konfigurasi database pada `DatabaseConnection.java` apabila diperlukan.
5. Jalankan aplikasi.

---

## Penerapan MVC

Project ini menggunakan pola **Model View Controller (MVC)**.

### Model

Model digunakan untuk merepresentasikan data yang digunakan aplikasi, seperti:

* Student
* Lecturer
* Course
* KRS
* User
* Person

### View

View bertugas menampilkan antarmuka pengguna dan menerima input dari pengguna.

Beberapa tampilan yang tersedia antara lain:

* Login
* Dashboard
* Panel Mahasiswa
* Panel Dosen
* Panel Mata Kuliah
* Panel Input Nilai

### Controller

Controller menangani logika bisnis aplikasi, seperti:

* Validasi data
* Menyimpan data
* Mengubah data
* Menghapus data
* Melakukan pencarian
* Mengatur pagination
* Menghubungkan View dengan DAO

### DAO

DAO digunakan sebagai lapisan akses database sehingga Controller tidak berhubungan langsung dengan query SQL.

---

## Penerapan OOP

Project ini menerapkan beberapa konsep Object Oriented Programming, antara lain:

### Encapsulation

Data pada setiap model dibuat menggunakan atribut private dan diakses melalui getter dan setter.

### Inheritance

Class yang memiliki hubungan pewarisan menggunakan konsep inheritance untuk mengurangi duplikasi kode.

### Object

Setiap data direpresentasikan dalam bentuk object sehingga memudahkan pengolahan data.

### Separation of Responsibility

Setiap class memiliki tanggung jawab yang berbeda sesuai fungsi masing-masing sehingga kode lebih terstruktur.

---

## Cara Menjalankan

1. Clone atau download project.
2. Import project ke NetBeans.
3. Import database menggunakan file `schema.sql`.
4. Sesuaikan konfigurasi koneksi database.
5. Build project.
6. Jalankan file `NilaiMahasiswa.java`.
7. Login menggunakan akun yang tersedia pada aplikasi.

---

## Fitur yang Didemonstrasikan

* Login
* CRUD Mahasiswa
* CRUD Dosen
* CRUD Mata Kuliah
* CRUD KRS
* Input Nilai
* Search
* Pagination
* Validasi Data

---

## Author

**Nama** : Yabes Paskah Sinaga

**NIM** : 2515101107

**Program Studi** : Ilmu Komputer

---

## Catatan

Project ini dikembangkan sebagai tugas mata kuliah Pemrograman Berorientasi Objek dengan tujuan menerapkan konsep OOP, MVC, DAO, CRUD, Search, Pagination, serta logika sederhana pada Controller sesuai dengan ketentuan tugas yang diberikan.
