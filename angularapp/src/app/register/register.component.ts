import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  formdata = {name:"",email:"",password:""};
  submit=false;
  errorMessage="";
  loading=false;

  constructor(private auth:AuthService, private router:Router) { }

  ngOnInit(): void {
    this.auth.canAuthenticate();
  }

  onSubmit(){

      this.loading=true;

      //call register service
    //   this.auth
    //   .register(this.formdata.name,this.formdata.email,this.formdata.password)
    //   .subscribe({
    //       next:data=>{
    //           //store token from response data
    //          // this.auth.storeToken(data.idToken);
    //          // console.log('Registered idtoken is '+data.idToken);
    //          // this.auth.canAuthenticate();
    //         console.log("registered", data);
    //       },
    //       error:data=>{
    //         //   if (data.error.error.message=="INVALID_EMAIL") {

    //         //       this.errorMessage = "Invalid Email!";

    //         //   } else if (data.error.error.message=="EMAIL_EXISTS") {

    //         //       this.errorMessage = "Already Email Exists!";

    //         //   }else{

    //         //       this.errorMessage = "Unknown error occured when creating this account!";
    //         //   }
    //         console.log(data);
    //       }
    //   }).add(()=>{
    //       this.loading =false;
    //       console.log('Register process completed!');
    //   })
    this.auth.register(this.formdata.name,this.formdata.email,this.formdata.password).subscribe((data) =>{
        console.log(data)
    })  
  }

}