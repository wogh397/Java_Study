import Header from "./Header"; // import란 ? JavaScript에서는 다른 파일에서 함수나 클래스를 가져올 때 import를 사용해.
import Nav from "./Nav";
import Article from "./Article";
import Create from "./Create";

import { useState } from "react";
import Update from "./Update";

function App() { // State 란 상태값이 저장되는 변수
                 // 
  // 아래 [배열 0 , 배열1] = 배열 0은 변수 , 배열 1는 함수
  const [ mode, setMode ] = useState("WELCOME");                                  //
// mode가 변수 이고, setMode는 함수()

// useState가 [Mode]에 대입
//   
  const [ id,setId ] = useState(0); 
// useState(0)
  

  const [ topics, setTopics ] = useState([
  
  
  //아래는 객체이다. id로 객체를 만듬 
  {id:1, title:"html", body:"html is ...."},
  
  {id:2, title:"css", body:"css is ...."},
  
  {id:3, title:"javascript", body:"javascript is ...."},
  ]);
  const [ nextId, setNextId ] = useState(topic.length+1);

  let content = null; // null 이라는 변수를 하나 만들어줌
  let contextControl = null; // 비어있는 null(아무것도 없는) 지역변수 
  if(mode === "WELCOME"){
    content = <Article title="Welcome" body="Hello, WEB"></Article> 
    //content로 넣어줌
  
  //------------------------------------------------READ 모드 ------------------------------------------------
  }else if(mode === "READ"){
    
    let title, body;
    for (let topic of topics){


      if(topic.id === Number(id)){
        
        
        title = topic.title;
        
        
        body = topic.body;
        break;
      }
    }
    content = <Article title={title} body={body}></Article>;
    // 클릭시 타이틀과 바디가 들어감
    
    contextControl = <>
    
    
    <li><a href={"/update/" + id} onClick={(e)=>{
    
    
      e.preventDefault();
      
      
      setMode("UPDATE");
    }}>Update</a></li>
    
    
    <li><button onClick={(e)=>{
      
      
      const filterTopics=topics.filter((t)=>t.id !== Number(id));
      
      
      setTopics(filterTopics);
      
      
      setMode("WELCOME");
    }} >Delete</button></li>
    </>

    }else if(mode === "CREATE"){
      
      
      content = <Create onCreate={(_title, _body)=>{
        // 입력된 타이틀, 바디를 받는다.
        let newTopic = { id: nextId, title: _title, body: _body };
      
        
        let newTopics = [...topics, newTopic]; 
        // 1. 위 rest 연산자 [...topics]란 newTopic 배열안에 뿌려넣는다
        // 2. ...topics 안에 newTopic 새로 만든다
        // 3. [...topics, newTopics]란 newTopics,newTopic을 뿌려넣는다 
        setTopics(newTopics); //
        

        setId(newTopic.id); //


        setNextId(nextId+1); // 
        

        setMode("READ"); //
      }} ></Create>
    }else if(mode === "UPDATE"){
        
      
        let topic=topics.find((t)=>t.id === Number(id));
          
          content = <Update title={topic.title}body={topic.body} onUpdate={(title, body)=>{
        
        
            const updateTopic = {id:Number(id), title, body};
        
        
            const updateTopics = [...topics];
        
        
            for(let i=0; i<updateTopics.length; i++){
        
        
              if(updateTopics[i].id === Number(id)){
        
        
                updateTopics[i] = updateTopic;
            break; 
          }
        }
        setTopics(updateTopics);
        setMode("READ");
      }}></Update>
    }

  return ( // <Nav topics={topics} onChangeMode={(id)=>{ alert(id);}}></Nav>
           //       ↑ 속성 = ↑값  둘다 본인의 임의로 이름을 정하여 작성가능
           // onChangeMode={(id)=>{ alert(id);}}>
           //        ↑                         
    <> 
      <Header title="REACT" onChangeMode={()=>{
        setMode("WELCOME");
      }}></Header>
      
      <Nav topics={topics} onChangeMode={(_id)=>{
        setId(_id);
        setMode("READ"); 
        // Mode가 READ로 바뀜
      }}></Nav> 
      
      {content} 
      <li><a href="/create" onClick={(e)=>{
        e.preventDefault();
        setMode("CREATE");
     }}>CREATE</a></li>
      
      {contextControl}

    </>
 );
}
export default App;
//-------------------------------------------------------------------------

// function App() {
//   let desc = '';
//   const loginYn = 'Y'; 
//   if(loginYn === 'Y') {
//    desc = <div>홍창기 입니다.</div>;
//   } else {
//    desc = <div>비회원입니다.</div>;
//   }
//   return (
//    <>      <></> 태그이지만 웹 에서는 사라지는 태그
//     {desc}
//    </>
//   );
// }
// function App() {
//   const loginYn = 'Y';
//   return (
//    <>
//     <div> 
//      {loginYn === 'Y' ? (<div>홍창기 입니다.</div>) : 
//       (<div>비회원입니다.</div>)}
//     </div>
//    </>
//   ); }
//-------------------------------------------------------------------------

// function App() {
//   const loginYn = 'Y';
//   return (
//    <>
//     <div>
//      {loginYn === 'Y' && <div>홍창기 입니다.</div>}
//     </div>
//    </>
//   ); }
//-------------------------------------------------------------------------

// function App() {
//   const loginYn = 'Y';
//   return (
//   <>
//   {
//   (() => {
//   if(loginYn === "Y"){
//   return (<div>홍창기 입니다.</div>);
//   }else{
//   return (<div>비회원 입니다.</div>);
//   }
//         })()
//           }
//       </>
//     );
//   }
// export default App;
//-------------------------------------------------------------------------

// function App(){
//    function handleClick(){
//     alert("버튼을 클릭했습니다.");
//    }
//    return <button onClick={handleClick()}>버튼클릭</button>;
// }

// export default App;

//-------------------------------------------------------------------------
// import ControlPanel from "./ControlPanel";
//   function App(){   // from ./ControlPanel 을 불러옴.
//     return <ControlPanel />;
//  };
//  export default App;

// import Counter from "./Counter";
//   function App(){   // from ./ControlPanel 을 불러옴.
//     return (
//       <>
//       <Counter />
//       <Counter />
//       <Counter />
//       {/* 새로 추가하는 법
//           1. Counter를 추가할 수록 1개가 새로 생긴다.
//       */}
//       </>
//     )
      
//     ;
//  };
//  export default App;
