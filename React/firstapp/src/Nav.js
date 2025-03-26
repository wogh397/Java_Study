export default function Nav(props){ //props는 객체 {  topics : [ 배열이 들어옴 ], onChageMode : (id)=>{alert(id);}}
  const lis =[]; // 빈배열 정의 ,리스트 빈배열 만듬
  
  for(let i=0; i<props.topics.length; i++){ // let i=는 0, i 보다 lis가 큰 , 반복 증가
  
    let t = props.topics[i]; // t는 props.topics[i] 
    // t 는 객체 = 객체 이름은 사용자가 임의로 정할수있음
    //  태그안에 li 안에 객체를 여러개 만들어서 넣어줄수 있다.
  
    lis.push(<li key={t.id}><a id={t.id} href={'/read/'+t.id} onClick={(e)=>{
      //    <key = li 이다. ><a 태그 안에 id 
  
      e.preventDefault(); // onClick={(e) 클릭을 하면.
  
      props.onChangeMode(e.target.id); // 
  
    }}>{t.title}</a></li>);
    // li객체 안에 a 객체로 속성,함수 를 하나에 객체로 li로 push 빈배열에 넣음
}
return ( 
    <nav>
        <ol>
          {lis}
        </ol>
    </nav>

  );
}