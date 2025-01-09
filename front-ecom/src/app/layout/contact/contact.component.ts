import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { LocalUserService } from '../../modules/customer/services/localuser';
import { Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.scss',
})
export class ContactComponent {
  contactSendForm: FormGroup;

  constructor(
    private localUserService: LocalUserService,
    private router: Router
  ) {
    // Đảm bảo form được khởi tạo đúng cách
    this.contactSendForm = new FormGroup({
      name: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      message: new FormControl('', [Validators.required]),
    });
  }

  onSubmit() {
    if (this.contactSendForm.valid) {
      this.localUserService.sendEmail(this.contactSendForm.value).subscribe({
        next: () => {
          this.router.navigate(['/loading']);
          alert('Gửi thành công');
        },
        error: (error) => {
          console.error('Gửi thất bại', error);
        },
      });
    } else {
      console.error('Form không hợp lệ', this.contactSendForm.errors);
    }
  }
}
