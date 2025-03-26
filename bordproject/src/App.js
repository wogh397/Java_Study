/* import */
import Header from "./Header";
import Menu from "./Menu";
import { useState } from "react"; 
import List from "./List";

/* 컴포넌트란? JSX 함수 */
function App() {

  const [ mode, setMode ] = useState("LIST");
// State를 사용하기 위해, 배열을 하나 만든다.
// useState("LIST")는 mode에 들어간다.
  const menuList=[
    {id:1, title:"글쓰기", mode:"WRITE"},
//  {id:[인덱스] title:"글쓰기" mode:"WRITE"}을 불러온다 -> 메뉴.js에서
    {id:2, title:"목록으로", mode:"LIST"}    
  ];

  const [postList, setPostList] = useState([
//   

    {id:1, title:"반갑습니다.", body:"Hello", writer:"장재호"},
    {id:2, title:"반갑습니다.", body:"Hello", writer:"장재호"},
  ]);

  let content = null; // 빈 변수 만들어줌

  switch(mode){

    case "LIST":
    // List만 불러옴, 
    // List 태그를 만들고, List.js에서 postList를 받아온다.
    content=<List postList={postList}></List>;
      break;

    case "WRITE":
      content=<h2>글쓰기</h2>;
      break;

    case "READ":

      break
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
      
      {/* 해당 방법이 바람직함 */}
      {/* menuList 상태변수를 속성값 menuList에 담아 menu 컴포넌트 함수 호출 */}
      <Menu menuList={menuList} onChangeMode={(_mode)=>{        
        setMode(_mode);
      }}></Menu>
      {/* <Menu /> */} 
      {content}
      {/* 리스트가 나올지,글쓰는 페이지가 나올지 컴포넌트를 하나 더 만들어서 대입 */}
    </>
    
  );
}

/* 외부에서 현재 코드를 부를때 내보내는 거*/
export default App;
