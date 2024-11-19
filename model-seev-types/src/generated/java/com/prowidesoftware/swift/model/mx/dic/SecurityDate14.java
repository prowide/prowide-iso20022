
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
 * Specifies security date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDate14", propOrder = {
    "pmtDt",
    "avlblDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "prpssDt",
    "lastTradgDt"
})
public class SecurityDate14 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat34Choice pmtDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat34Choice avlblDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat34Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat34Choice earlstPmtDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat34Choice prpssDt;
    @XmlElement(name = "LastTradgDt")
    protected DateFormat34Choice lastTradgDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public SecurityDate14 setPmtDt(DateFormat34Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public SecurityDate14 setAvlblDt(DateFormat34Choice value) {
        this.avlblDt = value;
        return this;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public SecurityDate14 setDvddRnkgDt(DateFormat34Choice value) {
        this.dvddRnkgDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public SecurityDate14 setEarlstPmtDt(DateFormat34Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public SecurityDate14 setPrpssDt(DateFormat34Choice value) {
        this.prpssDt = value;
        return this;
    }

    /**
     * Gets the value of the lastTradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getLastTradgDt() {
        return lastTradgDt;
    }

    /**
     * Sets the value of the lastTradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public SecurityDate14 setLastTradgDt(DateFormat34Choice value) {
        this.lastTradgDt = value;
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
