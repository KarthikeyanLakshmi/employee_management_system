import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeAdd } from './employee-add';

describe('EmployeeAdd', () => {
  let component: EmployeeAdd;
  let fixture: ComponentFixture<EmployeeAdd>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployeeAdd]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeAdd);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
