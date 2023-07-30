import { Component, ElementRef } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent {
  title = 'user-pannel';
  route: any;
  bookingId = 1;// have to change this one from static
  constructor(private el:ElementRef, private router:Router){}
  ngOnInit(): void {
      let alldrpdwn =document.querySelectorAll('.dropdow-container');
      console.log(alldrpdwn,'alldrpdwn#')
      alldrpdwn.forEach((item:any)=>{
        const a = item.parentElement?.querySelector('a:first-child');
        console.log(a,'a#');
        a.addEventListener('click',(e:any)=>{
          e.preventDefault();
          this.el.nativeElement.classList.toggle('active');
          item.classList.toggle('show');
        });
      });

    }

    responsiveMenu:any;
    //responsivemaincontent

    responsiveContent:any;
    defaultStatus=true;
    openNav(status:any){
      if(status===this.defaultStatus){
        this.responsiveMenu ={
          'display':'block'
        }
        this.responsiveContent={
          'margin-left':'150px'
        }
        this.defaultStatus = false;
      }
      
      else{
        this.responsiveMenu ={
          'display':null
        }
        this.responsiveContent={
          'margin-left':null
        }
        this.defaultStatus=true;
      }
    
    }
    logout(){
      localStorage.removeItem('admin');
      this.route.navigate(['/dashboard'])
    }
  }
