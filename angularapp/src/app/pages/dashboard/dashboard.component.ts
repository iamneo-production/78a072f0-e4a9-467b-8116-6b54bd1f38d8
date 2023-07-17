import { Component } from '@angular/core';
import { ChartOptions, ChartType } from 'chart.js';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  chartOptions: ChartOptions = {
    responsive: true
  };
  chartData: any[] = [
    { data: [10, 20, 30, 25, 40, 35], label: 'Number of Customers' },
  ];
  chartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June'];
  chartType: ChartType = 'line'; // Set the default chart type to 'line'

  // Additional charts data
  bookingsData: any[] = [
    { data: [5, 10, 15, 12, 20, 18], label: 'Number of Bookings' },
  ];
  revenueData: any[] = [
    { data: [1000, 2000, 1500, 1800, 2500, 2200], label: 'Revenue Owned' },
  ]; 

  constructor() { }
}
