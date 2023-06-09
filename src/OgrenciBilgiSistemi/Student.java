package OgrenciBilgiSistemi;
public class Student {
    Course mat;
    Course fizik;
    Course kimya;

    Course vMat;
    Course vFizik;
    Course vKimya;


    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    public Student (String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course vMat, Course vFizik, Course vKimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.vMat = vMat;
        this.vFizik = vFizik;
        this.vKimya = vKimya;

        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote (int mat, int fizik, int kimya, int vMat, int vFizik, int vKimya){
        if ((mat >= 0 && mat <= 100) && (vMat >= 0 && vMat <= 100)){
            this.mat.note = (mat * 0.80 + vMat * 0.20);
        }
        if ((fizik >= 0 && fizik <= 100) && (vFizik >= 0 && vFizik <= 100)){
            this.fizik.note = (fizik * 0.80 + vFizik * 0.20);;
        }
        if ((kimya >= 0 && kimya <= 100) && (vKimya >= 0 && vKimya <= 100)){
            this.kimya.note = (kimya * 0.80 + vKimya * 0.20);
        }
    }

    public void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş!");
        }else {
            this.isPass = isCheckPAss();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            }else {
                System.out.println("Sınıfta Kaldı. ");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPAss() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("==================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
