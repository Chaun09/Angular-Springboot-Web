import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { SignupComponent } from './auth/components/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './auth/components/login/login.component';
import { AdminService } from './modules/admin/services/admin.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './modules/customer/header/header.component';
import { FaqComponent } from './faq/faq.component';
import { MidHeadFooterComponent } from './modules/customer/mid-head-footer/mid-head-footer.component';
import { FooterComponent } from './modules/customer/footer/footer.component';
import { LoadingPageComponent } from './loading-page/loading-page.component';
import { BodyCustomerComponent } from './modules/customer/body-customer/body-customer.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactComponent } from './contact/contact.component';
import { MidFooterComponent } from "./modules/customer/mid-footer/mid-footer.component";







@NgModule({
  declarations: [

    AppComponent,
    SignupComponent,
    LoginComponent,
    FaqComponent,
    LoadingPageComponent,
    ProductDetailComponent,
    AboutUsComponent,
    ContactComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    HeaderComponent,
    MidHeadFooterComponent,
    FooterComponent,
    BodyCustomerComponent,
    MidFooterComponent
],
  providers: [AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
