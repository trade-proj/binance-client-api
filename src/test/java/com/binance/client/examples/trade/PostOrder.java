package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.NewOrderRespType;
import com.binance.client.model.enums.OrderSide;
import com.binance.client.model.enums.OrderType;
import com.binance.client.model.enums.PositionSide;
import com.binance.client.model.enums.TimeInForce;

public class PostOrder {

  public static void main(String[] args) {
    RequestOptions options = new RequestOptions();

    SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
      options);

    System.out.println(syncRequestClient.postOrder("BTCUSDT", OrderSide.SELL, PositionSide.LONG, OrderType.LIMIT, TimeInForce.GTC,
      "0.001", "19380", null, null, null, null, NewOrderRespType.RESULT));
  }

}