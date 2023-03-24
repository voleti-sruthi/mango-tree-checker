import java.util.Scanner;

public class MangoTreeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int noOfRows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int noOfColumns = scanner.nextInt();
        System.out.println("Enter tree number to be checked");
        int treeNoToCheck = scanner.nextInt();
        if(treeNoToCheck > noOfRows*noOfColumns || noOfRows <= 0 || noOfColumns <= 0 || treeNoToCheck <= 0){
            System.out.println("no");
        }
        else if(treeNoToCheck <= noOfColumns || treeNoToCheck % noOfColumns == 1 || treeNoToCheck % noOfColumns == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}