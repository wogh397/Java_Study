export default function List(props) {
    // 왜 빈 배열이 필요할까요?
    // 빈배열에 속성을 넣기위해 필요
    const postArr = []; // 빈 배열
    for(let l of props.postList) {
    // porstList 속성을 가져옴    
        const item = //임시변수

    // 한번에 하나의 태그만 가능하지만
    // <></> 빈태그로 하나로 묶어주면 가능    
    // <a></a> a태그를 만들어 
        <>
        <a key={l.id} href="/">
           {l.title}(작성자:{l.writer})
        </a>
        <hr></hr></>;
        //빈배열 PostArr에 item이라는 변수를 넣는다
        postArr.push(item);
    }
  return (
    <>
    {/* postArr은 배열 */}
        {postArr}  
    </>
  );
}
