export class Product {
    /*

    "id" : 1,
      "sku" : "abc",
      "productname" : "MI 12",
      "descriptions" : "mobile product",
      "uniteprice" : 23000.5,
      "imageurl" : "https://mi//12",
      "unitinstock" : 100,
      "datecreated" : "2021-11-11",
      "lastupdated" : "2022-07-15",
      "categoryid" : 7,

    */
   constructor(
                public id : number,
                public sku : string,
                public productname : string,
                public descriptions : string,
                public uniteprice : number,
                public imageurl : string,
                public unitinstock : number,
                public datecreated : string,
                public lastupdated : string,
                public categoryid : number,
               
                 ){}
}
