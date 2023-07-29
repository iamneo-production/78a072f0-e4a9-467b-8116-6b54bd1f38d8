import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { Route, Router } from '@angular/router';
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
    constructor(private auth:AuthService,private router:Router) { }
  
    ngOnInit(): void {
      this.auth.canAuthenticate();
    }
  
    onSubmit(){
      this.loading=true;
      //call login service
      this.auth.login(this.formdata.email,this.formdata.password)
      .subscribe({
          next:data=>{
              console.log('logged user token is '+data);
              this.auth.canAuthenticate();
          },
          error:data=>{
          }
      }).add(()=>{
          this.loading =false;
          console.log('login process completed!');
          this.router.navigate(['/admin-dashboard/dashboard']);
      })
    }
  
  }
