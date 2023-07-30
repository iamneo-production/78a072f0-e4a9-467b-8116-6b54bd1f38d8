import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  public customersChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  public customersChartData: number[] = [100, 150, 120, 80, 160, 200, 190, 220, 180, 140, 230, 250];

  public bookingsChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  public bookingsChartData: number[] = [200, 180, 220, 240, 260, 230, 250, 270, 210, 190, 230, 250];

  public revenueChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
  public revenueChartData: number[] = [2000, 2300, 2100, 2400, 2600, 2500, 2700, 2900, 2800, 2500, 2700, 2900];
  constructor( private router:Router) { }
  ngOnInit(){
    
  }
}