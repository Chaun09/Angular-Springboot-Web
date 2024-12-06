import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './auth/components/signup/signup.component';
import { LoginComponent } from './auth/components/login/login.component';
import { HomeComponent } from './home/home.component';
import { FaqComponent } from './faq/faq.component';
import { LoadingPageComponent } from './loading-page/loading-page.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactComponent } from './contact/contact.component';
import { TermConditionsComponent } from './term-conditions/term-conditions.component';



const routes: Routes = [
  { path: "register", component: SignupComponent },
  { path: "login", component: LoginComponent },
  { path: "home", component: HomeComponent },
  { path: "faq", component: FaqComponent },
  { path: "loading", component: LoadingPageComponent },
  { path: "detail/:id", component: ProductDetailComponent },
  { path: "about-us", component: AboutUsComponent },
  { path: "contact", component: ContactComponent },
  { path: "term", component: TermConditionsComponent }

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
