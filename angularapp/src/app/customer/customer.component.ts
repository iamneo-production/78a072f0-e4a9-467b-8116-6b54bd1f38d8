import { Component, OnInit} from '@angular/core';
import { CustomerService } from '../customer.service';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  profileImage: string | null = null;
   customerId: string='';
    firstName: string='';
    lastName: string='';
    email: string='';
    phoneNumber: string='';
    gender: string='';
    password: string='';
    address:string='';
    state:string='';
    pincode:string='';
  selectedImage: any;
  
    constructor(private customerservice:CustomerService, private http: HttpClient, private route: ActivatedRoute) { }
  ngOnInit(): void {
 
  }
  
    
    public onFileSelected(event: any): void {
      const file: File = event.target.files[0];
      this.selectedImage = URL.createObjectURL(file);
    }

  
    saveProfile() {
      // Perform form submission logic here
      console.log('Profile submitted!');
      console.log('CustomerId:', this.customerId);
      console.log('First Name:', this.firstName);
      console.log('Last Name:', this.lastName);
      console.log('Email:', this.email);
      console.log('Phone Number:', this.phoneNumber);
      console.log('Gender:', this.gender);
      console.log('Password:', this.password);
      console.log('Address:', this.address);
      console.log('state:', this.state);
      console.log('pincode:', this.pincode);

      const formData = {
        customer:this.customerId,
        firstName: this.firstName,
        lastName: this.lastName,
        email: this.email,
        phoneNumber: this.phoneNumber,
        gender: this.gender,
        password: this.password,
        address:this.address,
        state:this.state,
        pincode:this.pincode
  

      };
  
      this.customerservice.saveCustomer(formData).subscribe(
        (response: any) => {
          console.log('Profile saved successfully!', response);
        },
        (        error: any) => {
          console.error('Error saving profile:', error);
        }
      );
    }
  
    cancelProfile() {
      console.log('Profile canceled!');
      this.resetForm();
    }
  
    editProfile() {
      
      console.log('Edit profile!');
      this.editForm();
    }
  
    private resetForm() {
      this.selectedImage = null;
      this.customerId='';
      this.firstName = '';
      this.lastName = '';
      this.email = '';
      this.phoneNumber = '';
      this.gender = '';
      this.password = '';
      this.address='';
      this.state='';
      this.pincode='';
    }
    private editForm() {
      this.selectedImage = null;
      this.customerId='';
      this.firstName = '';
      this.lastName = '';
      this.email = '';
      this.phoneNumber = '';
      this.gender = '';
      this.password = '';
      this.address='';
      this.state='';
      this.pincode='';
    }


  }


