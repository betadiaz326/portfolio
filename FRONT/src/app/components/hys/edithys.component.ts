import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Hys } from 'src/app/model/hys';
import { SHysService } from 'src/app/service/s-hys.service';

@Component({
  selector: 'app-edithys',
  templateUrl: './edithys.component.html',
  styleUrls: ['./edithys.component.css']
})
export class EdithysComponent implements OnInit {
hys: Hys = null;
  constructor(private sHys: SHysService, private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sHys.detail(id).subscribe(
      data =>{
        this.hys = data;
      }, err =>{        
        alert ('Error al editar proyecto')
        this.router.navigate(['']);
      }

    )

}
onUpdate(): void {
  const id = this.activatedRouter.snapshot.params['id'];
  this.sHys.update(id, this.hys).subscribe(
    data => {
      this.router.navigate(['']);
    }, err => {
      alert ("Error al editar habilidad");
      this.router.navigate(['']);
    }
  )

}

}