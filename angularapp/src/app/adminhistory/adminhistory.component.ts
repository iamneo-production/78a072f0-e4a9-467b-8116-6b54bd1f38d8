import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-adminhistory',
  templateUrl: './adminhistory.component.html',
  styleUrls: ['./adminhistory.component.css']
})
export class AdminhistoryComponent {
  public rooms: any;
 filteredRooms: any[] = [];
constructor(private http:HttpClient){
  this.filteredRooms = this.rooms;
}
ngOnInit(){
  let response = this.http.get("assets/bookingdata.json");
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
