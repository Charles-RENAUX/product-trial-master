import { Component } from '@angular/core';
import { NgForm, FormsModule } from '@angular/forms';
import {CommonModule} from '@angular/common';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {
  isContactSend = false

  onSubmit(form: NgForm) {
      if (form.valid) {
        console.log(form.value);
        this.isContactSend = true
      }
    }
    
}
