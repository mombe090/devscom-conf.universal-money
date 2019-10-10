import { Component } from '@angular/core';
import {PresentationInterface} from './presentation.interface';
import {ApiGatewayService} from './services/api-gateway.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  userPresentation: PresentationInterface;
  mobilePaymentPresentation: PresentationInterface;
  bankPresentation: PresentationInterface;
  externalPresentation: PresentationInterface;
  apiGatewayPresentation: PresentationInterface;
  apiBitcoinPresentation: PresentationInterface;

  constructor(
    private apiGatewayService: ApiGatewayService
  ) {
    this.userService();
    this.mobileService();
    this.externalService();
    this.bankService();
    this.apiGatewayServices();
    this.apiBitcoinServices();
  }

  userService() {
    this.apiGatewayService.getUserServicePresentation().subscribe((res: PresentationInterface) => {
      console.log(res);
      this.userPresentation = res;
    }, error1 => {
      console.log(error1);
    });
  }

  mobileService() {
    this.apiGatewayService.getMobilePaymentServicePresentation().subscribe((res: PresentationInterface) => {
      this.mobilePaymentPresentation = res;
    }, error1 => {
      console.log(error1);
    });
  }

  externalService() {
    this.apiGatewayService.getExternalServicePresentation().subscribe((res: PresentationInterface) => {
      this.externalPresentation = res;
    }, error1 => {
      console.log(error1);
    });
  }

  bankService() {
    this.apiGatewayService.getBankServicePresentation().subscribe((res: PresentationInterface) => {
      this.bankPresentation = res;
    }, error1 => {
      console.log(error1);
    });
  }

  apiGatewayServices() {
    this.apiGatewayService.getApiGatewayServicePresentation().subscribe((res: PresentationInterface) => {
      this.apiGatewayPresentation = res;
    }, error1 => {
      console.log(error1);
    });
  }

  apiBitcoinServices() {
    this.apiGatewayService.getBitcoinServicePresentation().subscribe((res: PresentationInterface) => {
      this.apiBitcoinPresentation = res;
    }, error1 => {
      console.log(error1);
    });
  }
}
