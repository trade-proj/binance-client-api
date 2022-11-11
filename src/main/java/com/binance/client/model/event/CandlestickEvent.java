package com.binance.client.model.event;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.client.constant.BinanceApiConstants;

public class CandlestickEvent {

  protected String eventType;

  protected Long eventTime;

  protected Long startTime;

  protected Long closeTime;

  protected String interval;

  protected Long firstTradeId;

  protected Long lastTradeId;

  protected BigDecimal open;

  protected BigDecimal close;

  protected BigDecimal high;

  protected BigDecimal low;

  protected BigDecimal volume;

  protected Long numTrades;

  protected Boolean isClosed;

  protected BigDecimal quoteAssetVolume;

  protected BigDecimal takerBuyBaseAssetVolume;

  protected BigDecimal takerBuyQuoteAssetVolume;

  protected Long ignore;

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public Long getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(Long closeTime) {
    this.closeTime = closeTime;
  }

  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public Long getFirstTradeId() {
    return firstTradeId;
  }

  public void setFirstTradeId(Long firstTradeId) {
    this.firstTradeId = firstTradeId;
  }

  public Long getLastTradeId() {
    return lastTradeId;
  }

  public void setLastTradeId(Long lastTradeId) {
    this.lastTradeId = lastTradeId;
  }

  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public Long getNumTrades() {
    return numTrades;
  }

  public void setNumTrades(Long numTrades) {
    this.numTrades = numTrades;
  }

  public Boolean getIsClosed() {
    return isClosed;
  }

  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  public BigDecimal getQuoteAssetVolume() {
    return quoteAssetVolume;
  }

  public void setQuoteAssetVolume(BigDecimal quoteAssetVolume) {
    this.quoteAssetVolume = quoteAssetVolume;
  }

  public BigDecimal getTakerBuyBaseAssetVolume() {
    return takerBuyBaseAssetVolume;
  }

  public void setTakerBuyBaseAssetVolume(BigDecimal takerBuyBaseAssetVolume) {
    this.takerBuyBaseAssetVolume = takerBuyBaseAssetVolume;
  }

  public BigDecimal getTakerBuyQuoteAssetVolume() {
    return takerBuyQuoteAssetVolume;
  }

  public void setTakerBuyQuoteAssetVolume(BigDecimal takerBuyQuoteAssetVolume) {
    this.takerBuyQuoteAssetVolume = takerBuyQuoteAssetVolume;
  }

  public Long getIgnore() {
    return ignore;
  }

  public void setIgnore(Long ignore) {
    this.ignore = ignore;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", eventType)
      .append("eventTime", eventTime).append("startTime", startTime)
      .append("closeTime", closeTime).append("interval", interval)
      .append("firstTradeId", firstTradeId).append("lastTradeId", lastTradeId).append("open", open)
      .append("close", close).append("high", high).append("low", low).append("volume", volume)
      .append("numTrades", numTrades).append("isClosed", isClosed)
      .append("quoteAssetVolume", quoteAssetVolume).append("takerBuyBaseAssetVolume", takerBuyBaseAssetVolume)
      .append("takerBuyQuoteAssetVolume", takerBuyQuoteAssetVolume).append("ignore", ignore).toString();
  }

}
