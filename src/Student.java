public abstract class Student {

    private int curs;
    private int ozenka;
    private final String name;
    private final String surname;
    private final String  middlname;

    public Student(String name, String surname, String middlname) {
        this.name = name;
        this.surname = surname;
        this.middlname = middlname;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setOzenka(int ozenka) {
        this.ozenka = ozenka;
    }
    public abstract void writeExam();
}
