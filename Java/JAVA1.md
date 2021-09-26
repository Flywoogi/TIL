# JAVA 1

---

생활코딩의 자바1 영상강의를 보며 자바의 기초를 다시 잡아보는것이 목표.

자바의 기본기를 잡아 추후 자바 웹 프로그램을 개발할 것이다.

---

## step one, Hello world

IDE(Intellij IDEA)에서 Helloworld.java 파일을 생성한다.

```public class Helloworld{}```

Helloworld라는 이름의 클래스를 생성해준다.

내가 생성한 자바 파일의 이름이 Helloworld이므로, 클래스의 이름은 이와 같아야한다.

그 후 class 안에 psvm을 넣어준다.

```java
public static void main(String[] args) {
    
}
```

파일의 이름과 똑같은 클래스를 찾고, 그 안의 메인이라는 약속된 이름의 메소드를 찾는다.

그 후 중괄호 안에 있는 코드를 실행하기로 약속되어있기 때문에

> "내가 자바 프로그램을 만드려면 저 메인의 내용에 코드를 작성하면, 거기 적혀있는
>
> 대로 컴퓨터가 동작을 하겠구나"

정도로 이해 할 수있다.

이제, psvm안에 Hello world!를 출력하는 구문을 넣어준다.

```java
System.out.println("Hello world!");
```

완성된 프로그램의 모습이다

```java
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
}
```

IDE에서 Run버튼을 누르면, 자바는 내가 작성한 것과 같은 내용의 클래스 파일을 생성,

프로그램을 실행하게 된다.

헬로 월드를 출력하는 프로그램을 만들고자 한 목적을 달성했다.

---

## Java의 동작원리

---

> 자바의 문법에 맞게 소스코드를 작성해, 컴퓨터에게 시키고 싶은 일을 시키는것이 내가 하고자 하는 일이라는것을 기억하자.

내가 작성한 소스코드는 사람이 이해할 수 있는 코드이다.

컴퓨터는 확장자가 자바인 파일을 이해할 수 있도록 컴파일이라는 단계를 거친다.

이클립스 ide에서는 소스코드를 작성하고 저장할 시 .class 라는 확장자를 가진 파일이 만들어지는데, 이 파일이 바로 자바 어플리케이션이다.

ide에서 run 버튼을 클릭하면, 자바 버추얼 머신이 확장자가 .class인 파일을 읽어 내용대로 컴퓨터를 동작시키게 된다.

---

## 자바를 이용하여 할 수 있는 것

---

데스크탑 애플리케이션을 만들 수 있다.

사물을 자바로 제어 할 수 있다.

안드로이드 애플리케이션을 만들 수 있다.

---

## 데이터와 연산

---

데이터를 가지고 연산을 하기 위해 데이터의 종류를 알아본다

- 숫자
- 문자
- 기타 등등 (영상, 소리)

데이터를 구분 하는 이유는 각각의 데이터 마다 처리 방법이 다르기 때문이다.

문자의 경우 문자에 숫자가 몇 개인지, 어떤 문자를 제거한다던지, 특정 문자를 검색한다던지 등의 작업을 처리하기 위해 데이터를 구분해야한다는 이유가 있다.

각각의 데이터들마다 어떤 연산 방법이 존재하는지 공부해본다.

``` java
public class Data_and_operation {
    public static void main(String[] args) {
        System.out.println(6); //number
        System.out.println("Six"); //String

        System.out.println("6"); //String 6

        System.out.println(6+6);
        System.out.println("6"+"6"); //66

        System.out.println(6+6);
//        System.out.println("6"*"6");

        System.out.println("1111".length());
//        System.out.println(1111.length());

    }
}

```



데이터의 타입을 구분하는 이유는, 타입별로 어울리는 연산방법이 다르기 때문이다.

> 이 시스템에는 어떤 종류의 데이터 타입들이 존재하는가?
>
> 각각의 타입마다 어떤 방식으로 데이터를 처리해야 하는가?

---

