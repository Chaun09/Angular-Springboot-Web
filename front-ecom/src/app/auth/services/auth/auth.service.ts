import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class AuthService {


  private baseUrl = 'http://localhost:8080/api';
  constructor(private http: HttpClient) { }


  signUp(data: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/signup`, data, {
      headers: {
        'Content-Type': 'application/json'
      }
    });
  }

  login(data: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/login`, data, {
      headers: {
        'Content-Type': 'application/json'
      }
    });
  }







}
