import Header from './Header_aespa'; // import란 ? JavaScript에서는 다른 파일에서 함수나 클래스를 가져올 때 import를 사용해.
// Header 페이지 상단에 제목을 표시하는 컴포넌트

import Nav from './Nav_aespa';
// Nav 멤버 목록(네비게이션 메뉴)

import Article from './Article';
// Article 내용을 보여주는 컴포넌트

import Create from './Create';
// Create 새로운 멤버를 추가하는 입력 폼

import { useState } from 'react';
// useState React에서 상태를 관리하는 기능

function App() {
  const [mode, setMode] = useState('WELCOME');
  const [id, setId] = useState(0);
  const [topics, setTopics] = useState([
    { id: 1, title: '카리나', body: '' },
    { id: 2, title: '윈터', body: 'css is ....' },
    { id: 3, title: '지젤', body: 'javascript is ....' },
    { id: 4, title: '닝닝', body: 'javascript is ....' },
  ]);

  let content = null;
  if (mode === 'WELCOME') {
    //"Welcome" 메시지 보여줌
    content = <Article title="Welcome" body="Hello, WEB"></Article>;
  } else if (mode === 'READ') {
    //"READ" 선택한 멤버의 정보를 Article 컴포넌트로 전달

    let title, body;
    for (let topic of topics) {
      if (topic.id === Number(id)) {
        title = topic.title;
        body = topic.body;
        break;
      }
    }
    content = <Article title={title} body={body}></Article>;
  } else if (mode === 'CREATE') {
    //"CREATE" 입력 폼을 보여주고, 새 멤버를 추가할 수 있게 함
    content = (
      <Create
        onCreate={(_title, _body) => {
          let newTopic = { id: topics.length + 1, title: _title, body: _body };
          let newTopics = [...topics, newTopic];

          setTopics(newTopics);
          setId(newTopic.id);
          setMode('READ');
        }}
      ></Create>
    );
  }

  return (
    // <Nav topics={topics} onChangeMode={(id)=>{ alert(id);}}></Nav>
    <>
      <Header
        title="aespa"
        onChangeMode={() => {
          setMode('WELCOME');
        }}
      ></Header>
      <Nav
        topics={topics}
        onChangeMode={(_id) => {
          setId(_id);
          setMode('READ');
        }}
      ></Nav>
      {content}

      <a
        href="https://www"
        onClick={(e) => {
          e.preventDefault();
          setMode('CREATE');
        }}
      >
        CREATE
      </a>
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
