package nilaimahasiswa.util;

import java.util.ArrayList;
import java.util.List;
import nilaimahasiswa.model.Course;
import nilaimahasiswa.model.KRS;
import nilaimahasiswa.model.Lecturer;
import nilaimahasiswa.model.Student;
import nilaimahasiswa.model.User;

/**
 * Penyimpanan data sederhana di memori (pengganti koneksi database)
 * supaya program ini bisa langsung dijalankan tanpa setup MySQL.
 * Semua DAO mengambil/menyimpan data lewat kelas ini.
 *
 * @author Ubai
 */
public class DataStore {
    public static final List<User> USERS = new ArrayList<>();
    public static final List<Student> STUDENTS = new ArrayList<>();
    public static final List<Lecturer> LECTURERS = new ArrayList<>();
    public static final List<Course> COURSES = new ArrayList<>();
    public static final List<KRS> KRS_LIST = new ArrayList<>();

    private static int krsAutoId = 1;

    public static int nextKrsId() {
        return krsAutoId++;
    }

    static {
        // Akun login bawaan
        USERS.add(new User(1, "admin", "admin123", "Admin"));
        USERS.add(new User(2, "dosen", "dosen123", "Dosen"));

        // Contoh data mahasiswa
        STUDENTS.add(new Student("Yabes Paskah Sinaga", "2515101107", "Ilmu Komputer", "2025"));
        STUDENTS.add(new Student("Ester Valeria Hutajulu", "2415091069", "Sistem Informasi", "2024"));
        STUDENTS.add(new Student("GEDE DHANU PURNAYASA", "2415091092", "Sistem Informasi", "2024"));
        STUDENTS.add(new Student("Yehuda Bezaleel Widiapratama", "1915091055", "Sistem Informasi", "2019"));

        // Contoh data dosen
        LECTURERS.add(new Lecturer("197905112006041004", "I Ketut Purnamawan, S.Kom., M.Kom.",
                "0012345601", "Basis Data", "081234567890"));
        LECTURERS.add(new Lecturer("198205152008012002", "Ni Luh Putu Ardini, M.T.",
                "0023456702", "Rekayasa Perangkat Lunak", "081298765432"));

        // Contoh data mata kuliah
        COURSES.add(new Course("IF101", "Pemrograman Java", 3, 1));
        COURSES.add(new Course("IF205", "Basis Data", 3, 3));
        COURSES.add(new Course("IF301", "Rekayasa Perangkat Lunak", 3, 5));

        // Contoh nilai
        KRS_LIST.add(new KRS(nextKrsId(), "2315101001", COURSES.get(0), 88, 1, "2023/2024"));
        KRS_LIST.add(new KRS(nextKrsId(), "2315101001", COURSES.get(1), 76, 3, "2024/2025"));
    }
}
