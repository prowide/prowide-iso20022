
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
@XmlType(name = "SecurityDate5", propOrder = {
    "pmtDt",
    "avlblDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "prpssDt"
})
public class SecurityDate5 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat19Choice pmtDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat19Choice avlblDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat19Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat19Choice earlstPmtDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat19Choice prpssDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public SecurityDate5 setPmtDt(DateFormat19Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public SecurityDate5 setAvlblDt(DateFormat19Choice value) {
        this.avlblDt = value;
        return this;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public SecurityDate5 setDvddRnkgDt(DateFormat19Choice value) {
        this.dvddRnkgDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public SecurityDate5 setEarlstPmtDt(DateFormat19Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public SecurityDate5 setPrpssDt(DateFormat19Choice value) {
        this.prpssDt = value;
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
