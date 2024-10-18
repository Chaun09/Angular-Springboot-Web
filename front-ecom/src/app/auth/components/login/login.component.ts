import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FormControl, Validators } from '@angular/forms';
import { AuthService } from '../../services/auth/auth.service';
import { Router } from '@angular/router';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss',
})
export class LoginComponent {
  loginForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private authService: AuthService,
    private router: Router
  ) {
    // Đảm bảo form được khởi tạo đúng cách
    this.loginForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [
        Validators.required
      ]),
    });
  }

  onSubmit() {
    if (this.loginForm.valid) {
      this.authService.signUp(this.loginForm.value).subscribe({
        next: () => {
          this.router.navigate(['/loading']);
          alert('Đăng nhập thành công')

        },
        error: (error) => {
          console.error('Login failed', error);
        },
      });
    } else {
      console.error('Form không hợp lệ', this.loginForm.errors);
    }
  }
}
