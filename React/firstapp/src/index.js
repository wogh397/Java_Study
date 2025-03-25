import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App_aespa';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    
  {/* <App />란? 첫글자는 대문자로 해야함. 컴퍼넌트 함수를 만들어낸다 */}
  {/* 컴퍼넌트란? html 태그를 만들어서 함수를 만들어서 리턴해주는것 */}

    <App />

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
