package com.prowidesoftware.swift.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Simple DTO to hold Settlement Information.
 *
 * <p>It is composed of the Settlement Method and Clearing System (Code or Property).
 * Used in combination with MxId to identify a specific MX message function
 *
 * @since 9.5.5
 */
public class SettlementInfo {

    private SettlementMethod settlementMethod;
    private String clearingSystemCode;

    public SettlementInfo() {}

    public SettlementMethod getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(SettlementMethod sttlmMtd) {
        this.settlementMethod = sttlmMtd;
    }

    public String getClearingSystemCode() {
        return clearingSystemCode;
    }

    public void setClearingSystemCode(String clearingSystemCode) {
        this.clearingSystemCode = clearingSystemCode;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
