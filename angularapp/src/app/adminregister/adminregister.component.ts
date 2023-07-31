<<<<<<< HEAD
import { Component } from '@angular/core';
=======
import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { AdminService } from '../_services/admin.service';
>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d

@Component({
  selector: 'app-adminregister',
  templateUrl: './adminregister.component.html',
  styleUrls: ['./adminregister.component.css']
})
<<<<<<< HEAD
export class AdminregisterComponent {

=======
export class AdminregisterComponent implements OnInit {

  formdata = {name:"",email:"",password:""};
  submit=false;
  errorMessage="";
  loading=false;

  constructor(private auth:AdminService) { }

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
    this.auth.adminRegister(this.formdata.name,this.formdata.email,this.formdata.password).subscribe((data) =>{
        console.log(data)
    })  
  }
>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d
}
