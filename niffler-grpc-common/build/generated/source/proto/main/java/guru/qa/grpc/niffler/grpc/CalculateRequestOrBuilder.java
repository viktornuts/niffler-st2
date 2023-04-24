// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: niffler-currency.proto

package guru.qa.grpc.niffler.grpc;

public interface CalculateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:guru.qa.grpc.niffler.CalculateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.guru.qa.grpc.niffler.CurrencyValues spendCurrency = 1;</code>
   * @return The enum numeric value on the wire for spendCurrency.
   */
  int getSpendCurrencyValue();
  /**
   * <code>.guru.qa.grpc.niffler.CurrencyValues spendCurrency = 1;</code>
   * @return The spendCurrency.
   */
  guru.qa.grpc.niffler.grpc.CurrencyValues getSpendCurrency();

  /**
   * <code>.guru.qa.grpc.niffler.CurrencyValues desiredCurrency = 2;</code>
   * @return The enum numeric value on the wire for desiredCurrency.
   */
  int getDesiredCurrencyValue();
  /**
   * <code>.guru.qa.grpc.niffler.CurrencyValues desiredCurrency = 2;</code>
   * @return The desiredCurrency.
   */
  guru.qa.grpc.niffler.grpc.CurrencyValues getDesiredCurrency();

  /**
   * <code>double amount = 3;</code>
   * @return The amount.
   */
  double getAmount();
}