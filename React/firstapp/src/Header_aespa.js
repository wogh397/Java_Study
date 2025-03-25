export default function Header(props){ // {title : "REACT" , onChageModr:()=>{alert("Header")}} <---- Header(props)안에 들어간다
  return (
      <header>
                   {/* a태그 안에 "/"는 새로고침 온클릭안에 함수 */}
                   {/* e.preventDefault 는 새로고침 기능 정지 */}
          <h1><a href="/" onClick={(e)=>{
            e.preventDefault();
            props.onChangeMode();
          }}>{props.title}</a></h1>
      </header>
  );
}
