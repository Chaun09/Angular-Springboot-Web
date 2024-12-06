
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LocalUserService {

  private baseUrl = 'http://localhost:8080/api/local-user';
  constructor(private http: HttpClient) { }


  sendEmail(data: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/send-email`, data, {
      headers: {
        'Content-Type': 'application/json'
      }
    });
  }


}
