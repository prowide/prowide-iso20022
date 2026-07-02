
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
 * Specifies security date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDate18", propOrder = {
    "pmtDt",
    "avlblDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "prpssDt",
    "lastTradgDt"
})
public class SecurityDate18 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat49Choice pmtDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat49Choice avlblDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat49Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat49Choice earlstPmtDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat49Choice prpssDt;
    @XmlElement(name = "LastTradgDt")
    protected DateFormat49Choice lastTradgDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public SecurityDate18 setPmtDt(DateFormat49Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public SecurityDate18 setAvlblDt(DateFormat49Choice value) {
        this.avlblDt = value;
        return this;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public SecurityDate18 setDvddRnkgDt(DateFormat49Choice value) {
        this.dvddRnkgDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public SecurityDate18 setEarlstPmtDt(DateFormat49Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public SecurityDate18 setPrpssDt(DateFormat49Choice value) {
        this.prpssDt = value;
        return this;
    }

    /**
     * Gets the value of the lastTradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getLastTradgDt() {
        return lastTradgDt;
    }

    /**
     * Sets the value of the lastTradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public SecurityDate18 setLastTradgDt(DateFormat49Choice value) {
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
