import { useState } from "react";

export default function Update(props){
    const [title, setTitle] = useState(props.title);
    // p 태그 안에 , value 속성을 적용시키기 위해, State 를 만들어놔야함,
    const [body, setBody] = useState(props.body);
    
    return (
        <article>
            <h2>update</h2>
            
            <form onSubmit={(e)=>{

                e.preventDefault();
            
                // const title = e.target.title.value;
                
                // const body = e.target.body.value;
                
                props.onUpdate(title, body);
                // props를 넘겨받아오고 넘겨줌
            
            }}>
                <p><input type="text" name="title" value={title} onChange={(e)=>{
                // value 속성 / 변수{title} = 위에 State를 value값을 적용시킴   
                    setTitle(e.target.value);

                }}></input></p>
                
                <p><textarea name="body" value={body} onChange={(e)=>{
                // value 속성 / 변수{body} = 위에 State를 value값을 적용시킴   
                    setBody(e.target.value);

                }}></textarea></p>
                
                <p><input type="submit" value="Update"></input></p>
                

            </form>
        </article>
    );
}
