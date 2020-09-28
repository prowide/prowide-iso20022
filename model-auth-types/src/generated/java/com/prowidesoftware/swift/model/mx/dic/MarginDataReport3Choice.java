
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
 * Information on the margin transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginDataReport3Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "mrgnUpd"
})
public class MarginDataReport3Choice {

    @XmlElement(name = "New")
    protected CollateralMarginNew3 _new;
    @XmlElement(name = "Err")
    protected CollateralMarginError1 err;
    @XmlElement(name = "Crrctn")
    protected CollateralMarginCorrection2 crrctn;
    @XmlElement(name = "MrgnUpd")
    protected CollateralMarginMarginUpdate1 mrgnUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginNew3 }
     *     
     */
    public CollateralMarginNew3 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginNew3 }
     *     
     */
    public MarginDataReport3Choice setNew(CollateralMarginNew3 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginError1 }
     *     
     */
    public CollateralMarginError1 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginError1 }
     *     
     */
    public MarginDataReport3Choice setErr(CollateralMarginError1 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection2 }
     *     
     */
    public CollateralMarginCorrection2 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection2 }
     *     
     */
    public MarginDataReport3Choice setCrrctn(CollateralMarginCorrection2 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the mrgnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginMarginUpdate1 }
     *     
     */
    public CollateralMarginMarginUpdate1 getMrgnUpd() {
        return mrgnUpd;
    }

    /**
     * Sets the value of the mrgnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginMarginUpdate1 }
     *     
     */
    public MarginDataReport3Choice setMrgnUpd(CollateralMarginMarginUpdate1 value) {
        this.mrgnUpd = value;
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
