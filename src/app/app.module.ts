import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { Router, RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProListComponent } from './components/pro-list/pro-list.component';
import { CategoryListComponent } from './components/category-list/category-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

const route : Routes =[
  {path : '' ,component :WelcomeComponent},
  {path : 'products', component : ProListComponent},
  {path : 'productCategories',component :CategoryListComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    ProListComponent,
    CategoryListComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(route),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
