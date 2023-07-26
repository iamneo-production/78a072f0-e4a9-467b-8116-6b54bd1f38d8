import { Component, OnInit } from '@angular/core';
import { AdminService } from '../_services/admin.service';
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
  isAuthenticated: boolean | undefined;
    constructor(private auth:AdminService) { }
  
    ngOnInit(): void {
      this.isAuthenticated = this.auth.canAuthenticate();
    }
  
    onSubmit(){
      this.loading=true;
      this.auth.adminLogin(this.formdata.email,this.formdata.password)
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
  
      })
    }
  
  }
