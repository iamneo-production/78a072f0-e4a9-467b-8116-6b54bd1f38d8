import { Component} from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Room } from '../room';
import { RoomService } from '../room.service';

@Component({
  selector: 'app-roomadmin',
  templateUrl: './roomadmin.component.html',
  styleUrls: ['./roomadmin.component.css']
})
export class RoomadminComponent {
  rooms?: Room[];
  newroom: Room = new Room();
  roomnumber !: number;

  
  constructor(private roomservice:RoomService, private router: Router) { }

  ngOnInit(): void {
      // this.roomservice.getRoomList().subscribe(data => {
      //   this.rooms = data;
      // });
      this.getRooms();
      
  }

  getRooms()
  {
    this.roomservice.getRoomList().subscribe(data => {
      this.rooms = data;
      console.log(this.rooms);
    });
  }

  saveRoom()
  {
    this.roomservice.createRoom(this.newroom).subscribe(data =>{
      console.log(data);
      this.getRooms();
      this.goToAdmin();
    }, 
    error => console.log(error));
  }

  goToAdmin()
  {
    this.router.navigate(['/rooms/admin']);
  }

  onSubmit(addform: NgForm)
  {
    console.log(this.newroom);
    this.saveRoom();
    alert("Submitted successfully");
    addform.reset();
  }

  updateroom(roomNumber: number)
  {
    console.log(roomNumber);
    this.router.navigate(['/updateroom',roomNumber]);
    //this.getRooms();
    //this.goToAdmin();
  }

  deleteroom(roomNumber: number)
  {
    this.roomservice.deleteRoom(roomNumber).subscribe(data =>
      {
        console.log(roomNumber);
        alert("Deleted successfully");
        this.getRooms();
        this.goToAdmin();
      })
  }
 
  getRoomImage(roomType: string ): string {
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
    // Return a default image URL if the roomType doesn't match any specific cases
    return 'assets/images/Defaultroom.jpg';
  }

}
