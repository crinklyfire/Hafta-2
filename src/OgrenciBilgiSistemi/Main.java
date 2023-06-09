package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course vMat = new Course("Matematik Sözlüsü", "MAT102", "VMAT");
        Course vFizik = new Course("Fizik Sözlüsü", "FZK102", "VFZK");
        Course vKimya = new Course("Kimya Sözlüsü", "KMY102", "VKMY");


        Teacher t1 = new Teacher ("Mahmut Hoca", "905000000", "MAT");
        Teacher t2 = new Teacher ("Fatma Ayşe", "905000001", "FZK");
        Teacher t3 = new Teacher ("Ali Veli", "9050000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik,kimya,vMat,vFizik,vKimya);
        s1.addBulkExamNote(50,20,40,60,70,80);
        s1.isPass();

        Student s2 = new Student ("Güdük  Necmi", 4, "2211133", mat, fizik, kimya, vMat, vFizik, vKimya);
        s2.addBulkExamNote(100,50,40,70,60,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4,"221121312", mat, fizik, kimya, vMat, vFizik, vKimya);
        s3.addBulkExamNote(50,20,40,50,20,40);
        s3.isPass();

    }
}
