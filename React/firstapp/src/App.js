import Header from "./Header";
import Nav from "./Nav";
import Article from "./Article";


function App() {
  const topics = [ 
    {id:1, title:"html", body:"html is ...."},
    {id:2, title:"css", body:"html is ...."},
    {id:3, title:"javascript", body:"html is ...."},
  ];
  return (
    <>
      <Header title="REACT" onChangeMode={()=>{ alert("Header");}}></Header>  
      <Nav topics={topics} onChangeMode={(id)=>{ alert(id);}}></Nav> 
      <Article title="Welcome" body="hello, web"></Article>
    </>
  );
}
export default App;


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


// function App() {
//   const loginYn = 'Y';
//   return (
//    <>
//     <div>
//      {loginYn === 'Y' && <div>홍창기 입니다.</div>}
//     </div>
//    </>
//   ); }


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