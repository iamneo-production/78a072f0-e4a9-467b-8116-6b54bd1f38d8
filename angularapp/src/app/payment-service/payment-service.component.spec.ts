import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentServiceComponent } from './payment-service.component';

describe('PaymentServiceComponent', () => {
  let component: PaymentServiceComponent;
  let fixture: ComponentFixture<PaymentServiceComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PaymentServiceComponent]
    });
    fixture = TestBed.createComponent(PaymentServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
