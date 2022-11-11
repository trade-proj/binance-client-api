package com.binance.client.model.event;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.client.constant.BinanceApiConstants;

public class SpotCandlestickEvent extends CandlestickEvent {

  private String symbol;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", eventType)
      .append("eventTime", eventTime).append("symbol", symbol).append("startTime", startTime)
      .append("closeTime", closeTime).append("symbol", symbol).append("interval", interval)
      .append("firstTradeId", firstTradeId).append("lastTradeId", lastTradeId).append("open", open)
      .append("close", close).append("high", high).append("low", low).append("volume", volume)
      .append("numTrades", numTrades).append("isClosed", isClosed)
      .append("quoteAssetVolume", quoteAssetVolume).append("takerBuyBaseAssetVolume", takerBuyBaseAssetVolume)
      .append("takerBuyQuoteAssetVolume", takerBuyQuoteAssetVolume).append("ignore", ignore).toString();
  }

}
