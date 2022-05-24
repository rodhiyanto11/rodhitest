import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

import reportWebVitals from './reportWebVitals';

import 'jquery/dist/jquery.min.js';
import 'bootstrap/dist/js/bootstrap.min.js';
import 'bootstrap/dist/js/bootstrap.js';
import 'react-toastify/dist/ReactToastify.css';
import { ToastContainer } from 'react-toastify'
import 'popper.js'
import { createStore } from 'redux'
import { Provider } from 'react-redux'
import allReducers from './reducers/index.js'
import axios from 'axios'
const axiosApiInstance = axios.create();
const clearStorage = async () => {
  localStorage.clear()

}
axios.interceptors.response.use(response => {
  return response;
}, function(error) {
//  console.log(error.response)
const originalRequest = error.config;
 if (error.response.status === 401) {
  //  handle401()
      originalRequest._retry = true;
      // refresh(); 
      return new Promise(function (resolve, reject) {
      axios.post(`${process.env.REACT_APP_API_HOST}` + "/users/refresh_token")
        .then(async (res) => {
                try {
                  localStorage.setItem("token",res.data.token)
                  axios.defaults.headers.common['Authorization'] = 'Bearer ' + res.data.token;
                  originalRequest.headers.Authorization = 'Bearer ' + res.data.token
                  return resolve(axios(originalRequest));
                } catch (error) {
                  // console.log(222)
                  localStorage.clear()
                  return Promise.reject(error)
                }
          }) 
          .catch(error => {
            // console.log(222)
            window.location.href = '/login'
            localStorage.clear()
            return Promise.reject(error)
          })
        })  
      
 }
 return Promise.reject(error)
});
const store = createStore(
  allReducers,
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
)

ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
      <ToastContainer autoClose={false} draggable={false} />
      <App />
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
