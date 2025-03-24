export default function Nav(props){ // {  topics : [ ... ], onChageMode : (id)=>{alert(id);}}
  const lis =[]; // 빈배열 정의
  for(let i=0; i<props.topics.length; i++){ // let i=는 0, i 보다 lis가 큰 , 반복 증가
    let t = props.topics[i]; // t는 props.topics[i] 
    
    //  태그안에 li 안에 객체를 여러개 만들어서 넣어줄수 있다.
    lis.push(<li key={t.id}><a id={t.id} href={'/read/'+t.id} onClick={(e)=>{
      e.preventDefault(); // onClick={(e) 해당 기능 정지
      props.onChangeMode(e.target.id); 
    }}>{t.title}</a></li>);
}
return ( 
    <nav>
        <ol>
          {lis}
        </ol>
     </nav>

  );
}