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

## 숫자와 연산

---

```java
//	Operator_연산자
+ //더하기
- //빼기
* //곱하기
/ //나누기
```

```java
System.out.println(Math.PI) //3.14159265358979
```

### Math

- 수학과 관련된 유명하고 자주 사용하는 것들을 그룹한, 일종의 캐비닛같은 것이다.

```java
System.out.println(Math.floor(Math.PI));
//내림
```

- 3.14159265358979...에서 3 뒤의 소숫점을 잘라 없애고 3.0으로 만들어준다.

```java
System.out.println(Math.ceil(Math.PI));
//올림
```

- 3.1415926535...의 소수부분을 올림하여 4로 만들어준다.

---

## 문자열의 표현

---

```java
System.out.println("Hello World");
//String
System.out.println('H');
//Character
```

작은 따옴표 안의 데이터 형식은 Character으로, 한 글자만 사용 할 수 있다.

이러한 Character들이 모여있는것이 String이다.

작은따옴표를 사용할 시 의미가 달라지므로, 사용에 유의해야한다.

### 줄 바꿈

```java
System.out.println("Hello \nWorld");
//new line
```

줄 바꿈을 할 부분에서 \n을 입력하여 줄 바꿈을 선언해준다.

### 특수한 기능을 가진 문자를 출력하기

```java
System.out.println("Hello \"World\"");
//Hello "World"
```

임무가 있는 문자의 임무를 일시적으로 해방시키기 위해 해당 문자의 앞에 역슬래시 \ 를 사용하여 다음에 나올 문자가 임무가 없는 문자라는것을 인지시켜준다.

---

## 문자열 다루기

---

```java
System.out.println("Hello World".length());
//11
```

내가 입력한 문자열의 길이를 출력한다.

```java
System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "woodol"));
//Hello, woodol ... bye. 
```

생활에서 메일을 여러 명에게 보내야한다고 가정하자.

자바에서 같은 내용의 메일을 이름만 바꿔 수신을 하기 위해서는 replace를 사용해 위와 같이 만들 수 있다.

---

## 작심삼일 공학

---

공부를 잘 하는 사람들은 공부만 하지 않는다.

주체적으로 공부에 임하며, 작심삼일이 왔을 경우 지금까지 배운 내용을 바탕으로 무언가 일상생활의 문제를 해결해보자.

뇌에게 쓸모를 증명하고 다시 공부에 임하자.

> 공부를 할 때마다 나의 상태를 살핍니다.
> 집중해서 공부하고 있는지, 아니면 겉돌고 있는지 말이지요.
> 겉돌고 있다면 왜 그런 상태인지 스스로 생각해보고 그 원인을 해결하기 위해 계획을 수정하고 실천합니다.
> 그 사이클을 계속 반복하면서 조금씩 나아갑니다.

---

## 변수

---

>내가 그의 이름을 불러주기 전에는
>그는 다만
>하나의 몸짓에 지나지 않았다. -김춘수 꽃-

변수란 데이터에 붙이는 이름이다. 이름을 붙이기 전까지 나는 그 데이터를 부르기 어렵고, 기억하기 어렵고, 이해하기 어렵다. 오늘은 바로 이 변수를 배워본다.

---

값이 변할 수 있는 문자, 변수

```java
int a = 1; //Number -> integer ... -2, -1, 0, 1, 2 ...
```

Int는 integer의 약자로, 정수를 뜻한다.

정수가 아닌 실수를 표현하고자 한다면 double을 사용한다.

```java
double b = 1.1; 
// real number -> double ... -2.0, -1.0, 0, 1.0, 2.0 ...
```

```java
String c = "Hello World";
```

문자를 출력하고자 할때는 String을 사용한다.

어떤 변수에는 반드시 정해진 형식이 있어, 형식에 맞게 변수를 작성 하여 컴파일에 성공 한다면 그 값이 정수인지 숫자인지 문자인지 확인 할 필요가 없다는 점에서 굉장히 편리하다는걸 느낄 수 있다.

---

## 변수의 효용

```java
System.out.println("Hello, woogi ... woogi ... woogi ... bye");
```

단순히 Hello, woogi ... woogi ... woogi ... bye 라는 문자를 출력하는 코드다.

```java
String name = "woogi";
System.out.println("Hello, "+name+" ... "+name+" ... woogi ... bye");
```

변수 name을 추가하고, 실행 해주면 같은 내용이 출력 되지만 나중에 내가 다시 보거나 다른 이가 내 코드를 봤을때 나의 의도를 이해하기가 더 쉬워진다.

```java
System.out.println(10);
```

10을 출력하는 코드이다.

```java
double VAT = 10.0;
System.out.println(VAT);
```

이것또한 10을 출력하는 코드이나, 위의 코드와는 다르게 의도를 정확히 이해 할 수 있다.

변수를 이용해 얼마나 효율적인 코드를 만들 수 있을지에 대해 다시 느낄 수 있는 계기였다.

---

## 데이터 타입의 변환

> casting

---

```java
double a = 1.1;
double b = 1;
double b2 = (double) 1;

System.out.println(b);
// 1.0
```

double -> int로 강제 변환을 하기 위해서는 명시적으로 알려주어야한다.

```java
int e = (int) 1.1;
System.out.println(e);
// 1
```

강제로 변환을 해 줄 경우, 1.1은 int(정수)로 표현 할 수 없어 데이터에 손실이 일어난다. 1.1 -> 1

---

## 프로그래밍이란 무엇인가

---

> 프로그래밍, 프로그램 ,프로그래머의 의미를 알아본다.

프로그램은 시간에 순서에 따라 어떠한 일이 일어나는 것이다.

