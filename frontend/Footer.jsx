import React from 'react'
import { BrowserRouter, Link, Route, Switch } from 'react-router-dom'


var footer = {
    backgroundColor: 'blue',
    paddingTop: '15px',
    paddingBottom: '20px',
    color: 'yellow',

    left: '0',
    bottom: '0',
    width: '100%',
    marginTop: '80px',
    fontFamily: "Times New Roman, Times, serif"
}

export default class Footer extends React.Component {

    render(){
        return(
            <div>
        
                <div className="footer"  style={footer}>
                    <div className="row">
                        <div className="col-md-1"></div>
                        <div className="col-md-10">
                            <table className="contact-table" style={{width: "100%"}}>
                                <tr>
                                    <th style={{width: "92px"}}>Contact:</th>
                                    <th style={{fontWeight: "normal"}}>091-494-7878</th>
                                    <th style={{float: "right", fontWeight: "normal"}}>
                                        <b>Address: </b>25 Le Loi, ward 5, district 1, Ho Chi Minh city, Vietnam 
                                    </th>
                                </tr>
                                <tr>
                                    <td style={{width: "92px"}}></td>
                                    <td>group6.restaurant@gmail.com</td>
                                    <td style={{float: "right", fontSize: "20px", fontWeight: "bold"}}>
                                        <i>Restaurant - enjoy great food with us</i>
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div className="col-md-1"></div>
                    </div>
                </div>
            </div>
        )
    }
}