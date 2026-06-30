package nilaimahasiswa.model;

/**
 * Model data Mahasiswa.
 *
 * @author Ubai
 */
public class Student extends Person {
    private String nim;
    private String studyProgram;
    private String angkatan;

    public Student(String name, String nim, String studyProgram, String angkatan) {
        super(nim, name);
        this.nim = nim;
        this.studyProgram = studyProgram;
        this.angkatan = angkatan;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getInfo() {
    return "NIM: " + nim + " | " + name + " | " + studyProgram + " (" + angkatan + ")";
    }
    
    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
