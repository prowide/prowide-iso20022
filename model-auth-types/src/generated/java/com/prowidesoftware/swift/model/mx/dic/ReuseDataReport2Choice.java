
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
 * Information on reusability of previously submitted data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseDataReport2Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "collReuseUpd"
})
public class ReuseDataReport2Choice {

    @XmlElement(name = "New")
    protected ReuseDataReportNew2 _new;
    @XmlElement(name = "Err")
    protected ReuseDataReportError2 err;
    @XmlElement(name = "Crrctn")
    protected ReuseDataReportCorrection4 crrctn;
    @XmlElement(name = "CollReuseUpd")
    protected ReuseDataReportCorrection4 collReuseUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportNew2 }
     *     
     */
    public ReuseDataReportNew2 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportNew2 }
     *     
     */
    public ReuseDataReport2Choice setNew(ReuseDataReportNew2 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportError2 }
     *     
     */
    public ReuseDataReportError2 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportError2 }
     *     
     */
    public ReuseDataReport2Choice setErr(ReuseDataReportError2 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportCorrection4 }
     *     
     */
    public ReuseDataReportCorrection4 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportCorrection4 }
     *     
     */
    public ReuseDataReport2Choice setCrrctn(ReuseDataReportCorrection4 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the collReuseUpd property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseDataReportCorrection4 }
     *     
     */
    public ReuseDataReportCorrection4 getCollReuseUpd() {
        return collReuseUpd;
    }

    /**
     * Sets the value of the collReuseUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseDataReportCorrection4 }
     *     
     */
    public ReuseDataReport2Choice setCollReuseUpd(ReuseDataReportCorrection4 value) {
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
