// import { useState } from "Write" 

export default function Write(props){
    //const Write = [];    
    // 함수 전달이 이루어져야 하기때문에 props
    return (
        //html 태그를
        <> 
        <form onSubmit={(e)=>{
            e.preventDefault();

        //------------ p태그 안에 입력된 내용을 전달 받아야 하기에 아래와 같이 const로 땡겨옴
            const title = e.target.title.value;
        //     
            const body = e.target.body.value;
        //
            const writer = e.target.writer.value;

            props.onSave(title, body, writer);
        //
        
        }}>

        <p><input type="text" name="title" placeholder="제목입력"></input></p>
        {/* type="text" 인 이유 : 작성(받는) 입력이 text 이기에 type은 "text로 한다" */}
        <p><textarea name="body" placeholder="내용입력"></textarea></p>
        
        <p><input type="text" name="writer" placeholder="작성자"></input></p>

        <p><input type="submit" value="저장"></input></p>
        
        </form>
        </>
);
}
