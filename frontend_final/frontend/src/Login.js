import React from 'react';
import fire from './config/fire';

class Login extends React.Component {

   
    login() {
        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;

        fire.auth().signInWithEmailAndPassword(email, password)
        .then((u) => {
            console.log("Log In Successfully");
        })
        .catch((err) => {
            console.log("Error: " + err.toString());
        })
        } 

    signUp() {
        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;

        fire.auth().createUserWithEmailAndPassword(email, password)
        .then((u) => {
            console.log(" Sign Up Successfully");
        })
        .catch((err) => {
            console.log("Error: " + err.toString());
        })
    }


    render(){
        return(
            <div style={{ textAlign: 'center' }}>
                <div>
                    <h1>Log In</h1>
                    <div>Email</div>
                    <input id="email" placeholder="Email: " type="text"/>
                </div>
                <div>
                    <div>Password</div>
                    <input id="password" placeholder="Password: " type="text"/>
                </div>
                <button style={{margin: '30px'}} onClick={this.login}>Login</button>
                <button style={{margin: '30px'}} onClick={this.signUp}>Sign Up</button>
            </div>
        )
    }
}

export default Login;