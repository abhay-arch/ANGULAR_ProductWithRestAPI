import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable ,map } from 'rxjs';
import { Productcategory } from '../common/productcategory';

@Injectable({
  providedIn: 'root'
})
export class CategoryManagementService {

  categoryurl="http://localhost:8080/api/category"
  constructor(private httpClient : HttpClient) { }
  getAllCategories() : Observable< Productcategory[]>{
   
    console.log( this.httpClient.get<getProductResponses>(this.categoryurl).pipe(map(response => response._embedded.productCategories)))
    return this.httpClient.get<getProductResponses>(this.categoryurl).pipe(map(response => response._embedded.productCategories))
  }
}

interface getProductResponses{
  
  _embedded : {
  
    productCategories : Productcategory[]
  }
  
  }