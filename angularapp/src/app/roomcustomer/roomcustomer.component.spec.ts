import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoomcustomerComponent } from './roomcustomer.component';

describe('RoomcustomerComponent', () => {
  let component: RoomcustomerComponent;
  let fixture: ComponentFixture<RoomcustomerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RoomcustomerComponent]
    });
    fixture = TestBed.createComponent(RoomcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
