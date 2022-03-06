package ss10_DSA_Danh_sach.bai_tap.trien_khai_phuong_thuc_array_list;

public class ArrayListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a  = new Student(1, "Tuan");
        Student b  = new Student(2, "Tuan");
        Student c  = new Student(3, "Tuan");
        Student d  = new Student(4, "Tuan");

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(a);
        studentArrayList.add(b);
        studentArrayList.add(c);
        studentArrayList.add(d);

        for (int i = 0; i < studentArrayList.size(); i++) {
//            Student student = studentArrayList
        }
    }
}
