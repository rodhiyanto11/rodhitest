import {combineReducers} from 'redux'
import auth from './auth'
import search from './search'

const allReducer = combineReducers({
    auth : auth,
    search : search
   
})
export default allReducer;
