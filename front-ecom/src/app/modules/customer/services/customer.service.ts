import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) { }
  showAllProducts(): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/show_all_product`);
  }
  productDetail(id: number) {
    return this.http.get<any>(`${this.baseUrl}/show_product_by_id/${id}`);
  }
}
