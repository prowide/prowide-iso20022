
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
 * Specifies the financial instrument purchased by a central counterparty using clearing member assets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Investment2Choice", propOrder = {
    "uscrdCshDpst",
    "cntrlBkDpst",
    "rpAgrmt",
    "othrInvstmts",
    "outrghtInvstmt"
})
public class Investment2Choice {

    @XmlElement(name = "UscrdCshDpst")
    protected Deposit1 uscrdCshDpst;
    @XmlElement(name = "CntrlBkDpst")
    protected Deposit1 cntrlBkDpst;
    @XmlElement(name = "RpAgrmt")
    protected RepurchaseAgreement2 rpAgrmt;
    @XmlElement(name = "OthrInvstmts")
    protected OtherInvestment1 othrInvstmts;
    @XmlElement(name = "OutrghtInvstmt")
    protected SecurityIdentificationAndAmount2 outrghtInvstmt;

    /**
     * Gets the value of the uscrdCshDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Deposit1 }
     *     
     */
    public Deposit1 getUscrdCshDpst() {
        return uscrdCshDpst;
    }

    /**
     * Sets the value of the uscrdCshDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deposit1 }
     *     
     */
    public Investment2Choice setUscrdCshDpst(Deposit1 value) {
        this.uscrdCshDpst = value;
        return this;
    }

    /**
     * Gets the value of the cntrlBkDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Deposit1 }
     *     
     */
    public Deposit1 getCntrlBkDpst() {
        return cntrlBkDpst;
    }

    /**
     * Sets the value of the cntrlBkDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deposit1 }
     *     
     */
    public Investment2Choice setCntrlBkDpst(Deposit1 value) {
        this.cntrlBkDpst = value;
        return this;
    }

    /**
     * Gets the value of the rpAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreement2 }
     *     
     */
    public RepurchaseAgreement2 getRpAgrmt() {
        return rpAgrmt;
    }

    /**
     * Sets the value of the rpAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreement2 }
     *     
     */
    public Investment2Choice setRpAgrmt(RepurchaseAgreement2 value) {
        this.rpAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the othrInvstmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherInvestment1 }
     *     
     */
    public OtherInvestment1 getOthrInvstmts() {
        return othrInvstmts;
    }

    /**
     * Sets the value of the othrInvstmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherInvestment1 }
     *     
     */
    public Investment2Choice setOthrInvstmts(OtherInvestment1 value) {
        this.othrInvstmts = value;
        return this;
    }

    /**
     * Gets the value of the outrghtInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentificationAndAmount2 }
     *     
     */
    public SecurityIdentificationAndAmount2 getOutrghtInvstmt() {
        return outrghtInvstmt;
    }

    /**
     * Sets the value of the outrghtInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentificationAndAmount2 }
     *     
     */
    public Investment2Choice setOutrghtInvstmt(SecurityIdentificationAndAmount2 value) {
        this.outrghtInvstmt = value;
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
