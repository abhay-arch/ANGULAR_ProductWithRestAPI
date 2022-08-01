import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable ,map} from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {

  prourl= "http://localhost:8080/api/product"
  constructor(private httpClient : HttpClient) { }

  getAllProducts() : Observable<Product[]>{
    console.log( this.httpClient.get<getProductResponses>(this.prourl).pipe(map(response => response._embedded)))
    return this.httpClient.get<getProductResponses>(this.prourl).pipe(map(response => response._embedded.products))
  }

}

interface getProductResponses{
  
_embedded : {

  products : Product[]
}

}