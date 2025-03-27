export default function Read(props){
    

    

    //props.post
    return(
        // <>
        // <form >
        // <p><input></input></p>

        // <p><textarea ></textarea></p>
        
        // <p><input ></input></p>

        // <p><input ></input></p>
        // </form>
        // </>
        <>
        <form>
            <input value={props.post.title}></input>
            <h1>제목 : {props.post.title}</h1>
            <h1>내용 : {props.post.body}</h1>
            <h1>작성자 : {props.post.write}</h1>
        </form>
        </>
);
}