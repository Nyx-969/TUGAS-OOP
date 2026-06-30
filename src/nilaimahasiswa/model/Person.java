package nilaimahasiswa.model;

/**
 * Kelas dasar untuk Mahasiswa dan Dosen.
 *
 * @author Ubai
 */
public class Person {
    protected String idCard;
    protected String name;

    public Person(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    public String getInfo() {
    return "ID: " + idCard + " | Nama: " + name;
    }
    
    public String getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }
}
