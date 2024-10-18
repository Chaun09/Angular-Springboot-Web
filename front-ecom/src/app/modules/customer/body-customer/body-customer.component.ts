import { NgFor } from '@angular/common';
import { CustomerService } from './../services/customer.service';
import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';


@Component({
  selector: 'app-body-customer',
  standalone: true,
  imports: [
    NgFor,
    RouterLink
  ],
  templateUrl: './body-customer.component.html',
  styleUrl: './body-customer.component.scss'
})
export class BodyCustomerComponent {
  products: any[] = [];


  isLoading: boolean = true;
  errorMessage: string = '';

  constructor(private CustomerService: CustomerService, private router: Router) { }

  ngOnInit(): void {

    this.CustomerService.showAllProducts().subscribe({
      next: (data) => {
        this.products = data;
        console.log(data);
      },
      error: (error) => {
        this.errorMessage = 'Error fetching customer data';
        console.log(error);
      }
    });
  }
  






}
