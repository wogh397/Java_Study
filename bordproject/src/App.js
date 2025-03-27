/* import */
import Header from "./Header";
import Menu from "./Menu";
import { useState } from "react"; 
import List from "./List";
import Write from "./Write";
import Read from "./Read";


function App() {

  const [ mode, setMode ] = useState("LIST");
  


  const menuList=[
    
    {id:1, title:"글쓰기", mode:"WRITE"},

    {id:2, title:"목록으로", mode:"LIST"}    
//   
  ];
  const [postList, setPostList] = useState([
//   

    {id:1, title:"반갑습니다.", body:"Hello", writer:"장재호"},
    {id:2, title:"반갑습니다.", body:"Hello", writer:"장재호"},
  ]);

  const [nextId, setNextId ] = useState(postList.length +1);

  
  const [ id, setId ] = useState(0);



  let content = null; 

  switch(mode){

    case "LIST":

    content=<List postList={postList} onSelect={(_mode, _id)=>{
      
      setMode(_mode);
      
      setId(_id);
    
    }}></List>;
      
      break;

    case "WRITE":
      
      content = <Write onSave={(title, body, writer)=>{

        const newpost = {id:nextId, title, body, writer};

       
        postList.push(newpost); 

        const newpostList = [...postList];
   
        setPostList(newpostList);

        setMode("LIST");

        setNextId(nextId+1);
      
      }}></Write>
    
      break;


    case "READ":

      const post = postList.find(post => Number(post.id) === Number(id));
      // if id가 1이라면 {id:1, title:"반갑습니다.", body:"Hello", writer:"장재호"}를 가져온다      
      content = <Read post={post}></Read>

      break;
  }

  return (

    <>

      <Header title="글목록"></Header>

      <Menu menuList={menuList} onChangeMode={(_mode)=>{        

        setMode(_mode);

    }}></Menu>

      {content}

    </>
    
  );
}


export default App;
