
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
 * Data related to the loyalty server during a loyalty transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyServerData1", propOrder = {
    "lltySvrId",
    "apprvlCd",
    "lltyTxId",
    "hstRcncltnId"
})
public class LoyaltyServerData1 {

    @XmlElement(name = "LltySvrId")
    protected String lltySvrId;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;
    @XmlElement(name = "LltyTxId")
    protected TransactionIdentifier1 lltyTxId;
    @XmlElement(name = "HstRcncltnId")
    protected String hstRcncltnId;

    /**
     * Gets the value of the lltySvrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLltySvrId() {
        return lltySvrId;
    }

    /**
     * Sets the value of the lltySvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyServerData1 setLltySvrId(String value) {
        this.lltySvrId = value;
        return this;
    }

    /**
     * Gets the value of the apprvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlCd() {
        return apprvlCd;
    }

    /**
     * Sets the value of the apprvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyServerData1 setApprvlCd(String value) {
        this.apprvlCd = value;
        return this;
    }

    /**
     * Gets the value of the lltyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getLltyTxId() {
        return lltyTxId;
    }

    /**
     * Sets the value of the lltyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public LoyaltyServerData1 setLltyTxId(TransactionIdentifier1 value) {
        this.lltyTxId = value;
        return this;
    }

    /**
     * Gets the value of the hstRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstRcncltnId() {
        return hstRcncltnId;
    }

    /**
     * Sets the value of the hstRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyServerData1 setHstRcncltnId(String value) {
        this.hstRcncltnId = value;
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
