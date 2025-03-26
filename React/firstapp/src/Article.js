export default function Article(props) { // 타이틀,바디를 전달받는다.
    return (
      <article>
        <h2>{props.title}</h2>
        {props.body}
      </article>
    );
}
  
    