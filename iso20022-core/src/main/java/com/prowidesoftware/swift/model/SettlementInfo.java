package com.prowidesoftware.swift.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Simple DTO to hold settlement information.
 *
 * <p>Composed of a {@link SettlementMethod} and an optional clearing system code or proprietary
 * identifier. Used in combination with {@link MxId} to identify a specific MX message variant.
 *
 * @since 9.5.5
 */
public class SettlementInfo {

    private SettlementMethod settlementMethod;
    private String clearingSystemCode;

    /** Creates an empty {@code SettlementInfo} with no settlement method or clearing system code. */
    public SettlementInfo() {}

    /**
     * Returns the settlement method.
     *
     * @return the {@link SettlementMethod}, or {@code null} if not set
     */
    public SettlementMethod getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the settlement method.
     *
     * @param sttlmMtd the settlement method to set; may be {@code null}
     */
    public void setSettlementMethod(SettlementMethod sttlmMtd) {
        this.settlementMethod = sttlmMtd;
    }

    /**
     * Returns the clearing system code.
     *
     * @return the clearing system code, or {@code null} if not set
     */
    public String getClearingSystemCode() {
        return clearingSystemCode;
    }

    /**
     * Sets the clearing system code.
     *
     * @param clearingSystemCode the clearing system code to set; may be {@code null}
     */
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
