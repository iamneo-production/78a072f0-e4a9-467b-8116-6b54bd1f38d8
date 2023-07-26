import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Room } from './room';

@Injectable({
  providedIn: 'root'
})
export class RoomService {

  private baseURL1 = "https://8080-fdedbdfabffebceaeaadbdbabf.project.examly.io/getrooms"; // getallroom
  private baseURL2 = "https://8080-fdedbdfabffebceaeaadbdbabf.project.examly.io/addroom";  //addroom
  private baseURL3 = "https://8080-fdedbdfabffebceaeaadbdbabf.project.examly.io/room";  //retriveroomdata
  private baseURL4 = "https://8080-fdedbdfabffebceaeaadbdbabf.project.examly.io/updateroom";  //updateroom   

  constructor(private httpClient:HttpClient) { }
 
  getRoomList(): Observable<Room[]>{
    return this.httpClient.get<Room[]>(`${this.baseURL1}`);
  }

  createRoom(room:Room):Observable<any>{
    return this.httpClient.post(`${this.baseURL2}`,room);
  }

  getRoomByRoomNo(RoomNumber:number):Observable<Room>{
    return this.httpClient.get<Room>(`${this.baseURL3}/${RoomNumber}`);
  }


  updateRoom(RoomNumber:number, room: Room):Observable<object>{
    return this.httpClient.put(`${this.baseURL4}/${RoomNumber}`,room);
  }

  deleteRoom(RoomNumber:number): Observable<object>
  {
    return this.httpClient.delete(`${this.baseURL3}/${RoomNumber}`);
  }

}
