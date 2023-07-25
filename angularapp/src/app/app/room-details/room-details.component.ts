import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Room } from '../room';
import { RoomService } from '../room.service';


@Component({
  selector: 'app-room-details',
  templateUrl: './room-details.component.html',
  styleUrls: ['./room-details.component.css']
})
export class RoomDetailsComponent {

  rooms?: Room[];
  username !: string;
  name !: string;
  Bookedroomno !: number;
  roomType!: string;
  price!: number;
  selectedRoomType: string = '';
  selectedCategory: string = ''; 
  selectedMaxPrice: number = 0; 
  selectedAvailability: string = ''; 
  filteredRooms: Room[] = [];

  constructor(private roomservice: RoomService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.username = this.route.snapshot.params['username'];
    this.getRooms();


  }


  getRooms() {
    this.roomservice.getRoomList().subscribe(data => {
      this.rooms = data;
      this.filteredRooms = this.rooms;
    });
  }

  getRoomImage(roomType: string): string {
    if (roomType === 'Standard Queen') {
      return 'assets/rooms/StandardQueen.jpg';
    } else if (roomType === 'Standard King') {
      return 'assets/rooms/StandardKing.jpg';
    } else if (roomType === 'Standard') {
      return 'assets/rooms/Standard.jpg';
    }else if (roomType === 'Deluxe') {
      return 'assets/rooms/Deluxe.jpg';
    }else if (roomType === 'Super Deluxe') {
      return 'assets/rooms/SuperDeluxe.jpg';
    }else if (roomType === 'Classic') {
      return 'assets/rooms/Classic.jpg';
    }else if (roomType === 'Suites') {
      return 'assets/rooms/Suites.jpg';
    }
  
    return 'assets/images/Defaults.jpg';
  }
  updateroom(roomNumber: number)
  {
    console.log(roomNumber);
    this.router.navigate(['/updateroom',roomNumber]);
    //this.getRooms();
    //this.goToAdmin();
  }



  filterRooms() {
    if (this.rooms) {
      this.filteredRooms = this.rooms.filter(room => {
        const matchesRoomType = !this.selectedRoomType || room.roomType === this.selectedRoomType;
        const matchesCategory = !this.selectedCategory || room.category === this.selectedCategory;
        //const matchesNoOfGuests = !this.selectedNoOfGuests || room.noOfGuests === this.selectedNoOfGuests;
        const matchesPrice = !this.selectedMaxPrice || (room.price !== undefined && room.price <= this.selectedMaxPrice);
        const matchesAvailability = !this.selectedAvailability || (room.availability !== undefined && room.availability.toString() === this.selectedAvailability);

        return matchesRoomType && matchesCategory && matchesPrice && matchesAvailability; 
      });
    }
  }
  

}

