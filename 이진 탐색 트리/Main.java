//제어자 클래스
import java.util.Scanner;

public class Main {
    setKey set;
    BST    tree;

    int chart[] = new int[30];
    int num, menu, search;
    private Scanner sc;

    Main() {//생성자 함수
        set  = new setKey();
        tree = new BST();
        sc   = new Scanner(System.in);
    }

    public void Process() {
        System.out.println("이진탐색트리 프로그램입니다.");
        System.out.println("정수 30개를 입력해 주세요.(값은 중복되면 안됩니다.)");
        for (int i = 0; i < chart.length; i++) {
            System.out.print(i+1 + " : ");
            num = sc.nextInt();
            chart[i] = num;
            tree.insertBST(num);
        }

        while (true) {
            System.out.println();
            System.out.println("원하는 모드를 입력해주세요.");
            System.out.println("저장을 원하시면 \"1\", 탐색을 원하시면 \"2\"를 입력해 주세요.");
            menu = sc.nextInt();

            if (menu == 1) {//저장모드
                tree.search(search);
                System.out.println("이진탐색트리가 저장되었습니다.");
            }
            else if (menu == 2) {//탐색모드
                System.out.print("찾고자 하는 정수를 입력해주세요 : ");
                search = sc.nextInt();
                tree.search(search);
                if (tree.getCnt() <= 30) {
                    System.out.println("\"" + search + "\"(은)는 " + tree.getCnt() + "번만에 탐색되었습니다.");
                }
                else if (tree.getCnt() > 30) {
                    System.out.println(search + "(은)는 탐색되지 않았습니다.");
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Main handler = new Main();
        handler.Process();
    }
}
