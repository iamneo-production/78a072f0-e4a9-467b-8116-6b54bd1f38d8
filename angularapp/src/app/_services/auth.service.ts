import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  Adminlogin: any;

  constructor(private router:Router,private http:HttpClient) { }

  isAuthenticated():boolean{
    if (sessionStorage.getItem('token')!==null) {
        return true;
    }
    return false;
  }

  canAccess(){
    if (!this.isAuthenticated()) {
        //redirect to login
        this.router.navigate(['/login']);
    }
  }

  canAuthenticate(){
    if (this.isAuthenticated()) {
      //redirect to dashboard
      this.router.navigate(['/dashboard']);
    }
  }

  register(name:string,email:string,password:string){
let user={
  username : name,
  password : password,
  email : email
} 
let headers = new HttpHeaders().set('content-type','application/json').set('Access-Control-Allow-Origin', '*');;
    return this.http.post("http://localhost:8080/register",JSON.stringify(user),{ headers : headers})
  }

  storeToken(token:string){
      sessionStorage.setItem('token',token);
  }

  login(email:string,password:string){
    
     let headers = new HttpHeaders().set('Content-Type','application/json')
     return this.http.post("http://localhost:8080/login",JSON.stringify({username:email,password:password}),{headers:headers})

  }
  adminlogin(email:string,password:string){
     let headers = new HttpHeaders().set('Content-Type','application/json')
     return this.http.post("http://localhost:8080/adminlogin",JSON.stringify({username:email,password:password}),{headers:headers})
  }
  adminregister(name:string,email:string,password:string){
let admin={
username : name,
password : password,
email : email
} 
let headers = new HttpHeaders().set('content-type','application/json').set('Access-Control-Allow-Origin', '*');;
  return this.http.post("http://localhost:8080/adminregister",JSON.stringify(admin),{ headers : headers})
}

  detail(){
    let token = sessionStorage.getItem('token');
    return this.http.post<{users:Array<{localId:string,displayName:string}>}>(
        'https://identitytoolkit.googleapis.com/v1/accounts:lookup?key=[API_KEY]',
        {idToken:token}
    );
  }
  removeToken(){
    sessionStorage.removeItem('token');
  }
}