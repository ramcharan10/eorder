import React from 'react'

var colCentered = {
    float: 'none',
    margin: '0 auto'
}

/* Make the "Register" button bold */
var register_button = {
    fontWeight: 'bold',
    width: '400px',
    float: 'none',
    margin: '30px auto',
    fontSize: '35px',
    backgroundColor: 'blue',
    color: 'yellow'
}

function hoverButtonColorOn(e) {
    e.target.style.background = '#c4941c';
}

function hoverButtonColorOff(e) {
    e.target.style.background = 'blue';
}

export default class Register extends React.Component{
 
    constructor(){
        super()
        this.state = {
            customerAccounts: [],
            username: '', 
            password: '',
            email: '',
            phone: '',
            address: '',
        }
    }

   // fetchCustomerAccounts() {
     //   var url = 'http://localhost:8080/customeraccounts/all'
       // fetch(url)
        //.then(res=>res.json())
        //.then(json=>
          //  this.setState({ customerAccounts: json }) )
  //  }

    componentDidMount() {
        this.fetchCustomerAccounts()
    }

    handleChange(e) {
        var obj = {}
        obj[e.target.name] = e.target.value
        this.setState(obj)
    }
    
    addCustomerAccount() {
        var methodVar = 'post'
           // var url = 'http://localhost:8080/customeraccounts';
        fetch(url, {
            method: methodVar,
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json',
                'Postman-Token': '<calculated when request is sent>',
                'Content-Length': '<calculated when request is sent>',
                'Host': '<calculated when request is sent>',
                'User-Agent': 'PostmanRuntime/7.26.2',
                'Accept-Encoding': 'gzip, deflate, br',
                'Connection': 'keep-alive'
            },
            body: JSON.stringify({
                name: this.state.name,
                password: this.state.password,
                email: this.state.email,
                phone: this.state.phone,
                address: this.state.address
            })
        })
            .then(res => res.json())
            .then(json => this.fetchCustomerAccounts())
            .then(console.log("add account"))
    }
 
    render(){
        return(
        <div className="container">
            <br/>
            <h2>Register</h2>
            <br/>
            Username:<input type='text' className="form-control" id='name' name='username' value={this.state.username}
              onChange={this.handleChange.bind(this)}/>
            <br/>
            Password:<input type='password' className="form-control" id='password' name='password' value={this.state.password}
              onChange={this.handleChange.bind(this)}/>
            <br/>
            Email:<input type='email' className="form-control" id='email' name='email' value={this.state.email}
              onChange={this.handleChange.bind(this)}/>
            <br/>
            Phone:<input type='phone' className="form-control" id='phone' name='phone' value={this.state.phone}
              pattern = "[\d]{6,15}" title = "phone number include from 6 to 15 digits"
              onChange={this.handleChange.bind(this)}/>
            <br/>
            Address:<input type='address' className="form-control" id='address' name='address' value={this.state.address}
              onChange={this.handleChange.bind(this)}/>
            <br/>
            <button className="btn btn-primary" onClick={this.addCustomerAccount.bind(this)}
                    onMouseOver={hoverButtonColorOn} onMouseOut={hoverButtonColorOff} 
                    style={register_button} title="New account is created" >
                        New account is created
                    </button>
        </div>
       
        )
    }
 
}