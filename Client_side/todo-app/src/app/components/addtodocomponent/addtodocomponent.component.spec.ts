import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddtodocomponentComponent } from './addtodocomponent.component';

describe('AddtodocomponentComponent', () => {
  let component: AddtodocomponentComponent;
  let fixture: ComponentFixture<AddtodocomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddtodocomponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddtodocomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
