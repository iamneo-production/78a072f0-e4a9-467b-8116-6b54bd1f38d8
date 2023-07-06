import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminloginComponent } from './adminlogin.component';

describe('AdminloginComponent', () => {
  let component: AdminloginComponent;
  let fixture: ComponentFixture<AdminloginComponent>;
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminloginComponent ]
    })
    beforeEach(async () => {
      await TestBed.configureTestingModule({
        declarations: [ AdminloginComponent ]
      })
      .compileComponents();
    });
    fixture = TestBed.createComponent(AdminloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
beforeEach(() => {
  fixture = TestBed.createComponent(AdminloginComponent);
  component = fixture.componentInstance;
  fixture.detectChanges();
});

it('should create', () => {
  expect(component).toBeTruthy();
});
});
