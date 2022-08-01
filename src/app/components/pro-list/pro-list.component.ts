import { Component, OnInit } from '@angular/core';
import { VirtualTimeScheduler } from 'rxjs';
import { Product } from 'src/app/common/product';
import { ManagementServiceService } from 'src/app/service/management-service.service';

@Component({
  selector: 'app-pro-list',
  templateUrl: './pro-list.component.html',
  styleUrls: ['./pro-list.component.css']
})
export class ProListComponent implements OnInit {

  products : Product[]
  formModel : Product=new Product(0,"","","",0,"",0,"","",0);
  constructor(private service :ManagementServiceService) { }

  ngOnInit(): void {
    this.listOfProducts()
  }

  listOfProducts(){
    this.service.getAllProducts().subscribe(data => {
      console.log(data)
      this.products=data
    })
  }

  onSubmit()
  {
    this.products.push(this.formModel);
  }

}
