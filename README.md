# study
### @Transaction
- DB에 작업을 하는경우 @Trancational 적어줘야 함
- test코드에 적을 경우는 테스트가 끝나고 rollback 시켜줌.
### log
- db에 log남길 때 변수에 들어가는 값을 보고 싶으면
implementation 'com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.5.6'
넣으면 되는데 운영에 반영할 때는 빼는게 좋음 -> 성능 이휴때문에
### JPA 내장타입
- 값 타입으로 @Setter를 적어주지 않음. 그리고 스펙상 protected객체 선언해줘야 함.
- @Embeddedable
  - class에 직접 선언
- @Embedded
  - 변수에 직접 선언
### 1대다
- Member.java - Order.java에서 확인 가능
- Member.java: @OneToMany(mappedBy = "member") private List<Order> orders = new ~;
  - Order 객체에 선언된 member라는 변수에 매핑 되어 있다는 뜻!!!!
- Order.java: @ManyToOne @JoinColumn("member_id") private Member member;
  - Member의 id랑 조인되어 있음
### enum
- enum에서 enum type은 꼭 String으로 해야함 숫자로 타입지정을하면 변수가 중각에 끼어 들면 그 친구가 그 숫자를 대신함
  - @Enumerated(EnumType.STRING)
