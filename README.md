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
