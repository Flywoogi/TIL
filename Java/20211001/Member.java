package dto;

import java.util.Date;

/*
CREATE TABLE MEMBERS(
		MNO      INTEGER      NOT NULL COMMENT '회원일련번호', -- 회원일련번호
		EMAIL    VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
		PWD      VARCHAR(100) NOT NULL COMMENT '암호', -- 암호
		MNAME    VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
		CRE_DATE DATETIME     NOT NULL COMMENT '가입일', -- 가입일
		MOD_DATE DATETIME     NOT NULL COMMENT '마지막암호변경일' -- 마지막암호변경일
	)
*/

public class Member {
	private int 	no;
	private String 	name;
	private String 	email;	
	private String 	password;
	private Date	createdDate;
	private Date	modifiedDate;	
	public int getNo() {
		return no;
	}
	public Member setNo(int no) {
		this.no = no;
		return this;
	}
	public String getName() {
		return name;
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
	public Member setCreatedDate(Date createdDate) {
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




/*
CREATE TABLE MEMBERS(
		MNO      INTEGER      NOT NULL COMMENT '회원일련번호', -- 회원일련번호
		EMAIL    VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
		PWD      VARCHAR(100) NOT NULL COMMENT '암호', -- 암호
		MNAME    VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
		CRE_DATE DATETIME     NOT NULL COMMENT '가입일', -- 가입일
		MOD_DATE DATETIME     NOT NULL COMMENT '마지막암호변경일' -- 마지막암호변경일
	)
	COMMENT '회원기본';

	-- 회원기본
	ALTER TABLE MEMBERS
		ADD CONSTRAINT PK_MEMBERS -- 회원기본 기본키
			PRIMARY KEY (
				MNO -- 회원일련번호
			);

	-- 회원기본 유니크 인덱스
	CREATE UNIQUE INDEX UIX_MEMBERS
		ON MEMBERS( -- 회원기본
			EMAIL ASC -- 이메일
		);

	ALTER TABLE MEMBERS
		MODIFY COLUMN MNO INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원일련번호';

	-- 데이터 준비	
	INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)
	VALUES ('s1@test.com','1111','홍길동',NOW(),NOW());

	INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)
	VALUES ('s2@test.com','1111','임꺽정',NOW(),NOW());

	INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)
	VALUES ('s3@test.com','1111','일지매',NOW(),NOW());

	INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)
	VALUES ('s4@test.com','1111','이몽룡',NOW(),NOW());

	INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)
	VALUES ('s5@test.com','1111','성춘향',NOW(),NOW());

	INSERT INTO MEMBERS(EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE)
	VALUES ('1','1','1',NOW(),NOW());
*/

