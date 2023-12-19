public class Main {
    public static void main(String[] args) {
        IUStudent Student1 = new IUStudent("Name1", "Surname1", "Middlename1");
        MathStudent Student2 = new MathStudent("Name2", "Surname2", "Middlename2");
        Student1.writeExam();
        Student2.writeExam();
        Massiv massiv = new Massiv(new String[100]);
        massiv.addelement("Maco");
        massiv.addelement("lol");
        massiv.getmassiv();
        massiv.addelement("Mumia");
        massiv.getmassiv();
        System.out.println(massiv.Maxelement());
        System.out.println(massiv.srednee());
        massiv.addelement("Au");
        massiv.getmassiv();
    }
}