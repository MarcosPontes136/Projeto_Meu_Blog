import { Component, ElementRef, HostListener, OnInit, ViewChild } from '@angular/core';
import { faGithub, faYoutube } from '@fortawesome/free-brands-svg-icons';
import * as $ from 'jQuery';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  faYoutube = faYoutube
  faGitHub = faGithub

  constructor() { 
  }

  ngOnInit(): void {
  }
}

