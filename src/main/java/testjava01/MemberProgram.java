package testjava01;

import java.util.ArrayList;
import java.util.List;

public class MemberProgram {

    static List<Member> members = new ArrayList<>();


    // 1. 회원가입
    public void plusMember(String name, String id, String password) {
        Member mem = new Member(name, id, password);
        members.add(mem);
    }

    // 2. 회원 정보 조회
    public static Member searchMember(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public static Member fixMember(String name, String id, String password) {

        for (int i = 0; i <= members.size() - 1; i++) {
            if (name.equals(members.get(i).getName())) {
                members.get(i).setName(name);
                members.get(i).setId(id);
                members.get(i).setPassword(password);
            }
        }
        return null;
    }

    public static Member delMember(String name) {
        System.out.println("삭제 시작");
        for (Member member : members) {
            if (member.getName().equals(name)) {
                members.remove(name);
            }
        }
        System.out.println("삭제 완료");
        return null;
    }

}
