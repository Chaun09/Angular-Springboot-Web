import { AdminService } from './../../services/admin.service';

import { Component, OnInit } from '@angular/core';


import { NgFor } from '@angular/common';

@Component({
  selector: 'app-admin-dashboard',
  standalone: true,
  imports: [
    NgFor
  ],
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.scss'
})
export class AdminDashboardComponent implements OnInit {

  customers: any[] = [];


  isLoading: boolean = true;
  errorMessage: string = '';

  constructor(private AdminService: AdminService) { }

  ngOnInit(): void {

    this.AdminService.showAllCustomers().subscribe({
      next: (data) => {
        this.customers = data;
        console.log(data);
      },
      error: (error) => {
        this.errorMessage = 'Error fetching customer data';
        console.log(error);
      }
    });
  }

  delete(id: number): void {
    this.AdminService.deleteAllCustomer(id).subscribe({
      next: (response) => {
        console.log('Xóa thành công:', response);

      },
      error: (error) => {
        console.error('Có lỗi xảy ra khi xóa:', error);
      }
    });
  }



}
