
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies details of the cash net position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashNetPosition1", propOrder = {
    "netPosId",
    "netCshAmt",
    "ttlNbOfPoss",
    "authstnRsn"
})
public class CashNetPosition1 {

    @XmlElement(name = "NetPosId", required = true)
    protected String netPosId;
    @XmlElement(name = "NetCshAmt", required = true)
    protected AmountAndDirection52 netCshAmt;
    @XmlElement(name = "TtlNbOfPoss", required = true)
    protected BigDecimal ttlNbOfPoss;
    @XmlElement(name = "AuthstnRsn")
    protected String authstnRsn;

    /**
     * Gets the value of the netPosId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPosId() {
        return netPosId;
    }

    /**
     * Sets the value of the netPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashNetPosition1 setNetPosId(String value) {
        this.netPosId = value;
        return this;
    }

    /**
     * Gets the value of the netCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Sets the value of the netCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public CashNetPosition1 setNetCshAmt(AmountAndDirection52 value) {
        this.netCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfPoss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfPoss() {
        return ttlNbOfPoss;
    }

    /**
     * Sets the value of the ttlNbOfPoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CashNetPosition1 setTtlNbOfPoss(BigDecimal value) {
        this.ttlNbOfPoss = value;
        return this;
    }

    /**
     * Gets the value of the authstnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnRsn() {
        return authstnRsn;
    }

    /**
     * Sets the value of the authstnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashNetPosition1 setAuthstnRsn(String value) {
        this.authstnRsn = value;
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
