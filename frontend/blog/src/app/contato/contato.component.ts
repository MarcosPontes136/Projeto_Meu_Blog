import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Email } from '../model/email';
import { EmailService } from '../service/email.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})

  export class ContatoComponent  implements OnInit {

    ngOnInit() {
    }
  
    mail : Email = new Email();
  
    constructor(private http: HttpClient, private emailService :EmailService) { }
  
    private enviarEmail() {
      this.emailService.enviarEmail(this.mail)
        .subscribe(data => console.log(data));
    }
  
    onSubmit() {
      this.enviarEmail();
    }
  
  }