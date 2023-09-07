package com.ict.edu4.mapper.memebers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ict.edu4.model.members.MemberVO;


@Mapper
public interface Member_Mapper {
    // 해당 내용이 resources/mapper/member.xml을 반영하고 전달하는 역할을 한다
    // 해당 메서드 이름 = member.xml의 id가 된다
    // DAO 대신에 사용된다
    public List<MemberVO> getList();
    public int getIDCnt(String id);
    public MemberVO getMemberOne(String id);
    int getMemberAdd(MemberVO vo);
}
