import React from 'react';
import fire from './config/fire';

class Signup extends React.Component {


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
                    <h1>Sign Up</h1>
                    <div>Username</div>
                    <input id="Username" placeholder="Username: " type="text"/>
                </div>
                <div>
                    <div>Password</div>
                    <input id="password" placeholder="Password: " type="text"/>
                </div>
                <div>
                    <div>Email</div>
                    <input id="email" placeholder="Email: " type="text"/>
                </div>
                <div>
                    <div>Phone</div>
                    <input id="phone" placeholder="Phone: " type="text"/>
                </div>
                <div>
                    <div>Address</div>
                    <input id="address" placeholder="Address: " type="text"/>
                </div>
                <button style={{margin: '30px'}} onClick={this.signUp}>Sign Up</button>
            </div>
        )
    }
}

export default Signup;