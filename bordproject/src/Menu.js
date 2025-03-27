export default function Menu(props){ 
// {menuList[{id,title, mode},{}]}, 전달받음
    // 빈 배열 
    // props.menuList는 재료만 있음
    const menuLst=[]; // 빈배열생성
    for(let m of props.menuList){
        const item = 
        <a key={m.id} href="/"  style={{marginRight:"10px"}} onClick={(e)=>{
            e.preventDefault();
            
            props.onChangeMode(m.mode)
        
        }}>{m.title}</a>; // m에 props.menuList 이다.
        
        menuLst.push(item);
    // const menuLst 빈배열에 item을 넣어준다.
    }



    return(
        <>
        {menuLst}
        <hr></hr>
        </>
    ); 
}
//     <>
//     <a href="/" onClick={(e)=>{
//         e.preventDefault();
//         props.onChangeMode("WRITE");
//     }}>글쓰기</a>&nbsp;&nbsp;
//            {/* &nbsp;는 밑줄? */}
//     {/* <a태그> 글쓰기 "WRITE" 한덩이씩 배열 객체로 묶어준다 */}
    
//     <a href="/" onClick={(e)=>{
//         e.preventDefault();
//         props.onChangeMode("LIST");
//     }}>목록으로</a>

//     </>
//     // 모드값만 넘겨주면됨
