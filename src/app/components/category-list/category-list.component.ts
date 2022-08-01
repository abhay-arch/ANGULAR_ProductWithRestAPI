import { Component, OnInit } from '@angular/core';
import { Productcategory } from 'src/app/common/productcategory';
import { CategoryManagementService } from 'src/app/service/category-management.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {

  productCategories : Productcategory[]
  formModel : Productcategory=new Productcategory(0,"");
  constructor( private service : CategoryManagementService ) { }

  ngOnInit(): void {
    this.listOfCategories()
  }

  listOfCategories()
  {
    this.service.getAllCategories() .subscribe(data =>{
      console.log(data)
      this.productCategories =data
    })
  }

  onSubmit()
  {
    this.productCategories.push(this.formModel);
  }
}
