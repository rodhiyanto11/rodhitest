const initialState = {
    text: localStorage.getItem("text"),
    category: localStorage.getItem("category")
}

const search = (state = initialState, action) => {
    
    switch (action.type) {
        case 'SEARCH_SUBMIT':
            
            localStorage.setItem("text", action.payload.text)
            localStorage.setItem("category", action.payload.category)
            return {
                ...state,
                text: localStorage.getItem("text"),
                category: localStorage.getItem("category")
            }
        default:
            return state
    }
}


export default search