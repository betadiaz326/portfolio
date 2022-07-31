 import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditEducacionComponent } from './components/educacion/edit-educacion.component';
import { NewEducacionComponent } from './components/educacion/new-educacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { EdithysComponent } from './components/hys/edithys.component';
import { NewHysComponent } from './components/hys/new-hys.component';
import { LoginComponent } from './components/login/login.component';
import { EditProyectosComponent } from './components/proyecto/edit-proyecto.component';
import { NewProyectoComponent } from './components/proyecto/new-proyecto.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'nuevaexp', component: NewExperienciaComponent}, 
  {path: 'editexp/:id', component:EditExperienciaComponent},
  {path:'nuevaeduc', component: NewEducacionComponent},
  {path:'editeduc/:id',component:EditEducacionComponent},
  {path:'nuevaproy', component:NewProyectoComponent},
  {path:'editproy/:id', component: EditProyectosComponent},
  {path:'nuevahys', component:NewHysComponent},
  {path:'edithys/:id', component:EdithysComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
