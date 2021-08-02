import React from 'react'
import Homepage from './Homepage.jsx'
import { Link } from 'react-router-dom'



var topnav = {
    overflow: 'hidden',
    backgroundColor: 'blue',
}


var topnav_a = {
    float: 'left',
    display: 'block',
    paddingTop: '10px',
    paddingBottom: '10px',
    paddingLeft: '5px',
    paddingRight: '10px',
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

export default class TopNavAd extends React.Component {

    render(){
        return(
            <div>
                <div className="topnav" style={topnav}>
                    <div className="row">
                        <div className="col-md-1"></div>
                        <div className="col-md-10">
                            <Link to="/Homepage" style={topnav_a}>
                                <img src="logo.png" alt="Bootleg RMIT"></img>
                            </Link>
                            <Link to="/ProjectsPage" style={topnav_a_active}>Projects</Link>
                        </div>
                        <div className="col-md-1"></div>
                    </div>
                </div>
            </div>
        )
    }
}