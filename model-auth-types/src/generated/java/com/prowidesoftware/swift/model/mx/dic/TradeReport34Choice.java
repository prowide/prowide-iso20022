
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport34Choice", propOrder = {
    "_new",
    "mrgnUpd",
    "err",
    "crrctn"
})
public class TradeReport34Choice {

    @XmlElement(name = "New")
    protected MarginReportData9 _new;
    @XmlElement(name = "MrgnUpd")
    protected MarginReportData9 mrgnUpd;
    @XmlElement(name = "Err")
    protected MarginReportData9 err;
    @XmlElement(name = "Crrctn")
    protected MarginReportData9 crrctn;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData9 }
     *     
     */
    public MarginReportData9 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData9 }
     *     
     */
    public TradeReport34Choice setNew(MarginReportData9 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mrgnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData9 }
     *     
     */
    public MarginReportData9 getMrgnUpd() {
        return mrgnUpd;
    }

    /**
     * Sets the value of the mrgnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData9 }
     *     
     */
    public TradeReport34Choice setMrgnUpd(MarginReportData9 value) {
        this.mrgnUpd = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData9 }
     *     
     */
    public MarginReportData9 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData9 }
     *     
     */
    public TradeReport34Choice setErr(MarginReportData9 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData9 }
     *     
     */
    public MarginReportData9 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData9 }
     *     
     */
    public TradeReport34Choice setCrrctn(MarginReportData9 value) {
        this.crrctn = value;
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
