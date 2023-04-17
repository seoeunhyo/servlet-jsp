//여기는 js 영역입니다.

alert("javaScript 입니다.^^");

//첫번째 버튼이 클릭되었을때 호출될 함수를 만들어보자.
function btn1Check(e){
	//e는 이벤트의 종류
	//target은 이벤트를 일으키는 주체

//e.target은 버튼이 되므로 그것의 css를 변경해라 
	alert(e);
	e.target.style.backgroundColor="red";
	e.target.style.color="white";
}

//3개의 버튼이 각각 클릭되었을 때 공통으로 사용하는 함수
function btnFun(){
	console.log("클릭되었습니다.")
}