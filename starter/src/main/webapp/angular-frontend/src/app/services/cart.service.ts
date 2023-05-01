import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Order } from '../models/Order';
import { Product } from '../models/Product';
import { CartItem } from '../models/CartItem';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  cartProducts: CartItem[];

  private url:string='http://localhost:8080/orders/save-order';

  constructor(private http: HttpClient) {
    this.cartProducts =[]
   }

  getCartProducts() {
    return this.cartProducts;
  }

  addToCart(product: any, amount: any) {
    //TODO: Add item to the cart
   
    let existingProduct= this.cartProducts.find(p =>p.product.name===product.name);
    if(existingProduct){
      existingProduct.amount += parseInt(amount);
    }else{
      this.cartProducts.push({product,amount});
    }
    alert('Added to cart!');
  }

  clearCart() {
    this.cartProducts = [];
    return this.cartProducts;
  }

  updateCart(cart: any) {
    this.cartProducts = cart;

    return this.cartProducts;
  }

  submitOrder(order: any): Observable<any> {
    //Submit the order information the API
    return this.http.post<any>(
      `${this.url}`,order,{headers:{Authorization:'Basic dWRhY2l0eTpwYXNzd29yZA=='}}
    );
  
    }
}
