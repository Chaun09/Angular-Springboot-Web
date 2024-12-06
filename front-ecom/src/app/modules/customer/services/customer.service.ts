import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseUrl = 'http://localhost:8080/api/product';
  private categoryUrl = 'http://localhost:8080/api/category'

  constructor(private http: HttpClient) { }
  showAllProducts(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/show-all`);
  }
  productDetail(id: number) {
    return this.http.get<any>(`${this.baseUrl}/show-by-id/${id}`);
  }
  showAllCategory(): Observable<any> {
    return this.http.get<any>(`${this.categoryUrl}/show-all`);
  }
}
