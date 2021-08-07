import React from 'react'
import Admin from './Admin.jsx'
import Homepage from './Homepage.jsx'
import Login from './Login.jsx'
import Register from './Register.jsx'
import { Link } from 'react-router-dom'

var topnav = {
    overflow: 'hidden',
    backgroundColor: 'blue',
    color: 'white'
}

var topnav_a = {
    float: 'left',
    display: 'block',
    paddingTop: '10px',
    paddingBottom: '10px',
    paddingLeft: '5px',
    paddingRight: '10px'
}

var topnav_a_active = {
    display: 'block',
    color: 'yellow',
    textAlign: 'center',
    padding: '19px 18px',
    float: 'left',
    textDecoration: 'none',
    fontSize: '30px',
    
}

var login_reg = {
    display: 'block',
    color: 'yellow',
    textAlign: 'center',
    padding: '19px 18px',
    float: 'right',
    textDecoration: 'none',
    fontSize: '30px',
    fontWeight: 'bold'
}


export default class TopNav extends React.Component {

    render(){
        return(
            <div>
                <div className="topnav" style={topnav}>
                    <div className="row">
                        <div className="col-md-1"></div>
                        <div className="col-md-10">
                            <Link to="/Home" style={topnav_a}>
                            </Link>
                            <Link to="/Register" style={login_reg}>Register</Link>
                            <Link to="/Login" style={login_reg}>Log in</Link>
                            <Link to="/Logout" style={login_reg}>Log out</Link>
                        </div>
                        <div className="col-md-1"></div>
                    </div>
                </div>
            </div>
        )
    }
}