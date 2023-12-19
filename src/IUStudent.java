public class IUStudent extends Student{
    public IUStudent(String name, String suname, String middlname) {
        super(name, suname, middlname);
    }
    @Override
    public void writeExam() {
        System.out.println("The Student of IU write exam");
    }
}
