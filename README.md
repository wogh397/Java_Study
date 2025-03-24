<!DOCTYPE HTML>
<html lang="en">
 <머리>
 <meta charset=>UTF-8" />
 <meta 이름="viewport" 콘텐츠="width=장치 너비, 초기 규모=1.0" />
 <title>로또 번호 추첨기기</title>
 </머리>
 <바디>
    <!--로또 번호 추첨 생성기 과제 -->
    <!-- 오답 노트 (오답노트)
 1. 입력 테이프="버튼" 테이프 알파벳 오타;;;;
    2.
 -->
 <h2>로또 번호 생성기</h2>
 <버튼 id="create">로또 번호 생성</버튼>
 <p id="lottonum"></p>

    <스크립트>
     //0. math.floor(Math.random)? 이거 써야하는데 어따 쓰지?
     //1. Id를 불러와 클릭(행동) 동작할때 작동
     document.getElementById('생성').addEventListener('클릭', () => {
     //2. 빈배열 만들기 : const , let 둘중 뭐로 만들지 고민함
     // createenum = [];
     숫자 = [];

     //3. 누를때마다 작동? for(반복문?) 써야하나? - for(let of ) 사용가능?
     //for(let lo for ) 사용가능? 근데 어찌작성해야 하는지 모름
     // 차이점  = 채팅 중에.GPT 질문
     // 반복횟수가 정해져있지않으면 while문이 적당
     // 반복횟수가 정해져있으면 for문이 적당

     (numbers.길이 < 6) { 동안
     // 배열 길이? 6까지만 실행
     //3. 1번~46번 숫자를 랜덤하게 추출?
     상수 로톤 = Math.floor(Math.random() * 45) + 1;
     //
     만약 (!numbers.includes(로톤) {
     숫자.push(로톤);
     }
     }
     숫자.sort(((a, b) => a - b);
     document.getElementById('로톤').내부 텍스트 = 숫자.join(, ';
     });
    </script>
 </body>
</html>
