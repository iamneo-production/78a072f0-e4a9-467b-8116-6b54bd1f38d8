import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  data:any
  formdata = {email:"",password:""};
  submit=false;
  loading=false;
  errorMessage="";
  constructor(private auth:AuthService,private router:Router) { }

  ngOnInit(): void {
    this.auth.canAuthenticate();
  }

  onSubmit(){
    this.loading=true;
    //call login service
     this.auth.storeToken(this.data.idToken);
    this.auth.login(this.formdata.email,this.formdata.password)
    .subscribe({
        next:data=>{
            console.log('logged user token is '+data);
            this.auth.canAuthenticate();
            
        },
        error:data=>{
            if (data.error.error.message=="INVALID_PASSWORD" || data.error.error.message=="INVALID_EMAIL") {
                this.errorMessage = "Invalid Credentials!";
            } else{
                this.errorMessage = "Unknown error when logging into this account!";
            }
        }
    }).add(()=>{
        this.loading =false;
        this.router.navigate(['/user-dashboard']);
        // console.log('login process completed!');
    })
  }

}