import { Component } from '@angular/core';

@Component({
  selector: 'app-cancel-by-id',
  templateUrl: './cancel-by-id.component.html',
  styleUrls: ['./cancel-by-id.component.css']
})
export class CancelByIdComponent {
  bookingID?: string;
  reason?: string;
  isCancelled: boolean = false;
  

  cancelBooking() {
    
    if (this.bookingID && this.reason) {
      this.isCancelled = true;
    }
  }
}
