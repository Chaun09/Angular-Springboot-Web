import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './auth/components/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './auth/components/login/login.component';
import { AdminService } from './modules/admin/services/admin.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './component/header/header.component';
import { FaqComponent } from './layout/faq/faq.component';
import { MidHeadFooterComponent } from './component/mid-head-footer/mid-head-footer.component';
import { FooterComponent } from './component/footer/footer.component';
import { LoadingPageComponent } from './layout/loading-page/loading-page.component';
import { BodyCustomerComponent } from './modules/customer/body-customer/body-customer.component';
import { ProductDetailComponent } from './layout/product-detail/product-detail.component';
import { AboutUsComponent } from './layout/about-us/about-us.component';
import { ContactComponent } from './layout/contact/contact.component';
import { MidFooterComponent } from './component/mid-footer/mid-footer.component';
import { TermConditionsComponent } from './layout/term-conditions/term-conditions.component';

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    FaqComponent,
    LoadingPageComponent,
    ProductDetailComponent,
    AboutUsComponent,
    ContactComponent,
    TermConditionsComponent,
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
    MidFooterComponent,
  ],
  providers: [AdminService],
  bootstrap: [AppComponent],
})
export class AppModule {}
