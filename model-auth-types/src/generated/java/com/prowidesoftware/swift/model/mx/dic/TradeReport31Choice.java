
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport31Choice", propOrder = {
    "_new",
    "mrgnUpd",
    "err",
    "crrctn"
})
public class TradeReport31Choice {

    @XmlElement(name = "New")
    protected MarginReportData7 _new;
    @XmlElement(name = "MrgnUpd")
    protected MarginReportData7 mrgnUpd;
    @XmlElement(name = "Err")
    protected MarginReportData7 err;
    @XmlElement(name = "Crrctn")
    protected MarginReportData7 crrctn;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public TradeReport31Choice setNew(MarginReportData7 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mrgnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getMrgnUpd() {
        return mrgnUpd;
    }

    /**
     * Sets the value of the mrgnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public TradeReport31Choice setMrgnUpd(MarginReportData7 value) {
        this.mrgnUpd = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public TradeReport31Choice setErr(MarginReportData7 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportData7 }
     *     
     */
    public MarginReportData7 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportData7 }
     *     
     */
    public TradeReport31Choice setCrrctn(MarginReportData7 value) {
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
