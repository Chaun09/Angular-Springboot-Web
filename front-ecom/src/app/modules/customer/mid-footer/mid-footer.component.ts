import { Component } from '@angular/core';
import { CustomerService } from '../services/customer.service';
import { NgFor } from '@angular/common';
@Component({
  selector: 'app-mid-footer',
  standalone: true,
  imports: [NgFor],
  templateUrl: './mid-footer.component.html',
  styleUrl: './mid-footer.component.scss'
})
export class MidFooterComponent {

  category: any[] = [];


  isLoading: boolean = true;
  errorMessage: string = '';

  constructor(private CustomerService: CustomerService) { }

  ngOnInit(): void {

    this.CustomerService.showAllCategory().subscribe({
      next: (data) => {
        this.category = data;
        console.log(data);
      },
      error: (error) => {
        this.errorMessage = 'Error fetching category data';
        console.log(error);
      }
    });
  }
}
