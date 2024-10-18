import { Component } from '@angular/core';
import { AdminDashboardComponent } from '../modules/admin/components/admin/admin.component';
import { CustomerComponent } from '../modules/customer/components/customer/customer.component';


@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    AdminDashboardComponent,
    CustomerComponent

  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

}
