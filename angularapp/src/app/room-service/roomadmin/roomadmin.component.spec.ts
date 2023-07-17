import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoomadminComponent } from './roomadmin.component';

describe('RoomadminComponent', () => {
  let component: RoomadminComponent;
  let fixture: ComponentFixture<RoomadminComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RoomadminComponent]
    });
    fixture = TestBed.createComponent(RoomadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
