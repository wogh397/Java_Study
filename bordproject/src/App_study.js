/* import */
import Header from "./Header";
import Menu from "./Menu";
import { useState } from "react"; 
import List from "./List";
import Write from "./Write";
import Read from "./Read";

/* 컴포넌트란? JSX 함수 */
function App() {

  const [ mode, setMode ] = useState("LIST");
  
// State를 사용하기 위해, 배열을 하나 만든다.
// useState("LIST")는 mode에 들어간다.

  const menuList=[
// menuList 모드를 만듬    
    {id:1, title:"글쓰기", mode:"WRITE"},
//  {id:[인덱스] title:"글쓰기" mode:"WRITE"}을 불러온다 -> 메뉴.js(컴포넌트)에서
    {id:2, title:"목록으로", mode:"LIST"}    
//   
  ];
  const [postList, setPostList] = useState([
//   

    {id:1, title:"반갑습니다.", body:"Hello", writer:"장재호"},
    {id:2, title:"반갑습니다.", body:"Hello", writer:"장재호"},
  ]);

  const [nextId, setNextId ] = useState(postList.length +1);
  //글쓸대 추가하는 기능 Id
  // 상태값 [nextId]안에 들어갈 State 정함 
  // useState 에 들어간 함수가 const []배열안에 nextId에 들어감 
  //
  const [ id, setid ] = 
  // 보낼때의 id를 만듬

  
  let content = null; // 빈 변수 만들어줌

  switch(mode){

    case "LIST":
    // List만 불러옴, 
    // List 태그를 만들고, List.js에서 postList를 받아온다.
    content=<List postList={postList} onSelect={(_mode, _id)=>{
      setMode(_mode);
      setId()
    }}></List>;
      
      break;

    case "WRITE":
      content = <Write onSave={(title, body, writer)=>{
    // content 변수에 컴포넌트 WRITE에서 호출 / 
    // WRITE 태그안에 onSave콜백함수안에 매개변수(title,body,Write)를 대입
        const newpost = {id:nextId, title, body, writer};
    // newpost 라는 새로운 객체를 생성
    // id:nextId -> 새 게시글에 고유한 ID를 부여.
       
        postList.push(newpost); 
    // postList 배열에 새 게시글 newpost를 push추가
        const newpostList = [...postList];
    // 새 배열 newpostList 를 만들고, 
        setPostList(newpostList);
    //     
        setMode("LIST");
    // 
        setNextId(nextId+1);
    // 새 글이 등록되려면 등록된글에 추가되어야 하기에 +1     
      }}></Write>
    
      break;
      //  위 LIST 처럼 해당 WRITE를 만들어준다.
      // 컴포넌트 파일 생성후 , 불러와 적용시켜야함
      // 글쓰기 눌렀을때 아래에 제목입력 input , 내용입력 input 출력
      // 글쓰기 onClick={(e)=>{}} 눌렀을때 작동
      // write에서 넘어와 , app에 적용 저장

    case "READ":
      content = <Read postList={postList}></Read>
      // <Read> 태그 안에 postList를 불러옴
      // 글작성을 title,body,writer 순으로 읽어와야함.
      // 클릭시 title,body,writer 순으로 표출
      // 
      // setMode("READ")로 초기값 READ로 변경
      
      break;
  }
    /* 반환값 : JSX = JS + HTML*/ 
    // if( Mode === "LIST"){
    //   content=<h2>글목록 보여주기</h2>;
    // }else if( Mode === "WRITE"){
    //   content=<h2>글쓰기</h2>;
    // }
  return ( // 리턴 : 반환 JSX , UI를 만드는 부분 {뼈대}
// <></> 빈태그는 여러개 만들고, 나누어 묶어줄수 있다.
    <>
        {/*  Header,Nav JSX를 반환하는걸 컴포넌트라고 한다.  */}
      <Header title="글목록"></Header>
        {/* Header 컴포넌트 */}
        {/* 해당 방법이 바람직함 */}
        {/* menuList 상태변수를 속성값 menuList에 담아 menu 컴포넌트 함수 호출 */}
      <Menu menuList={menuList} onChangeMode={(_mode)=>{        
// 
        setMode(_mode);
// List가 목록으로 변경
    }}></Menu>
      {/* <Menu /> */} 
      {content}
      {/* 리스트가 나올지,글쓰는 페이지가 나올지 컴포넌트를 하나 더 만들어서 대입 */}
    </>
    
  );
}

/* 외부에서 현재 코드를 부를때 내보내는 거*/
export default App;
