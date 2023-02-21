
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Configuration parameters of data exchanges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeConfiguration10", propOrder = {
    "xchgPlcy",
    "maxNb",
    "maxAmt",
    "reTry",
    "tmCond",
    "xchgFaild",
    "xchgDclnd"
})
public class ExchangeConfiguration10 {

    @XmlElement(name = "XchgPlcy", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExchangePolicy2Code> xchgPlcy;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "ReTry")
    protected ProcessRetry3 reTry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming6 tmCond;
    @XmlElement(name = "XchgFaild")
    protected Boolean xchgFaild;
    @XmlElement(name = "XchgDclnd")
    protected Boolean xchgDclnd;

    /**
     * Gets the value of the xchgPlcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xchgPlcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgPlcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangePolicy2Code }
     * 
     * 
     */
    public List<ExchangePolicy2Code> getXchgPlcy() {
        if (xchgPlcy == null) {
            xchgPlcy = new ArrayList<ExchangePolicy2Code>();
        }
        return this.xchgPlcy;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeConfiguration10 setMaxNb(BigDecimal value) {
        this.maxNb = value;
        return this;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeConfiguration10 setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
        return this;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ExchangeConfiguration10 setReTry(ProcessRetry3 value) {
        this.reTry = value;
        return this;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming6 }
     *     
     */
    public ProcessTiming6 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming6 }
     *     
     */
    public ExchangeConfiguration10 setTmCond(ProcessTiming6 value) {
        this.tmCond = value;
        return this;
    }

    /**
     * Gets the value of the xchgFaild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgFaild() {
        return xchgFaild;
    }

    /**
     * Sets the value of the xchgFaild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExchangeConfiguration10 setXchgFaild(Boolean value) {
        this.xchgFaild = value;
        return this;
    }

    /**
     * Gets the value of the xchgDclnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgDclnd() {
        return xchgDclnd;
    }

    /**
     * Sets the value of the xchgDclnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExchangeConfiguration10 setXchgDclnd(Boolean value) {
        this.xchgDclnd = value;
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

    /**
     * Adds a new item to the xchgPlcy list.
     * @see #getXchgPlcy()
     * 
     */
    public ExchangeConfiguration10 addXchgPlcy(ExchangePolicy2Code xchgPlcy) {
        getXchgPlcy().add(xchgPlcy);
        return this;
    }

}
