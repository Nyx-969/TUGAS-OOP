CREATE DATABASE IF NOT EXISTS db_nilai_mahasiswa
    CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE db_nilai_mahasiswa;


-- Tabel users (login)
CREATE TABLE IF NOT EXISTS users (
    id       INT          NOT NULL AUTO_INCREMENT,
    username VARCHAR(50)  NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role     VARCHAR(20)  NOT NULL,
    PRIMARY KEY (id)
);

-- Tabel mahasiswa
CREATE TABLE IF NOT EXISTS mahasiswa (
    nim           VARCHAR(20)  NOT NULL,
    nama          VARCHAR(100) NOT NULL,
    prodi         VARCHAR(100) NOT NULL,
    angkatan      CHAR(4)      NOT NULL,
    PRIMARY KEY (nim)
);

-- Tabel dosen
CREATE TABLE IF NOT EXISTS dosen (
    nidn      VARCHAR(20)  NOT NULL,
    nama      VARCHAR(100) NOT NULL,
    keahlian  VARCHAR(100) NOT NULL,
    no_hp     VARCHAR(20)  NOT NULL,
    PRIMARY KEY (nidn)
);


-- Tabel mata_kuliah
CREATE TABLE IF NOT EXISTS mata_kuliah (
    kode      VARCHAR(20)  NOT NULL,
    nama      VARCHAR(100) NOT NULL,
    sks       TINYINT      NOT NULL,
    semester  TINYINT      NOT NULL,
    PRIMARY KEY (kode)
);

-- Tabel krs (nilai mahasiswa per mata kuliah)
-- grade dihitung di aplikasi, tidak disimpan di DB
CREATE TABLE IF NOT EXISTS krs (
    id           INT            NOT NULL AUTO_INCREMENT,
    nim          VARCHAR(20)    NOT NULL,
    kode_mk      VARCHAR(20)    NOT NULL,
    nilai        DECIMAL(5,2)   NOT NULL,
    semester     TINYINT        NOT NULL,
    tahun_ajaran VARCHAR(10)    NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (nim)     REFERENCES mahasiswa(nim)    ON DELETE CASCADE,
    FOREIGN KEY (kode_mk) REFERENCES mata_kuliah(kode) ON DELETE CASCADE
);

-- SEED DATA (dari DataStore.java)
INSERT INTO users (username, password, role) VALUES
    ('admin',  'admin123',  'Admin'),
    ('dosen',  'dosen123',  'Dosen');

INSERT INTO mahasiswa (nim, nama, prodi, angkatan) VALUES
    ('2515101107', 'Yabes Paskah Sinaga',          'Ilmu Komputer',    '2025'),
    ('2415091069', 'Ester Valeria Hutajulu',        'Sistem Informasi', '2024'),
    ('2415091092', 'GEDE DHANU PURNAYASA',          'Sistem Informasi', '2024'),
    ('1915091055', 'Yehuda Bezaleel Widiapratama',  'Sistem Informasi', '2019');

INSERT INTO dosen (nidn, nama, keahlian, no_hp) VALUES
    ('0012345601', 'I Ketut Purnamawan, S.Kom., M.Kom.', 'Basis Data',                  '081234567899'),
    ('0023456702', 'Ni Luh Putu Ardini, M.T.',           'Rekayasa Perangkat Lunak',    '081298765888');

INSERT INTO mata_kuliah (kode, nama, sks, semester) VALUES
    ('IF101', 'Pemrograman Java',          3, 1),
    ('IF205', 'Basis Data',                3, 3),
    ('IF301', 'Rekayasa Perangkat Lunak',  3, 5);

-- Contoh nilai (2 entri dari DataStore)
INSERT INTO krs (nim, kode_mk, nilai, semester, tahun_ajaran) VALUES
    ('2515101107', 'IF101', 88, 1, '2024/2025'),
    ('2515101107', 'IF205', 76, 3, '2024/2025');
