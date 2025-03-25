let x, y, z; 
[x, y] = [1, 2];                // 1=(인덱스 값)이 X로 들어간다 / y도 마찬가지
console.log(x, y);              // 결과 : 1 2 // x=1 , y=2

[x, y] = [1];                   // 1=(인덱스 값)이 x로 들어간다 / x=1 , y= (없음)
console.log(x, y);              // 결과 : 1 undefined 

[x, y] = [1, 2, 3];             // 객체 x,y가 두개 / 배열안에 1,2,3 3개가 있음, 그러나 객체가 두개여서 1,2만 들어간다.
                                // 3은 없어짐
console.log(x, y);              // 결과 :1 2 

                                //         ↓(빈칸)
[x, , z] = [1, 2, 3];           // [객체 x,    ,z] / 객체 안에 배열(함수)가 3개 1,2,3 
console.log(x, z); // 1 3       // 결과 : x=1,  ,z=3 빈칸 배열(함수)2번은 없어진다.

// 기본값
[x, y, z = 3] = [1, 2];         //[객체 x,y,z=3] / 객체 안에 배열(함수)가 1,2 
console.log(x, y, z); // 1 2 3  // 결과 : x=1,y=2,z=3 / z=3은 미리 객체안에 3이라고 정해놓음 

[x, y = 10, z = 3] = [1, 2]; 
console.log(x, y, z); // 1 2 3
//----------------------------------------------------------------------------------------------

const obj = { firstName: 'jihwan', lastName: 'Oh' };
//               
//
// 프로퍼티키를기준으로디스트럭처링할당이이루어진다. 
//순서는의미가없다.
const { lastName, firstName } = obj; // {} 중괄호 안에 있으면 객체이다.
//    {퍼스트네임:jihwan , 라스트네임: oh }
console.log(firstName, lastName);  // jihwan Oh

//--------------------------------------------------------------------------------------------

// 프로퍼티키가prop1인프로퍼티의값을변수p1에할당
// 프로퍼티키가prop2인프로퍼티의값을변수p2에할당
const { prop1: p1, prop2: p2 } = { prop1: 'a', prop2: 'b' };
// prop1 : p1 = a , prop2: p2 = b / prop1 : a가 p1으로 간다 / prop2 : b가 p2로 간다

 console.log(p1, p2); // 'a' 'b' / 

 console.log({ prop1: p1, prop2: p2 }); // { prop1: 'a', prop2: 'b' }


 // 아래는위의축약형
 const { prop1, prop2 } = { prop1: 'a', prop2: 'b' };
 // prop1 = a , prop2 = b 

 console.log({ prop1, prop2 }); // { prop1: 'a', prop2: 'b' }
 // 중괄호{ }가 있으므로, 객체가 만들어짐
 

 // default value
 const { prop1, prop2, prop3 = 'c' } = { prop1: 'a', prop2: 'b' };
// 나눠담는 표현식 ↑↑↑↑↑↑↑↑↑↑↑ = prop1 = a , prop2 = b , prop3 = c 이다

 console.log({ prop1, prop2, prop3 }); 
 //결과 : { prop1: 'a', prop2: 'b', prop3: 'c' }

//----------------------------------------------------------------------------------------------