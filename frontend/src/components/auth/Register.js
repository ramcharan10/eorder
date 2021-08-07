import React, { useState, useContext } from "react";
import { UserContext } from "../../App";
import ErrorMsg from "../ErrorMsg";
import axios from "axios";
import { Button } from "react-bootstrap";

const Register = () => {
  const { userData, setUserData } = useContext(UserContext);

  const [user, setUser] = useState({
    name: "",
    password: "",
    email: "",
    phone:"",
    address:"",
  });
  const [errorMsg, setErrorMsg] = useState();

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const newUser = {
        name: user.name,
        password: user.password,
      };

      

      const loginResponse = await axios.post("/customeraccounts/register", newUser);
      setUserData({
        token: loginResponse.data.token,
        user: loginResponse.data.user,
      });
      localStorage.setItem("auth-token", loginResponse.data.token);

      setUser({
        name: "",
        password: "",
        email: "",
        phone:"",
        address:"",
      });

      window.location = "/productlist";
    } catch (err) {
      err.response.data.msg
        ? setErrorMsg(err.response.data.msg)
        : setErrorMsg("We have some error!");
    }
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setUser((oldUser) => {
      return {
        ...oldUser,
        [name]: value,
      };
    });
  };

  return (
    <div>
      <h1>Register Here</h1>
      <br/>
      {errorMsg && <ErrorMsg msg={errorMsg} />}

      <form onSubmit={handleSubmit}>
        <label>User Name&nbsp; </label>
        <input
          type="text"
          name="name"
          value={user.name}
          required
          onChange={handleChange}
        />
        <br />
        <label>Password&nbsp; </label>
        <input
          type="password"
          name="password"
          value={user.password}
          onChange={handleChange}
        />
        <br />
        <label>Email&nbsp; </label>
        <input
          type="text"
          name="email"
          value={user.email}
          onChange={handleChange}
        />
        <br />
        <label>Phone&nbsp; </label>
        <input
          type="text"
          name="phone"
          value={user.phone}
          onChange={handleChange}
        />
        <br />
        <label>Address&nbsp; </label>
        <input
          type="text"
          name="address"
          value={user.address}
          onChange={handleChange}
        />
        <br />
        <Button variant="primary" type="submit">Sign up!</Button>
      </form>
    </div>
  );
};

export default Register;
