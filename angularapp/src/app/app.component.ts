import { Component, ElementRef, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
<<<<<<< HEAD
  title = 'user-pannel';
  route: any;
  bookingId = 1;// have to change this one from static
  constructor(private el:ElementRef){}
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


=======
<<<<<<< HEAD
<<<<<<< HEAD
 
   
  }
=======

  title = 'myapp';
}

  
}

>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d
=======

  
  }


=======
  title = 'angularapp';
}
>>>>>>> 1bc3d03d4f20e9c43bdea68868f4caecc5336f8f
>>>>>>> 6120d8a7af0dfc6e0ba75df0003c7fe594d06190
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
