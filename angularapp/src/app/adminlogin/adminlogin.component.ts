import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
 
    formdata = {email:"",password:""};
    submit=false;
    loading=false;
    errorMessage="";
    constructor(private auth:AuthService, private router:Router) { }
  
    ngOnInit(): void {
      this.auth.canAuthenticate();
    }
  
    onSubmit(){
      this.loading=true;
      //call login service
      this.auth.login(this.formdata.email,this.formdata.password)
      .subscribe({
          next:data=>{
              //store token
             // this.auth.storeToken(data.idToken);
              console.log('logged user token is '+data);
              this.auth.canAuthenticate();
          },
          error:data=>{
              // if (data.error.error.message=="INVALID_PASSWORD" || data.error.error.message=="INVALID_EMAIL") {
              //     this.errorMessage = "Invalid Credentials!";
              // } else{
              //     this.errorMessage = "Unknown error when logging into this account!";
              // }
          }
      }).add(()=>{
          this.loading =false;
          console.log('login process completed!');
  
      })
    }
  
  }
