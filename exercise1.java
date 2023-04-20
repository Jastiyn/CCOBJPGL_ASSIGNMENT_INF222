public class exercise1 {
    
    static boolean IwillBehave = true;
    static boolean IwillGraduate = true;

    public static void main(String[] args) {

        // precondition
        assert IwillBehave == true : "nugagawen";

        College();

        // postcondition
        assert IwillGraduate == true : "haha kawawa";

    }

    static void College () {
        IwillGraduate = false;
        System.out.println("Edi wow");

    }


}
