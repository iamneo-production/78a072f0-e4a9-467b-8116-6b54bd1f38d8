import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  selectedImage:string |null= null;
  public profileImage="";
  public customerId="";
  public firstName="";
  public lastName="";
  public email="";
  public phoneNumber="";
  public gender="";
  public password="";
  public address="";

  public isEditing: boolean = false;

  ngOnInit() {
    this.profileImage ="";
    this.customerId ="";
    this.firstName = "";
    this.lastName = "";
    this.email = "";
    this.phoneNumber = "";
    this.gender = "";
    this.password = "";
    this.address = "";

  }

  public editProfile(): void {
    this.isEditing = true;
  }

  public saveProfile(): void {
    this.isEditing = false;

    console.log('Profile saved successfully.');
  }

  public cancelProfile(): void {
    this.isEditing = false;
    this.ngOnInit();
  }

  public deleteProfile(): void {
    console.log('Profile deleted');
  }

  public onFileSelected(event: any): void {
    const file: File = event.target.files[0];
    this.selectedImage = URL.createObjectURL(file);
  }
}
