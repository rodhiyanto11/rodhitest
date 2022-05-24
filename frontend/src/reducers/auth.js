import axios from "axios"
const initialState = {
    isLogin: localStorage.getItem("isLogin"),
    access_token: localStorage.getItem("access_token")
}
const auth = (state = initialState, action) => {
    
    switch (action.type) {
        case 'AUTH_LOGIN':
            axios.defaults.headers.common['Authorization'] = "Bearer " + action.payload.data.access_token;
            localStorage.setItem("isLogin", true)
            localStorage.setItem("access_token", action.payload.data.access_token)
            localStorage.setItem("status", action.payload.data.status)
            return {
                ...state,
                isLogin: localStorage.getItem("isLogin"),
                status: localStorage.getItem("status"),
                isToken: localStorage.getItem("access_token")
            }
        case 'AUTH_LOGOUT':
            
            return {
                ...state,
                isLogin: localStorage.getItem("isLogin"),
                isLogin: localStorage.getItem("status"),
                isToken: localStorage.getItem("access_token")
            }
        default:
            return state
    }
}


export default auth