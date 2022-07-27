import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { SkillsService } from 'src/app/service/hys.service';

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css'],
})
export class hysComponent implements OnInit {
  Skill:  hysComponent[] = [];
  deleteSkill: hysComponent;
  
 constructor(private skillsService: SkillsService, private authService: AuthServicee) {}
 
 isloged = () => this.authService.loggedIn();
  ngOnInit(): void {
    this.getSkill();
  }

  public getSkill(): void {
    this.skillsService.getSkill().subscribe({
      next: (response: Skill[]) => {
        this.skills = response;
      },
      error: (error: HttpErrorResponse) => {
        console.log('error');
      },
    });
  }
  public onOpenModal(mode: string, skill?: Skill): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add') {
      button.setAttribute('data-target', '#addSkillModal');
    } else if (mode === 'delete') {
      this.deleteSkill = skill;
      button.setAttribute('data-target', '#deleteSkillModal');
    } else if (mode === 'edit') {
      this.editSkill = skill;
      button.setAttribute('data-target', '#editSkillModal');
    }

    container?.appendChild(button);
    button.click();
  }

  public onAddSkill(addForm: NgForm): void {
    document.getElementById('add-skill-form')?.click();
    this.skillsService.addSkill(addForm.value).subscribe({
      next: (response: Skill) => {
        console.log(response);
        this.getSkill();
        addForm.reset();
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      },
    });
  }

  public onUpdateSkill(skill: Skill): void {
    this.editSkill = skill;
    this.skillsService.updateSkill(skill).subscribe({
      next: (response: Skill) => {
        console.log(response);
        this.getSkill();
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
      },
    });
  }

  public onDeleteSkill(idSkill: number): void {
    this.skillsService.deleteSkill(idSkill).subscribe({
      next: (response: void) => {
        console.log(response);
        this.getSkill();
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
      },
    });
  }
  onDrop(event: CdkDragDrop<Skill[]>) {
    if (this.authService.loggedIn()) {
      if (event.previousContainer === event.container) {
        moveItemInArray(
          event.container.data,
          event.previousIndex,
          event.currentIndex
        );
      } else {
        transferArrayItem(
          { data: event.previousContainer.data, data: event.container.data, previousIndex: event.previousIndex, currentIndex: event.currentIndex }        );
      }
    }
  }
}


