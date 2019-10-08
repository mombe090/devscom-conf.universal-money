
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import {environment} from '../../environments/environment';

export const HTTPOPTION = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    Authorization: 'Basic ' + btoa('admin:test')
  })
};

@Injectable({
  providedIn: 'root'
})
export class ApiGatewayService {

  constructor(
    private http: HttpClient
  ) {}

  getApiGatewayServicePresentation() {
    return this.http.get(`${environment.api_gateway_url}:/presentation`, HTTPOPTION);
  }

  getUserServicePresentation() {
    return this.http.get(`${environment.api_gateway_url}:/user-services`, HTTPOPTION);
  }

  getBitcoinServicePresentation() {
    return this.http.get(`${environment.api_gateway_url}:/bitcoin-services`, HTTPOPTION);
  }

  getMobilePaymentServicePresentation() {
    return this.http.get(`${environment.api_gateway_url}:/mobile-payment-services`, HTTPOPTION);
  }

  getExternalServicePresentation() {
    return this.http.get(`${environment.api_gateway_url}:/external-data-services`, HTTPOPTION);
  }

  getBankServicePresentation() {
    return this.http.get(`${environment.api_gateway_url}:/bank-services`, HTTPOPTION);
  }
}
