import firebase from 'firebase';

var config = {
    apiKey: "AIzaSyDiDKRDkV6KnhOq3iahf8CHZ9hY3wmLu0w",
    authDomain: "onlineorderingapp-64bc3.firebaseapp.com",
    projectId: "onlineorderingapp-64bc3",
    storageBucket: "onlineorderingapp-64bc3.appspot.com",
    messagingSenderId: "227918150827",
    appId: "1:227918150827:web:1b75e2acc053cd30e38bee"
  };

  const fire = firebase.initializeApp(config);
  export default fire;
  