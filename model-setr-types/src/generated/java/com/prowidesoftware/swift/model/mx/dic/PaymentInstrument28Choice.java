
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
 * Choice between types of payment instrument, that is, cheque, credit transfer or investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument28Choice", propOrder = {
    "cdtTrfDtls",
    "chqDtls",
    "bkrsDrftDtls",
    "cshAcctDtls",
    "blckChainCshWllt"
})
public class PaymentInstrument28Choice {

    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer12 cdtTrfDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque10 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque10 bkrsDrftDtls;
    @XmlElement(name = "CshAcctDtls")
    protected InvestmentAccount60 cshAcctDtls;
    @XmlElement(name = "BlckChainCshWllt")
    protected BlockChainAddressWallet14 blckChainCshWllt;

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer12 }
     *     
     */
    public CreditTransfer12 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer12 }
     *     
     */
    public PaymentInstrument28Choice setCdtTrfDtls(CreditTransfer12 value) {
        this.cdtTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque10 }
     *     
     */
    public Cheque10 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque10 }
     *     
     */
    public PaymentInstrument28Choice setChqDtls(Cheque10 value) {
        this.chqDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque10 }
     *     
     */
    public Cheque10 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque10 }
     *     
     */
    public PaymentInstrument28Choice setBkrsDrftDtls(Cheque10 value) {
        this.bkrsDrftDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount60 }
     *     
     */
    public InvestmentAccount60 getCshAcctDtls() {
        return cshAcctDtls;
    }

    /**
     * Sets the value of the cshAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount60 }
     *     
     */
    public PaymentInstrument28Choice setCshAcctDtls(InvestmentAccount60 value) {
        this.cshAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the blckChainCshWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet14 }
     *     
     */
    public BlockChainAddressWallet14 getBlckChainCshWllt() {
        return blckChainCshWllt;
    }

    /**
     * Sets the value of the blckChainCshWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet14 }
     *     
     */
    public PaymentInstrument28Choice setBlckChainCshWllt(BlockChainAddressWallet14 value) {
        this.blckChainCshWllt = value;
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
