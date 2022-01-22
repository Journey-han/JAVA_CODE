## 7. 인터페이스를 활용한 학점 산출 프로그램 만들기
### 문제 정의

- Good School 학교가 있습니다. 이 학교에는 5명의 학생들이 수업을 듣습니다. 과목은 국어와 수학이 있고, 각 학생은 두 과목을 모두 수강합니다.

전공은 컴퓨터공학과 국어국문학 두 가지가 있습니다. 컴퓨터공학과 학생은 수학이 필수과목이고, 국어국문학과 학생은 국어가 필수 과목입니다.

각 학생별로 한 개의 전공을 선택합니다.

이번 학기 각 학생의 성적은 다음과 같습니다.

|이름|학번|전공|필수 과목|국어 점수|수학 점수|
|:-:|:-:|:-:|:-:|:-:|:-:|
|이둘리|211213|국어국문학과|국어|95|56|
|신짱구|212330|컴퓨터공학과|수학|95|98|
|김또치|201518|국어국문학과|국어|100|88|
|남코난|202360|국어국문학과|국어|89|95|
|박세모|201290|컴퓨터공학과|수학|83|56|

- 학점을 부여하는 방벅은 여러 가지가 있습니다. 단순히 A,B,C,D,F를 부여하는 방법, A+, B-처럼 +/-를 사용하는 방법, Pass/Fail 만을 부여하는 방법등이 있습니다.

여기 각 학생에게 학점을 부여하는 데 사용하는 정책은 두 가지입니다. 일반 과목이라면 A ~ F로, 필수 과목이라면 S ~ F 로 분류합니다. 점수에 따른 학점 부여기준은
다음과 같습니다

- 필수 과목 학점 기준

|S|A|B|C|D|F|
|:-:|:-:|:-:|:-:|:-:|:-:|
|95~100점|90~94점|80~89점|70~79점|60~69점|60점 미만|

- 일반 과목 학점 기준

|A|B|C|D|F|
|:-:|:-:|:-:|:-:|:-:|
|90~100점|80~89점|70~79점|55~69점|55점 미만|    

만약 똑같이 95점을 받은 경우, 필수 과목이라면 S를 받지만, 일반 과목은 A를 받습니다. 또한 56점을 받으면 필수 과목은 F이지만, 일반 과목은 D를 받습니다.

- 프로그램 구현 과제

위와 같이 주어진 성적과 각 과목에 대한 학점 정책에 따라 아래와 같이 학점 결과가 나올 수 있도록 구현합니다.

학점의 정책이 추가되는 경우와 과목이 추가되는 경우를 고려하여 객체를 설계하고 학점 정책에 대해서는 인터페이스를 선언하고 각 정책이 해당 인터페이스를 구현하도록 합니다.

**국어 과목 결과**

![국어](https://t1.daumcdn.net/cafeattach/1Dzpp/ce6462208f6d9c0c236c973c6bbee10b13a405af)

**수학 과목 결과**

![수학](https://t1.daumcdn.net/cafeattach/1Dzpp/159acea7654acb8a1d255e7ef2843ab7b8c91979)

### 클래스 정의하고 관계도 그리기
|First|Second|
|:-:|:-:|
|![클래스다이어그램](https://t1.daumcdn.net/cafeattach/1Dzpp/65effe0ffd14a440873956f1aa55cd0fe9a5f972)|![diagram](https://t1.daumcdn.net/cafeattach/1Dzpp/f085501d1e7d5943f8d2222ad481435a93c3d1de)|

- **Student.java**

```java
import java.util.ArrayList;

public class Student {

    private int studentId;              // 학번
    private String studentName;         // 이름
    private Subject majorSubject;       // 중점 과목

    // 학생의 성적 리스트
    // addSubjectScore() 메서드가 호출되면 리스트에 추가된다.
    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
```

- **Subject.java**

```java
import utils.Define;

import java.util.ArrayList;

public class Subject {

    private String subjectName;     // 과목 이름
    private int subjectId;          // 과목 고유번호
    private int gradeType;          // 과목 평가 방법 기본은 A, B

    // 수강 신청한 학생 리스트
    // register() 메서드를 호출하면 리스트에 추가된다.
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;    // 기본적으로 A, B 타입
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student) {     // 수강신청
        studentList.add(student);
    }
}
```

- **Score.java**

```java
public class Score {

    int studentId;      // 학번
    Subject subject;    // 과목
    int point;          // 점수

    public Score(int studentId, Subject subject, int point) {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
```

- **Define.java**
```java
public class Define {

    public static final int KOREAN = 1001;      // 국어
    public static final int MATH = 2001;        // 수학

    public static final int AB_TYPE = 0;        // A, B, C
    public static final int SAB_TYPE = 1;       // S, A, B, C
    
}
```

### 학점 평가 정책 설계하고 구현하기

- 인터페이스 정의하기

점수에 따른 학점의 정책은 여러가지가 있을 수 있습니다. 인터페이스를 먼저 선언하고, 각 정책 클래스가 이를 구현하도록 합니다.

![클래스다이어그램](https://t1.daumcdn.net/cafeattach/1Dzpp/3445fc8d921e9034d73d602764bc0a9b4da37995)

- **GradeEvaluation.java**

```

```

일반 과목 학점에 대한 클래스 구현

- **BasicEvaluation.java**

```

```

필수 과목 학점에 대한 클래스 구현

- **MajorEvaluation.java**

```

```

### 리포트 클래스

- 학점 평가에 대한 클래스들을 인스턴스화 하고 이에 대한 배열을 만들어 각 과목에 점수를 산정할 때 필수 과목인지 일반 과목인지에 따라 각 정책 클래스가 학점을 평가할 수 있도록 구현 합니다.
- 전반적인 리포트의 생성은 header부분, 본문 부분, tail 부분으로 구성합니다.
- StringBuffer 클래스를 이용하여 모든 리포트의 내용을 만들고 난후 toString()을 호출 하여 String 클래스로 반환합니다.


- **GenerateGradeReport.java**
```

```

### 프로그램 테스트 하기
- 주어진 테이터에 기반하여 Student, Subject, Score 객체를 직접 만들어 각 과목에 따른 학점의 결과가 잘 출력되는지 확인 합니다.
- 모든 학생과 과목을 관리하는 School 맥체를 만듭니다.


- **School.java**

```

```

- **TestMain.java**

```

```

### 프로그램 업그레이드 하기
- 과목과 학점 정책이 추가되는 경우

방송댄스 과목이 새로 개설되고 이 과목의 학점 평가 정책은 pass/fail 로 정해졌다고 합니다. 70점 이상인 경우는 pass, 미만인 경우는 fail입니다.

전체 5명 학생중 3명만이 이 과목을 수강신청 했습니다. 추가된 요구사항이 잘 반영되도록 구현하세요

- 상수값 추가하기 **Define.java**

```

```

- GradeEvaluation 인터페이스를 구현한 Pass/Fail BasicEvaluation
  PassFailEvaluation

```

```

- 리포트 클래스 추가할 부분

학점 평가 정책 인스턴스 배열에 새로 추가한 정책에 대한 인스턴스를 추가합니다.

또한 Subject에 대한 학점 정책이 PF_TYPE인 경우만 해당 클래스가 적용되도록 합니다.

- **GenerateGradeReport**

```

```

- 테스트 클래스에 문제의 셋을 추가하여 학점을 출력해 봅니다.

- **TestMain.java**

```

```

- 예상 결과

![result](https://t1.daumcdn.net/cafeattach/1Dzpp/a7889ec7ca0dfe705436f132a1840149b03f6cef)
