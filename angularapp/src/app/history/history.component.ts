import { Component,OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})
export class HistoryComponent {
  public rooms: any
  filteredRooms: any[] = [];
 constructor( private http:HttpClient,private router:Router){
   this.filteredRooms = this.rooms;
 }
 ngOnInit(){
   //this.x.getdata()
       //.subscribe(data => this.rooms = data)
  let response = this.http.get("assets/bookingdata.json");
   response.subscribe((data) =>this.rooms = data);
   //});
 }
 manageCancellations(bookingId: number) {
  this.router.navigate(['/bookings', bookingId, 'cancellations']);
}
 //searchText: FormControl = new FormControl('');
     roomTypeFilter: FormControl = new FormControl('');
   //roomPriceFilter: FormControl = new FormControl('');
   
 filterRooms() {
   //const searchText = this.searchText.value.toLowerCase();
   const roomTypeFilter = this.roomTypeFilter.value.toLowerCase();
   //const roomPriceFilter = this.roomPriceFilter.value;
 
   this.filteredRooms = this.rooms.filter((room: any) => {
     //const matchesSearchText = room.type.toLowerCase().includes(searchText) ||
       //room.description.toLowerCase().includes(searchText);
 
     const matchesRoomTypeFilter = roomTypeFilter === '' || room.type.toLowerCase() === roomTypeFilter;
 
     //const matchesRoomPriceFilter = roomPriceFilter === null || room.price <= roomPriceFilter;
 
     return  matchesRoomTypeFilter //&& matchesRoomPriceFilter;
   });
 }
 showContent: boolean = true;
 
   onSearchFocus(): void {
     this.showContent = false;
   }
 
   onSearchBlur(): void {
     this.showContent = true;
   }
}
