export default function Create(props){ // 새로운 타이틀과 바디를 만들어준다.,props는 객체
    return (
        <article>
            <h2>Create</h2>
            
            <form onSubmit={(e)=>{
        // 폼태그 안에 들어가는 함수.
            e.preventDefault();
            
                const title = e.target.title.value;
                
                const body = e.target.body.value;
                
                props.onCreate(title, body);
            
            }}>
                <p><input type="text" name="title" placeholder="title"></input></p>
                
                <p><textarea name="body" placeholder="body"></textarea></p>
                
                <p><input type="submit" value="Create"></input></p>
            
            </form>
        </article>
    );
}