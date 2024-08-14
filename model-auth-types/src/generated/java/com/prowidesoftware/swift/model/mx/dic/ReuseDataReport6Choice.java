
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
 * Information on reusability of previously submitted data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseDataReport6Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "collReuseUpd"
})
public class ReuseDataReport6Choice {

    @XmlElement(name = "New")
    protected ReuseDataReportNew6 _new;
    @XmlElement(name = "Err")
    protected ReuseDataReportError5 err;
    @XmlElement(name = "Crrctn")
    protected ReuseDataReportCorrection14 crrctn;
    @XmlElement(name = "CollReuseUpd")
    protected ReuseDataReportCorrection14 collReuseUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportNew6 }
     *     
     */
    public ReuseDataReportNew6 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportNew6 }
     *     
     */
    public ReuseDataReport6Choice setNew(ReuseDataReportNew6 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportError5 }
     *     
     */
    public ReuseDataReportError5 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportError5 }
     *     
     */
    public ReuseDataReport6Choice setErr(ReuseDataReportError5 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public ReuseDataReportCorrection14 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public ReuseDataReport6Choice setCrrctn(ReuseDataReportCorrection14 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the collReuseUpd property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public ReuseDataReportCorrection14 getCollReuseUpd() {
        return collReuseUpd;
    }

    /**
     * Sets the value of the collReuseUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportCorrection14 }
     *     
     */
    public ReuseDataReport6Choice setCollReuseUpd(ReuseDataReportCorrection14 value) {
        this.collReuseUpd = value;
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
