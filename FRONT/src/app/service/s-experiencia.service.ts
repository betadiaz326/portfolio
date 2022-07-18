import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SExperienciaService {

  expURL = 'http://localhost:8080/explab'
  constructor(private httpClient: HttpClient) { }
}
