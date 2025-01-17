import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})

export class AdminService {
  private baseUrl = 'http://localhost:8080/api';
  constructor(private http: HttpClient) { }
  showAllCustomers(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/showAllCustomer`);
  }
  deleteAllCustomer(id: number): Observable<any> {
    return this.http.delete<any>(`${this.baseUrl}/${id}`)

  }
}
