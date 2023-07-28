import { Component, OnInit} from '@angular/core';
import { CustomerService } from '../customer.service';

import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  selectedImage: string| null=null;
   customerId: string='';
    name: string='';
    email: string='';
    phone: string='';
  isEditMode: boolean | undefined;


  
    constructor(private customerservice:CustomerService,  private route: ActivatedRoute) { }
  ngOnInit(): void {
 
  }
  
    
    public onFileSelected(event: any): void {
      const file: File = event.target.files[0];
      this.selectedImage = URL.createObjectURL(file);
    }

  
    saveProfile() {
    
      console.log('Profile submitted!');
      console.log('CustomerId:', this.customerId);
      console.log('name:', this.name);
      console.log('Email:', this.email);
      console.log('Phone:', this.phone);

      this.isEditMode = false;
      const formData = {
        customer:this.customerId,
        name: this.name,
        email: this.email,
        phone: this.phone,
  

      };
  
      this.customerservice.saveCustomer(formData).subscribe(
        (response) => {
          console.log('Profile saved successfully!', response);
        },
        (error) => {
          console.error('Error saving profile:', error);
        }
      );
    }
  
    editProfile() {
      this.isEditMode = true;
    }
 
    cancelProfile() {
      console.log('Profile canceled!');
      this.resetForm();
    }
    private resetForm() {
      this.selectedImage = null;
      this.customerId='';
      this.name = '';
      this.email = '';
      this.phone = '';

    }


  }