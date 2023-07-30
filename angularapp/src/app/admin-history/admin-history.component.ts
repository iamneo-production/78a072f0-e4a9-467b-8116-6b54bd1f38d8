import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-history',
  templateUrl: './admin-history.component.html',
  styleUrls: ['./admin-history.component.css']
})
export class AdminhistoryComponent {
  public rooms: any;
 filteredRooms: any[] = [];
constructor(private http:HttpClient, private router:Router){
  this.filteredRooms = this.rooms;
}
ngOnInit(){
  let response = this.http.get("http://localhost:8080/bookings");
  response.subscribe((data) =>this.rooms = data);
}
//searchText: FormControl = new FormControl('');
    roomTypeFilter: FormControl = new FormControl('');
  //roomPriceFilter: FormControl = new FormControl('');
  
filterRooms() {
  //const searchText = this.searchText.value.toLowerCase();
  const roomTypeFilter = this.roomTypeFilter.value;
  //const roomPriceFilter = this.roomPriceFilter.value;

  this.filteredRooms = this.rooms.filter((room: any) => {
    //const matchesSearchText = room.type.toLowerCase().includes(searchText) ||
      //room.description.toLowerCase().includes(searchText);

    const matchesRoomTypeFilter = roomTypeFilter === '' || room.id === roomTypeFilter;

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