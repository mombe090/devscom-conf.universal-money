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
/*    this.mobileService();
    this.externalService();
    this.bankService();
    this.apiGatewayServices();
    this.apiBitcoinServices();*/
  }

  userService() {
    this.apiGatewayService.getUserServicePresentation().subscribe((res: PresentationInterface) => {
      this.userPresentation = res;
    });
  }

  mobileService() {
    this.apiGatewayService.getMobilePaymentServicePresentation().subscribe((res: PresentationInterface) => {
      this.mobilePaymentPresentation = res;
    });
  }

  externalService() {
    this.apiGatewayService.getExternalServicePresentation().subscribe((res: PresentationInterface) => {
      this.externalPresentation = res;
    });
  }

  bankService() {
    this.apiGatewayService.getExternalServicePresentation().subscribe((res: PresentationInterface) => {
      this.bankPresentation = res;
    });
  }

  apiGatewayServices() {
    this.apiGatewayService.getExternalServicePresentation().subscribe((res: PresentationInterface) => {
      this.apiGatewayPresentation = res;
    });
  }

  apiBitcoinServices() {
    this.apiGatewayService.getExternalServicePresentation().subscribe((res: PresentationInterface) => {
      this.apiBitcoinPresentation = res;
    });
  }
}
