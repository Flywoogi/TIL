# css

---

종속형 시트 또는 캐스케이딩 스타일 시트 CSS는 마크업 언어가 실제 표시되는 방법을 기술

### 비유

css는 html을 아름답게 꾸며주는 디자이너의 언어다.

화가가 붓을 만드는 법을 알 필요는 없지만, 붓을 만드는 사람보다 붓 질은 훨씬 잘해야한다.

붓 질하는 법을 모른다면, 표현하고자 하는 것을 제대로 표현하는 것이 어려울 것이다.

css는 디지털 컨텐츠를 생산하는 사람들에게는 붓질과 같은 것일 것이다.

### 사용방법

1. 외부파일 사용
2. 내부파일 사용
3. 태그로 사용

 표현)

``` css
<link href = "파일경로" rel = "stylesheet" type = "text/css">
<style type = "text/css">
	스타일 정의
</style>
<p style="color : blue;">머리가 좋아지는 음식</p>
```

Css 안에서 주석을 사용 할 수도 있다.

```css
    <style type="text/css">
        p {color: blue;}
        <!--css 안에서 주석 사용 가능-->
    </style>
```

Ex3.html파일을 생성, html과 css를 연결해보았다.

```html
    <title>ex3</title>
    <link rel="stylesheet" href="css/ex1.css">
</head>
<body>
    <p>머리가 좋아지는 음식</p>
</body>
```

#은 아이디를 의미한다.

``` html
  <style type="text/css">
        #ctxt {
            color: blue;
        }
    </style>
</head>
<body>
    <p id="ctxt">건강에 좋은 차</p>
    <p>건강에 좋은 차2</p>
</body>
```

.은 클래스를 의미한다.

``` html
    <style type="text/css">
        .ctxt {color: blue;}
    </style>
</head>
<body>
    <p class="ctxt">잠이 잘 오는 집</p>
    <p>잠이 잘 오는 집</p>
</body>
```

