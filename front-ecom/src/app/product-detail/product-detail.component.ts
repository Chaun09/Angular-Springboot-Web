import { CustomerService } from './../modules/customer/services/customer.service';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { OnInit } from '@angular/core';


@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrl: './product-detail.component.scss'
})
export class ProductDetailComponent implements OnInit {

  quantity: number | undefined;
  productId: number | undefined;
  product: any;  // Thay bằng model của bạn nếu có

  constructor(private route: ActivatedRoute, private CustomerService: CustomerService) { }

  ngOnInit(): void {
    // Lấy ID từ route
    this.productId = Number(this.route.snapshot.paramMap.get('id'));

    // Gọi API để lấy chi tiết sản phẩm
    if (this.productId) {
      this.getProductDetails(this.productId);
    }
  }

  getProductDetails(id: number) {
    this.CustomerService.productDetail(id).subscribe(
      (data) => {
        this.product = data;
      },
      (error) => {
        console.error('Error fetching product details:', error);
      }
    );
  }
  // addToCart() {
  //   const cartItem = {
  //     productId: this.productId,
  //     quantity: this.quantity,
  //     productName: this.product.name,
  //     productPrice: this.product.newPrice
  //   };
  //   console.log('Add to cart:', cartItem);
  //   // Bạn có thể sử dụng service hoặc lưu giỏ hàng trong local storage ở đây.
  // }



}
