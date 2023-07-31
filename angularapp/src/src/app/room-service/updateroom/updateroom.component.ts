import { Component } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Room } from 'src/app/room';
import { RoomService } from 'src/app/room.service';

@Component({
  selector: 'app-updateroom',
  templateUrl: './updateroom.component.html',
  styleUrls: ['./updateroom.component.css']
})
export class UpdateroomComponent {
  RoomNumber!:number;
  newroom : Room = new Room();
  constructor(private roomservice : RoomService,private router : Router,private route :ActivatedRoute) { }

  ngOnInit(): void {
    this.RoomNumber = this.route.snapshot.params['id'];
    console.log(this.RoomNumber);
    this.roomservice.getRoomByRoomNo(this.RoomNumber).subscribe(data => 
      {
        this.newroom = data;
        console.log(this.newroom);
      }, error => console.log(error)
      );
  }

  onSubmit()
  {
    this.roomservice.updateRoom(this.RoomNumber,this.newroom).subscribe(data =>
      {
        alert("Updated Sucessfully");
      },error => console.log(error)
      );
    this.goToAdmin();
    
  }

  goToAdmin()
  {
    this.router.navigate(['/roomadmin']);
  }
}
