import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { AdminService } from '../_services/admin.service';

@Component({
  selector: 'app-adminregister',
  templateUrl: './adminregister.component.html',
  styleUrls: ['./adminregister.component.css']
})
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
    this.auth.adminRegister(this.formdata.name,this.formdata.email,this.formdata.password).subscribe((data) =>{
        console.log(data)
    })  
  }
}
