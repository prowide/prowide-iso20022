
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
 * Specifies the aggregated data per transaction type for a settlement internaliser.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserTransactionType1", propOrder = {
    "sctiesBuyOrSell",
    "collMgmtOpr",
    "sctiesLndgOrBrrwg",
    "rpAgrmt",
    "othrTxs"
})
public class SettlementInternaliserTransactionType1 {

    @XmlElement(name = "SctiesBuyOrSell", required = true)
    protected InternalisationData1 sctiesBuyOrSell;
    @XmlElement(name = "CollMgmtOpr", required = true)
    protected InternalisationData1 collMgmtOpr;
    @XmlElement(name = "SctiesLndgOrBrrwg", required = true)
    protected InternalisationData1 sctiesLndgOrBrrwg;
    @XmlElement(name = "RpAgrmt", required = true)
    protected InternalisationData1 rpAgrmt;
    @XmlElement(name = "OthrTxs", required = true)
    protected InternalisationData1 othrTxs;

    /**
     * Gets the value of the sctiesBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getSctiesBuyOrSell() {
        return sctiesBuyOrSell;
    }

    /**
     * Sets the value of the sctiesBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserTransactionType1 setSctiesBuyOrSell(InternalisationData1 value) {
        this.sctiesBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the collMgmtOpr property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getCollMgmtOpr() {
        return collMgmtOpr;
    }

    /**
     * Sets the value of the collMgmtOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserTransactionType1 setCollMgmtOpr(InternalisationData1 value) {
        this.collMgmtOpr = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndgOrBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getSctiesLndgOrBrrwg() {
        return sctiesLndgOrBrrwg;
    }

    /**
     * Sets the value of the sctiesLndgOrBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserTransactionType1 setSctiesLndgOrBrrwg(InternalisationData1 value) {
        this.sctiesLndgOrBrrwg = value;
        return this;
    }

    /**
     * Gets the value of the rpAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getRpAgrmt() {
        return rpAgrmt;
    }

    /**
     * Sets the value of the rpAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserTransactionType1 setRpAgrmt(InternalisationData1 value) {
        this.rpAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the othrTxs property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOthrTxs() {
        return othrTxs;
    }

    /**
     * Sets the value of the othrTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserTransactionType1 setOthrTxs(InternalisationData1 value) {
        this.othrTxs = value;
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
