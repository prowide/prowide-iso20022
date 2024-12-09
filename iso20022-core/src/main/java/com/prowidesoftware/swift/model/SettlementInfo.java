package com.prowidesoftware.swift.model;

/**
 * Class for identification of MX messages.
 *
 * <p>It is composed of the Settlement Method and Clearing System (Code or Property).
 * Used in combination with MxId to identify a specific MX message.
 *
 * @since 9.5.5
 */
public class SettlementInfo {

    private SettlementMethod settlementMethod;
    private String clrSysCd; // Clearing System Code
    private String clrSysPrtry; // Clearing System Proprietary Code

    public SettlementInfo() {}

    public SettlementMethod getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(SettlementMethod sttlmMtd) {
        this.settlementMethod = sttlmMtd;
    }

    public String getClrSysCd() {
        return clrSysCd;
    }

    public void setClrSysCd(String clrSysCd) {
        this.clrSysCd = clrSysCd;
    }

    public String getClrSysPrtry() {
        return clrSysPrtry;
    }

    public void setClrSysPrtry(String clrSysPrtry) {
        this.clrSysPrtry = clrSysPrtry;
    }
}
