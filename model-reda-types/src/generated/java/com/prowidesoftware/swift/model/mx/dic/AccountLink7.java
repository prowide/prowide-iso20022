
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines how the securities account is linked to the cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLink7", propOrder = {
    "sctiesAcct",
    "blckChainAdrOrWllt",
    "cshAcct",
    "vldFr",
    "vldTo",
    "dfltInd",
    "collstnInd",
    "cshSttlmInd"
})
public class AccountLink7 {

    @XmlElement(name = "SctiesAcct")
    protected SecuritiesAccount19 sctiesAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount38 cshAcct;
    @XmlElement(name = "VldFr", required = true)
    protected DateAndDateTime2Choice vldFr;
    @XmlElement(name = "VldTo")
    protected DateAndDateTime2Choice vldTo;
    @XmlElement(name = "DfltInd")
    protected boolean dfltInd;
    @XmlElement(name = "CollstnInd")
    protected boolean collstnInd;
    @XmlElement(name = "CshSttlmInd")
    protected boolean cshSttlmInd;

    /**
     * Gets the value of the sctiesAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcct() {
        return sctiesAcct;
    }

    /**
     * Sets the value of the sctiesAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public AccountLink7 setSctiesAcct(SecuritiesAccount19 value) {
        this.sctiesAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public AccountLink7 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public AccountLink7 setCshAcct(CashAccount38 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public AccountLink7 setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the vldTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldTo() {
        return vldTo;
    }

    /**
     * Sets the value of the vldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public AccountLink7 setVldTo(DateAndDateTime2Choice value) {
        this.vldTo = value;
        return this;
    }

    /**
     * Gets the value of the dfltInd property.
     * 
     */
    public boolean isDfltInd() {
        return dfltInd;
    }

    /**
     * Sets the value of the dfltInd property.
     * 
     */
    public AccountLink7 setDfltInd(boolean value) {
        this.dfltInd = value;
        return this;
    }

    /**
     * Gets the value of the collstnInd property.
     * 
     */
    public boolean isCollstnInd() {
        return collstnInd;
    }

    /**
     * Sets the value of the collstnInd property.
     * 
     */
    public AccountLink7 setCollstnInd(boolean value) {
        this.collstnInd = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmInd property.
     * 
     */
    public boolean isCshSttlmInd() {
        return cshSttlmInd;
    }

    /**
     * Sets the value of the cshSttlmInd property.
     * 
     */
    public AccountLink7 setCshSttlmInd(boolean value) {
        this.cshSttlmInd = value;
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
