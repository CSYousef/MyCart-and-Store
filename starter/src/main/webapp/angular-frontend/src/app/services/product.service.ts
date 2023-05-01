import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url ='http://localhost:8080/api/product'


  constructor(private http: HttpClient) { }

  getProducts(): Observable<Product[]> {
    //TODO: Fetch the product list from the API
    return this.http.get<Product[]>(
      `${this.url}`,{headers:{Authorization:'Basic dWRhY2l0eTpwYXNzd29yZA=='}}
    );
    }
}
