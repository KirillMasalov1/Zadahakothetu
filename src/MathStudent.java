public class MathStudent extends Student{
    public MathStudent(String name, String suname, String middlname) {
        super(name, suname, middlname);
    }
    @Override
    public void writeExam() {
        System.out.println("The Student of Math write exam");
    }
}
