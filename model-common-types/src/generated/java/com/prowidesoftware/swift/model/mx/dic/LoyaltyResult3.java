
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
 * Data related to the result of a processed loyalty transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyResult3", propOrder = {
    "acct",
    "amt",
    "svrData",
    "rbts"
})
public class LoyaltyResult3 {

    @XmlElement(name = "Acct", required = true)
    protected LoyaltyAccount3 acct;
    @XmlElement(name = "Amt")
    protected LoyaltyAmount1 amt;
    @XmlElement(name = "SvrData")
    protected LoyaltyServerData1 svrData;
    @XmlElement(name = "Rbts")
    protected LoyaltyRebates1 rbts;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public LoyaltyAccount3 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public LoyaltyResult3 setAcct(LoyaltyAccount3 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAmount1 }
     *     
     */
    public LoyaltyAmount1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAmount1 }
     *     
     */
    public LoyaltyResult3 setAmt(LoyaltyAmount1 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the svrData property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyServerData1 }
     *     
     */
    public LoyaltyServerData1 getSvrData() {
        return svrData;
    }

    /**
     * Sets the value of the svrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyServerData1 }
     *     
     */
    public LoyaltyResult3 setSvrData(LoyaltyServerData1 value) {
        this.svrData = value;
        return this;
    }

    /**
     * Gets the value of the rbts property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRebates1 }
     *     
     */
    public LoyaltyRebates1 getRbts() {
        return rbts;
    }

    /**
     * Sets the value of the rbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRebates1 }
     *     
     */
    public LoyaltyResult3 setRbts(LoyaltyRebates1 value) {
        this.rbts = value;
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
