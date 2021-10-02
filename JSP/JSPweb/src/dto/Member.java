package dto;

import java.util.Date;

/*
CREATE TABLE MEMBERS(
        MNO INTEGER NOT NULL COMMENT '회원일련번호', -- 회원일련번호
        EMAIL VARCHAR(40) NOT NULL COMMENT '이메일', -- 이메일
        PWD VARCHAR(100) NOT NULL COMMENT '암호', -- 암호
        MNAME VARCHAR(50) NOT NULL COMMENT '이름', -- 이름
        CRE_DATE DATETIME NOT NULL COMMENT '가입일', -- 가입일
        MOD_DATE DATETIME NOT NULL COMMENT '마지막암호변경일' -- 마지막암호변경일
 */

public class Member {
    private int no;
    private String name;
    private String email;
    private String password;
    private Date createdDate;
    private Date modifiedDate;

    public int getNo(){
        return no;
    }
    public Member setNo(int no) {
        this.no = no;
        return this;
    }
    public String getName() {
        return  name;
    }
    public Member setName(String name) {
        this.name = name;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public Member setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getPassword() {
        return password;
    }
    public Member setPassword(String password) {
        this.password = password;
        return this;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public Member getCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    public Date getModifiedDate() {
        return modifiedDate;
    }
    public Member setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }
}
