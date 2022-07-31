import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Hys } from 'src/app/model/hys';
import { SHysService } from 'src/app/service/s-hys.service';

@Component({
  selector: 'app-new-hys',
  templateUrl: './new-hys.component.html',
  styleUrls: ['./new-hys.component.css']
})
export class NewHysComponent implements OnInit {
  nombreH: string = '';
  porcentajeH: string = '';
  imagenH: string = '';
  constructor(private sHys: SHysService, private router: Router) { }

  ngOnInit(): void {
  }
  onCreate(): void{
    const hys = new Hys(this.nombreH, this.porcentajeH, this.imagenH);
    this.sHys.save(hys).subscribe(
      data => {
      alert("Habilidad añadida");
      this.router.navigate(['']);
    }, err => {
      alert("Falló la creación de una nueva habilidad");
      this.router.navigate(['']);
    }
    ) 
  }

}
