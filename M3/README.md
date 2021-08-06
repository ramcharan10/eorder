# SEPT2020
Online booking system

Separate repo for frontend: https://github.com/tcduyrando/sept2020asm_frontend
Separate repo for backend: https://github.com/giaminhphamle/SEPT2020-backend-deploy
Frontend is deployed Heroku: https://sept2020frontend.herokuapp.com/
Backend is not yet deployed.

How to get application running:
- frontend: cd to frontend folder
            npm install
            npm start
            access frontend web at localhost:9000
- backend: mvn clean install
           mvn jetty:run
           access APIs at: localhost:8080/rooms/all
                           localhost:8080/roomtypes/all
                           localhost:8080/bookings/all
                           localhost:8080/customeraccounts/all

Current functionality:
- Create an account
- Login authentication for users and admin
(Admin account: email: admin@gmail.com; password: admin1234)
- Allow users to edit their profile information (change email, password, name, phone number, credit card number)
- Allow users to book rooms and filter rooms by type, price range, wifi and smoking.
- Allow users to cancel booking if it is still pending admin approval
- Allow admin to add/edit room types and rooms
- Allow admin to view, accept/reject bookings 
- Allow admin to filter bookings by room type, room number, customer name, total cost, arrival/checkout date, status (pending/accepted/rejected)
- Allow users to leave feedback on a booking after it is accepted.
- Realtime form error detection
- Error 

API routes:
  url = 'localhost:8080'
  - roomtypes: 
    Get all room types (GET):   url + '/roomtypes/all'
    Get room type by ID (GET):  url + '/roomtypes/{id}'
    Delete room type (DELETE):  url + '/roomtypes/{id}'
    Add room type (POST):       url + '/roomtypes'
    Update room type (PUT):     url + '/roomtypes'
    
  - rooms:
    Get all rooms (GET):        url + '/rooms/all'
    Get room by ID (GET):       url + '/rooms/{id}'
    Get rooms by type (GET):    url + '/rooms/type/{id}'
    Delete room type (DELETE):  url + '/rooms/{id}'
    Add room (POST):            url + '/rooms'
    Update room (PUT):          url + '/rooms'
    
  - bookings:
    Get all bookings (GET):   url + '/bookings/all'
    Get booking by ID (GET):  url + '/bookings/{id}'
    Delete booking (DELETE):  url + '/bookings/{id}'
    Add booking (POST):       url + '/bookings'
    Update booking (PUT):     url + '/bookings'
    
  - customeraccounts:
    Get all customer accounts (GET):   url + '/customeraccounts/all'
    Get customer account by ID (GET):  url + '/customeraccounts/{id}'
    Delete customer account (DELETE):  url + '/customeraccounts/{id}'
    Add customer account (POST):       url + '/customeraccounts'
    Update customer account (PUT):     url + '/customeraccounts'
