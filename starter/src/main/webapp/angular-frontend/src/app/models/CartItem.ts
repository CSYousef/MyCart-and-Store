import { Product } from "./Product"

export class CartItem{

   
   product : Product
    amount:  number
    
    constructor() {
  this.product = new Product();
  this.amount =0;
    }
    
    

    
    }