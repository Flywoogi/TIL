# git, 분산버전관리시스템

- 코드의 히스토리(버전)을 관리하는 도구

## 변경 사항만을 각각의 버전별로 저장

- 빠른 속도, 가벼운 용량

# 깃과 깃허브의 차이

git은 분산버전관리시스템, github은 git 기반의 저장소 서버.

# git은 명령어를 통해 사용

CLI(Command line interface)

# 간단한 리눅스 유닉스 명령어



# git에서 commit은 특정 버전으로 남기는 것을 의미.



# git의 3가지 영역

- working directory
  - 내가 작업하고있는 실제 디렉토리
- Staging area
  - 커밋으로 남기고싶은 특정버전으로 관리하고싶은 파일이 있는 곳
- Repository
  - 커밋들이 저장되는 곳

워킹 디렉토리에서 만든 최초의 파일을 git add를 통해 staged상태로 만듦.

git commit을 통해 repository로 보냄.

커밋된 문서를 수정 시 git add를 통해 스테이지에 올리고, 다시 깃 커밋을 통해 리포지토리로 보낸다. 이러한 과정을 반복해 커밋 1, 2, 3이 만들어지는것이다.

`git add "파일명" or .`

추적되지 않은 모든 파일과 추적하고 있는 파일 중 수정된 파일을 모두 Staging Area에 올린다.

다시 `git status`를 해보면 커밋은 아직 올라가지 않았지만, 커밋 할 수 있는 상태가 된 파일들을 볼 수 있다.

`git commit -m "init"` 을 입력하면, 내가 누군지 묻는지에 대한 이야기가 나온다.

우선 깃허브 회원가입을 하고 난 후 `git config --global user.name "닉네임"`,

 `git config --global user.email "이메일"` 을 입력하여 컴퓨터 전체에서 편하게 파일을 커밋할 수 있게 해준다.

# git commit 실습

- 바탕화면에 edu__git_commit 폴더를 만들고 git 저장소를 생성한다
- 해당 폴더 안에 a.txt 라는 텍스트 파일을 만들고 add b.txt라는 커밋 메세지로 커밋을 만든다
- b.txt라는 텍스트 파일을 만들고, add b.txt라는 커밋 메세지로 커밋을 만든다.
- a.txt파일을 수정하고 update a.txt라는 커밋메세지로 커밋을 만든다.



# 왜 Staging Area를 거쳐야할까?

세 개의 파일이 있다. 그 중 두개의 파일은 개발 완료되어 커밋으로 남기고 싶다.

나머지 하나는 하나의 커밋으로 만들기에는 부족하다는 생각이 들어 

셋 다 수정은 했지만 그 중 두개만 커밋을 하고싶다.

세 개의 파일을 모두 수정했지만 남기고 싶은 파일만 특정 커밋으로 올리고 싶을때.

Staging Area를 이용하면 커밋을 더욱 편하게 할 수 있다

요약

​	내가 커밋으로 남기고 싶은 파일만, 특정 커밋으로 만들고 싶은 파일만 다루기 위해 

​	중간지대가 필요함. Staging Area

## RacingGround의 Basic car 수정



# Github 시작하기.

지금까지는 local 레포지토리에서만 작업했다

이제는 Remote repository를 연결해본다

Github에 접속해서 새 repository를 생성한다

repository 주소를 복사 후 터미널로 돌아와

Status에 이상이 없는걸 확인 후

git remote add origin https://github.com/Flywoogi/remote_repo.git

Git push -u origin master

입력해준다

## clone으로 깃허브에 업로드

우선 깃허브에서 레포지토리를 생성 한 후, 후에 로컬에서 작업을 하고 커밋을 하는방식

타인의 레포지토리를 클론해오는것도 가능하나, 푸쉬는 안된다.

# TIL (Today I Learned) 프로젝트

> 오늘 내일 배운 내용을 정리해요.

---

* 매일 내가 배운 것을 마크다운으로 정리해서 문서화하는 것

* 신입 개발자에게 요구되는 가장 큰 능력, 꾸준히 학습할 수 있나요?

* 입사하게 되면 그곳에 맞는 문화나 기술 등을 학습할 수 있는가? 우리가 필요한 인재로 성장할 수 있는가? 를 확인할 수 있는 굉장히 중요한 프로젝트이다.

  

