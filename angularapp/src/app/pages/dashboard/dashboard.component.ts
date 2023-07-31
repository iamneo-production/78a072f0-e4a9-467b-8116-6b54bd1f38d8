import { Component, Input, OnInit } from '@angular/core';
import { ChartType } from 'chart.js';
import { Chart, registerables } from 'node_modules/chart.js';
Chart.register(...registerables);
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit{

  
  public customersChartOptions = {
    responsive: true,
    maintainAspectRatio: false,
  };
  public customersChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  @Input()  public customersChartData: any[] = [
    { data: [100, 150, 120, 80, 160, 200, 190, 220, 180, 140, 230, 250], label: 'Customers' },
  ];
  public customersChartType: ChartType = 'doughnut';
  public customersChartLegend = true;

  public bookingsChartOptions = {
    responsive: true,
    maintainAspectRatio: false,
  };
  public bookingsChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  public bookingsChartData: any[] = [
    { data: [200, 180, 220, 240, 260, 230, 250, 270, 210, 190, 230, 250], label: 'Bookings' },
  ];
  public bookingsChartType: ChartType = 'doughnut';
  public bookingsChartLegend = true;

  public revenueChartOptions = {
    responsive: true,
    maintainAspectRatio: false,
  };
  public revenueChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  public revenueChartData: any[] = [
    { data: [2000, 2300, 2100, 2400, 2600, 2500, 2700, 2900, 2800, 2500, 2700, 2900], label: 'Revenue' },
  ];
  public revenueChartType: ChartType = 'doughnut';
  public revenueChartLegend = true;

  ngOnInit() {}
}
