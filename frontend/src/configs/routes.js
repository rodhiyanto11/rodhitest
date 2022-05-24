import React from 'react'
const Home = React.lazy(() => import('../pages/Home'))
const Office = React.lazy(() => import('../pages/Office'))


const routes = [
    {

        path: "/",
        exact : true,
        component: Home
    },
    {

        path: "/office",
        component: Office
    },
    
]

export default routes;