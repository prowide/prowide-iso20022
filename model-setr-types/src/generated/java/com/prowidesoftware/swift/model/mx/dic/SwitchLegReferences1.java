
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a switch leg that is rejected or repaired.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchLegReferences1", propOrder = {
    "redLegId",
    "sbcptLegId",
    "legRjctnRsn",
    "rprdConds",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class SwitchLegReferences1 {

    @XmlElement(name = "RedLegId")
    protected String redLegId;
    @XmlElement(name = "SbcptLegId")
    protected String sbcptLegId;
    @XmlElement(name = "LegRjctnRsn")
    protected String legRjctnRsn;
    @XmlElement(name = "RprdConds")
    protected RepairedConditions3 rprdConds;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount13 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument10 finInstrmDtls;

    /**
     * Gets the value of the redLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedLegId() {
        return redLegId;
    }

    /**
     * Sets the value of the redLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchLegReferences1 setRedLegId(String value) {
        this.redLegId = value;
        return this;
    }

    /**
     * Gets the value of the sbcptLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbcptLegId() {
        return sbcptLegId;
    }

    /**
     * Sets the value of the sbcptLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchLegReferences1 setSbcptLegId(String value) {
        this.sbcptLegId = value;
        return this;
    }

    /**
     * Gets the value of the legRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegRjctnRsn() {
        return legRjctnRsn;
    }

    /**
     * Sets the value of the legRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchLegReferences1 setLegRjctnRsn(String value) {
        this.legRjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rprdConds property.
     * 
     * @return
     *     possible object is
     *     {@link RepairedConditions3 }
     *     
     */
    public RepairedConditions3 getRprdConds() {
        return rprdConds;
    }

    /**
     * Sets the value of the rprdConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairedConditions3 }
     *     
     */
    public SwitchLegReferences1 setRprdConds(RepairedConditions3 value) {
        this.rprdConds = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public InvestmentAccount13 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public SwitchLegReferences1 setInvstmtAcctDtls(InvestmentAccount13 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public FinancialInstrument10 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public SwitchLegReferences1 setFinInstrmDtls(FinancialInstrument10 value) {
        this.finInstrmDtls = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
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
