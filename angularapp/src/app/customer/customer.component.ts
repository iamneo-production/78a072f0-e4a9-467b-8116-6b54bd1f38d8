import { Component, OnInit} from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  profileImage: string | null = null;
  customerId: string='';
  firstName: string = '';
  lastName: string = '';
  email: string = '';
  password: string = '';
  phoneNumber: string = '';
  address: string = '';
  gender: string = '';
  selectedImage!: string;
  pincode: string='';
  state: string = '';
  paymentMethod: string='';
  cardNumber: string='';
  cardHolderName: string='';
  expiryDate: string='';
  cvv: string='';
  

  constructor(private customerService:CustomerService) { }

  ngOnInit(): void {
  }
  public onFileSelected(event: any): void {
    const file: File = event.target.files[0];
    this.selectedImage = URL.createObjectURL(file);
  }

  saveProfile(): void {
    console.log('Profile saved successfully.');
   
  }

  cancelProfile(): void {
    console.log('Profile  canceled.');
  }

}
