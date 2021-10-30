public class main {
    public static void main(String[] args) {
        Subject sub = new Subject("CS311", "Software Development", 3);
        Address add = new Address(12, "Minya", "Egypt");
        Student st = new Student(45, (float) 3.2, sub, add);

        st.display();
        System.out.println("######################################################");

        Student st1 = new Student();

        st1.setSubject("CS221", "Automata", 3);
        st1.setAddress(15, "Cairo", "Egypt");
        st1.setStudentID(46);
        st1.setStudentGPA((float) 2.95);
        System.out.println(st1.getStudentID() + "\t" + st1.getStudentGPA());
        System.out.println(st1.getSubject());
        System.out.println(st1.getAddress());

    }
}
