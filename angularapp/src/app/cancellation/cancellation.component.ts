import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cancellation',
  templateUrl: './cancellation.component.html',
  styleUrls: ['./cancellation.component.css']
})
export class CancellationComponent implements OnInit{
  bookingId?: number;
  cancellations?: any[];
  newCancellation: any = {};
ngOnInit(): void {
    
}
getCancellationsForBooking() {
  
}

createCancellation() {
  
}

updateCancellation(cancellation: any) {
  
}

deleteCancellation(cancellation: any) {
  
}
}
