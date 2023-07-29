import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Room } from './room';

@Injectable({
  providedIn: 'root'
})
export class RoomService {
  private baseURL1 = "http://localhost:8080/getrooms"; // getallroom
  private baseURL2 = "http://localhost:8080/addroom";  //addroom
  private baseURL3 = "http://localhost:8080/room";  //retriveroomdata
  private baseURL4 = "http://localhost:8080/updateroom";  //updateroom   

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
