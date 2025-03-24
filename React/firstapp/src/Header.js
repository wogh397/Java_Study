export default function Header(props){ // {title : "REACT" , onChageModr:()=>{alert("Header")}} <---- Header(props)안에 들어간다
  return (
      <header>
          <h1><a href="/" onClick={(e)=>{
            e.preventDefault();
            props.onChangeMode();
          }}>{props.title}</a></h1>
      </header>
  );
}
