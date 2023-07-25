import { Component, OnInit } from '@angular/core';
import { CancellationService } from '../cancellation.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-cancellation',
  templateUrl: './cancellation.component.html',
  styleUrls: ['./cancellation.component.css']
})
export class CancellationComponent {

  bookingId!: number;
  cancellations?: any[];
  newCancellation: any = {};
  selectedCancellation: any = {};
  isUpdateFormVisible: boolean = false;

  constructor(private cancellationService: CancellationService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      this.bookingId = Number(params.get('bookingId'));
      this.loadCancellations();
    });
  }

  loadCancellations(): void {
    this.cancellationService.getAllCancellations(this.bookingId).subscribe(
      (data: any[]) => {
        this.cancellations = data;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  createCancellation(){
    this.cancellationService.createCancellation(this.bookingId, this.newCancellation).subscribe(
      (data) => {
        console.log('Cancellation created successfully.');
        this.loadCancellations();
        this.newCancellation = {};
      },
      (error) => {
        console.error(error);
      }
    );
  }


  updateCancellation(cancellation: any) {
    this.selectedCancellation = Object.assign({}, cancellation);
    this.isUpdateFormVisible = true;
  }

  saveCancellation() {
    this.cancellationService.updateCancellation(this.bookingId, this.selectedCancellation.cancellationId, this.selectedCancellation).subscribe(
      (data: any) => {
        console.log('Cancellation updated:', data);
        this.loadCancellations();
        this.selectedCancellation = {};
        this.isUpdateFormVisible = false;
      },
      (error: any) => {
        console.error('Error updating cancellation:', error);
      }
    );
  }

  deleteCancellation(cancellationId: number): void {
    this.cancellationService.deleteCancellation(this.bookingId, cancellationId).subscribe(
      (data) => {
        console.log('Cancellation deleted successfully.');
        this.loadCancellations();
      },
      (error) => {
        console.error(error);
      }
    );
  }
}

