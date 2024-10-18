import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loading-page',
  templateUrl: './loading-page.component.html',
  styleUrl: './loading-page.component.scss'
})
export class LoadingPageComponent {
  constructor(private router: Router) { }
  ngOnInit() {
    setTimeout(() => {
      this.router.navigate(['/home']);
    }, 500);
  }


}
