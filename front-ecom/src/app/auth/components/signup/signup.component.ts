import { AuthService } from './../../services/auth/auth.service';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.scss'
})
export class SignupComponent {



  signUpForm: FormGroup;

  constructor(private fb: FormBuilder, private authService: AuthService, private router: Router) {
    // Đảm bảo form được khởi tạo đúng cách
    this.signUpForm = new FormGroup({
      name: new FormControl('', [Validators.required, Validators.minLength(3)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(8)])
    });
  }



  onSubmit() {
    if (this.signUpForm.valid) {
      this.authService.signUp(this.signUpForm.value).subscribe({
        next: () => {
          this.router.navigate(['/login']);
          alert("Đăng kí thành công");
        },
        error: (error) => {
          console.error('Sign up failed', error);
        }
      });
    }
    else {
      console.error('Form không hợp lệ', this.signUpForm.errors);
    }
  }

  login() {
    this.router.navigate(['/login']);
  }




}