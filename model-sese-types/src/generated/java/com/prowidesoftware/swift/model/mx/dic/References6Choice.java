
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
 * Choice of reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References6Choice", propOrder = {
    "acctSvcrTxId",
    "acctOwnrTxId",
    "mktInfrstrctrTxId",
    "poolId",
    "cmonId",
    "tradId"
})
public class References6Choice {

    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "TradId")
    protected String tradId;

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References6Choice setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References6Choice setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References6Choice setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
        return this;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References6Choice setPoolId(String value) {
        this.poolId = value;
        return this;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References6Choice setCmonId(String value) {
        this.cmonId = value;
        return this;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References6Choice setTradId(String value) {
        this.tradId = value;
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
