
import { Component } from '@angular/core';
import { FooterComponent } from '../../footer/footer.component';
import { HeaderComponent } from '../../header/header.component';
import { MidFooterComponent } from '../../mid-footer/mid-footer.component';
import { MidHeadFooterComponent } from '../../mid-head-footer/mid-head-footer.component';
import { MidHeaderComponent } from '../../mid-header/mid-header.component';
import { BodyCustomerComponent } from "../../body-customer/body-customer.component";


@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [
    FooterComponent,
    HeaderComponent,
    MidFooterComponent,
    MidHeadFooterComponent,
    MidHeaderComponent,
    BodyCustomerComponent
],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.scss'
})
export class CustomerComponent {

}
