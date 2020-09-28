
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of the foreign exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchange1", propOrder = {
    "frgnCcy",
    "xchgSpotRate",
    "xchgFwdPt"
})
public class ForeignExchange1 {

    @XmlElement(name = "FrgnCcy", required = true)
    protected String frgnCcy;
    @XmlElement(name = "XchgSpotRate", required = true)
    protected BigDecimal xchgSpotRate;
    @XmlElement(name = "XchgFwdPt", required = true)
    protected BigDecimal xchgFwdPt;

    /**
     * Gets the value of the frgnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrgnCcy() {
        return frgnCcy;
    }

    /**
     * Sets the value of the frgnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchange1 setFrgnCcy(String value) {
        this.frgnCcy = value;
        return this;
    }

    /**
     * Gets the value of the xchgSpotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgSpotRate() {
        return xchgSpotRate;
    }

    /**
     * Sets the value of the xchgSpotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ForeignExchange1 setXchgSpotRate(BigDecimal value) {
        this.xchgSpotRate = value;
        return this;
    }

    /**
     * Gets the value of the xchgFwdPt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgFwdPt() {
        return xchgFwdPt;
    }

    /**
     * Sets the value of the xchgFwdPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ForeignExchange1 setXchgFwdPt(BigDecimal value) {
        this.xchgFwdPt = value;
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
