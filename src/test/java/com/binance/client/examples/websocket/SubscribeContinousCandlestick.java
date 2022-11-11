package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.model.enums.CandlestickInterval;

public class SubscribeContinousCandlestick {

  public static void main(String[] args) throws InterruptedException {
    SubscriptionClient client = SubscriptionClient.create();
    client.subscribeContinousCandlestickEvent("ETHBTC", "perpetual", CandlestickInterval.FIVE_MINUTES, ((event) -> {
      System.out.println(event);
    }), (error) -> {
      System.out.println(error);
    });
    Thread.sleep(2000);
    client.unsubscribeAll();
  }

}
