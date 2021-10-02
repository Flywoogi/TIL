package memberex;

import java.lang.reflect.Member;
import java.util.List;

public interface MemberDAO {
        List<Member> selectList() throws Exception;
        int insert(Member member) throws Exception;
        int delete(int no)throws Exception;
        Member selecteOne(int no)throws Exception;
        int update(Member member)throws Exception;
        Member exist(String email, String password)throws Exception;
}
