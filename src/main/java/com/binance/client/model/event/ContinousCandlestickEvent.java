package com.binance.client.model.event;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.client.constant.BinanceApiConstants;

public class ContinousCandlestickEvent extends CandlestickEvent {

  private String pair;

  private String contract;

  public String getPair() {
    return pair;
  }

  public void setPair(String pair) {
    this.pair = pair;
  }

  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", eventType)
      .append("eventTime", eventTime).append("pair", pair).append("contract", contract).append("startTime", startTime)
      .append("closeTime", closeTime).append("interval", interval)
      .append("firstTradeId", firstTradeId).append("lastTradeId", lastTradeId).append("open", open)
      .append("close", close).append("high", high).append("low", low).append("volume", volume)
      .append("numTrades", numTrades).append("isClosed", isClosed)
      .append("quoteAssetVolume", quoteAssetVolume).append("takerBuyBaseAssetVolume", takerBuyBaseAssetVolume)
      .append("takerBuyQuoteAssetVolume", takerBuyQuoteAssetVolume).append("ignore", ignore).toString();
  }

}
