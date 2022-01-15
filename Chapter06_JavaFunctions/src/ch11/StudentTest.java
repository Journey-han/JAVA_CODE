package ch11;

public class StudentTest {
    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();

        String name = null;
        try{
            Student student = new Student(name);

        }catch( StudentNameFormatException e ){
            myLogger.warning(e.getMessage());
        }

        try{
            Student student = new Student("Dooli Tochi Zanggu Test");
        }catch ( StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }

        Student student = new Student("Conan");
    }
}

