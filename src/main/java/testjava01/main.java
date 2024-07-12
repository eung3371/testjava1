package testjava01;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        MemberProgram memberProgram = new MemberProgram();
        Scanner sc = new Scanner(System.in);

        boolean program = true;
        while (program) {
            System.out.println("=== 회원 관리 프로그램 ===");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 정보 조회");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("- - - - - - - - - - - - - -");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();

            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("이름을 입력하세요 : ");
                    String name = sc.nextLine();
                    System.out.println("ID를 입력하세요 : ");
                    String id = sc.nextLine();
                    System.out.println("비밀번호를 입력하세요 : ");
                    String password = sc.nextLine();
                    memberProgram.plusMember(name, id, password);
                    System.out.println("회원가입이 완료되었습니다.");
                    break;

                case 2:
                    System.out.println("조회하고 싶은 회원의 이름을 입력하세요 : ");
                    String searchName = sc.nextLine();
                    Member searchMember = memberProgram.searchMember(searchName);
                    if (searchMember != null) {
                        System.out.println(searchName + "님의 정보를 조회합니다.");
                        System.out.println(searchMember);
                    } else {
                        System.out.println("입력하신 이름을 가진 회원이 존재하지 않습니다.");
                    }
                    break;

                case 3:
                    System.out.println("수정할 이름을 입력하세요 : ");
                    name = sc.nextLine();
                    System.out.println("수정할 ID를 입력하세요 : ");
                    id = sc.nextLine();
                    System.out.println("수정할 비밀번호를 입력하세요");
                    password = sc.nextLine();
                    MemberProgram.fixMember(name, id, password);
                    System.out.println("수정이 완료됐습니다.");
                    break;

                case 4:
                    System.out.println("삭제하고 싶은 회원의 이름을 입력하세요 : ");
                    name = sc.nextLine();
                    MemberProgram.delMember(name);
                    break;

                case 5:
                    program = false;
                    System.out.println("프로그램을 종료합니다...");
                    return;

                default:
                    System.out.println("잘못 입력하셨습니다. 메뉴를 다시 골라주세요.");
                    break;
            }
        }
    }
}

