import java.util.Scanner;

public class GecmeNotu {
    public static void main(String[] args) {
        double mathGrade, physicsGrade, chemieGrade, turkishGrade, historyGrade, musicGrade;
        int amountSections = 6;

        Scanner scan = new Scanner(System.in);

        System.out.println("Mathematics grade : ");
        mathGrade = scan.nextInt();
        if (mathGrade > 100 || mathGrade < 0){
            mathGrade = 0;
            --amountSections;
        }

        System.out.println("Physics grade : ");
        physicsGrade = scan.nextInt();

        if (physicsGrade > 100 || physicsGrade < 0){
            physicsGrade = 0;
            --amountSections;
        }

        System.out.println("Chemistry grade : ");
        chemieGrade = scan.nextInt();

        if (chemieGrade > 100 || chemieGrade < 0){
            chemieGrade = 0;
            --amountSections;
        }

        System.out.println("Turkish grade : ");
        turkishGrade = scan.nextInt();

        if (turkishGrade > 100 || turkishGrade < 0){
            turkishGrade = 0;
            --amountSections;
        }

        System.out.println("History grade : ");
        historyGrade = scan.nextInt();

        if (historyGrade > 100 || historyGrade < 0){
            historyGrade = 0;
            --amountSections;
        }

        System.out.println("Music grade : ");
        musicGrade = scan.nextInt();

        if (musicGrade > 100 || musicGrade < 0){
            musicGrade = 0;
            --amountSections;
        }

        double generalGradeAverage = (mathGrade + physicsGrade + chemieGrade + turkishGrade + historyGrade + musicGrade) / amountSections;
        System.out.println("Grade average is : " + generalGradeAverage );
        if (generalGradeAverage >= 55){
            System.out.println("You pass :)");
        }
        else {
            System.out.println("You fail :(");
        }
    }
}
