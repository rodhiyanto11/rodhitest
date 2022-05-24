import './App.scss'
import React, { Suspense, useReducer } from 'react'
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from 'react-router-dom'

import routes from "./configs/routes"
import Loading from './pages/Loading'
import { connect } from 'react-redux'
const App = (props) => {
    const RouteWithSubRoutes = (route) => {
        return (

            <Route
                path={route.path}
                render={props => (

                    <route.component {...props} routes={route.routes} />
                )}
            />
        )

    }
    return (
        <div className="App">
            
            <Router>
                <Route />
                {/* <AuthContext.Provider value={{ state, dispatch }}> */}
                <Suspense fallback={<Loading />}>
                   
                    {

                        (() => {
                            // console.log(localStorage.getItem("isLogin"))
                            const helpLink = [];
                            localStorage.getItem("isLogin") ?
                                helpLink.push(
                                    <React.Fragment>
                                        <div to="/help" class="float">
                                            <Link to="/help"><button className="btn  white" style={{ fontSize: "16px" }}><strong>Butuh Bantuan ?</strong></button></Link>
                                        </div>
                                    </React.Fragment>
                                ) : helpLink.push("")
                            return helpLink
                        })()
                    }
                    <Switch>
                        {routes.map((route, i) => (
                            <RouteWithSubRoutes key={i} {...route} />
                        ))}
                    </Switch>
                    
                </Suspense>
                {/* </AuthContext.Provider> */}
            </Router>
        </div>
    )
}

const mapStateToProps = (state) => {
    return (
        {
            isLogin: state.auth.isLogin
        }
    )

}
export default connect(mapStateToProps)(App)