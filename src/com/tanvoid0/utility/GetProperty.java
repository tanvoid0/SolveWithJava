package com.tanvoid0.utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class GetProperty {
  public static void main(String[] args) {
    VO vo = new VO("DC", DeliveryConfirmationSystemStatus.DRAFT, PaymentApprovalRule.AUTO, true);
    final var methods = vo.getClass().getMethods();
    final var fields = vo.getClass().getDeclaredFields();
    System.out.println(Arrays.toString(methods));
    System.out.println(Arrays.toString(fields));
  }
}

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
class VO {
  public static final String NAME = "DeliveryConfirmationSystem";

  private final String _type = NAME;

  private String name;

  private DeliveryConfirmationSystemStatus status;

  private PaymentApprovalRule paymentApprovalRule;

  private boolean providerConfirmationRequired;

  private ZonedDateTime statusUpdatedAt;

  private String statusUpdatedBy;

  public VO(String name, DeliveryConfirmationSystemStatus status, PaymentApprovalRule paymentApprovalRule, boolean providerConfirmationRequired) {
    this.name = name;
    this.status = status;
    this.paymentApprovalRule = paymentApprovalRule;
    this.providerConfirmationRequired = providerConfirmationRequired;
  }
}

enum DeliveryConfirmationSystemStatus {
  DRAFT
}

enum PaymentApprovalRule {
  AUTO
}