export default function Header(props){ 
    // Header 라는 컴포넌트를 만들고 props로 호출
    return (
        <header>
            <h1>{props.title}</h1>
            <hr></hr>
        </header>
    );
}