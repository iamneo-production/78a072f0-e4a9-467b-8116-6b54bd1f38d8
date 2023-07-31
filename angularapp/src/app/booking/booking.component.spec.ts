import { ComponentFixture, TestBed } from '@angular/core/testing';

<<<<<<< HEAD
=======
<<<<<<< HEAD:angularapp/src/app/admin/admin.component.spec.ts
import { AdminComponent } from './admin.component';

describe('AdminComponent', () => {
  let component: AdminComponent;
  let fixture: ComponentFixture<AdminComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdminComponent]
    });
    fixture = TestBed.createComponent(AdminComponent);
=======
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
import { BookingComponent } from './booking.component';

describe('BookingComponent', () => {
  let component: BookingComponent;
  let fixture: ComponentFixture<BookingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BookingComponent]
    });
    fixture = TestBed.createComponent(BookingComponent);
<<<<<<< HEAD
=======
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9:angularapp/src/app/booking/booking.component.spec.ts
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
