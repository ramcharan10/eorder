import React from 'react'

import { BrowserRouter, Link, Route, Switch } from 'react-router-dom'

var colCentered = {
    float: 'none',
    margin: '25px auto'
}

var book_button = {
    fontWeight: 'bold',
    width: '300px',
    fontSize: '30px',
    backgroundColor: 'blue',
    color: 'yellow',
}

function hoverButtonColorOn(e) {
    e.target.style.background = '#c4941c';
}

function hoverButtonColorOff(e) {
    e.target.style.background = 'blue';
}

export default class Homepage extends React.Component {

    render() {

        return (
            <div>
                <br/>
                <div className="row">
                    <h1 style={colCentered}>Food-Group 6 Restaurant</h1>
                </div>
                <div className="row">
                    {/* Indent */}
                    <div className="col-md-1"></div> 
                    <div className="col-md-10"> 
                        <br/>
                        <img src="Kinh-nghiem-mo-chuoi-nha-hang-an-uong-kinh-doanh-am-thuc-bytuong-com.jpg" alt="pool-picture"></img>
                        <br/>
                    </div>
                    {/* Indent */}
                    <div className="col-md-1"></div> 
                </div>
                <div className="row" >
                    <div style={colCentered}>
                        <Link to="/Food List">
                            <button className="btn btn-primary" 
                            onMouseOver={hoverButtonColorOn} onMouseOut={hoverButtonColorOff} 
                            style={book_button} title="Reserve a Food">
                                Order you favorite food
                            </button>
                        </Link>
                    </div>
                    <br/>
                </div>
                <div className="row">
                    <br/>
                    <br/>
                    <h4 style={{margin: "auto", fontFamily: "Times New Roman, Times, serif", fontStyle: "italic"}}>
                        Let enjoy delicious food in restaurant
                    </h4>
                    <br/>
                </div>
                
            </div>
        )
    }
}