import { Component, OnInit } from '@angular/core';
import { faCoffee, faVials } from '@fortawesome/free-solid-svg-icons';
import { faDocker } from '@fortawesome/free-brands-svg-icons';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent implements OnInit {
  faVials = faVials;
  faDocker = faDocker;
  title = 'E2E Test Demo';

  constructor() { }

  ngOnInit() {
  }

}
