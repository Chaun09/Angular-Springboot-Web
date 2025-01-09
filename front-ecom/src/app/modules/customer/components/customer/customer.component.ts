import { Component } from '@angular/core';
import { FooterComponent } from '../../../../component/footer/footer.component';
import { HeaderComponent } from '../../../../component/header/header.component';
import { MidFooterComponent } from '../../../../component/mid-footer/mid-footer.component';
import { MidHeadFooterComponent } from '../../../../component/mid-head-footer/mid-head-footer.component';
import { MidHeaderComponent } from '../../../../component/mid-header/mid-header.component';
import { BodyCustomerComponent } from '../../body-customer/body-customer.component';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [
    FooterComponent,
    HeaderComponent,
    MidFooterComponent,
    MidHeadFooterComponent,
    MidHeaderComponent,
    BodyCustomerComponent,
  ],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.scss',
})
export class CustomerComponent {}
