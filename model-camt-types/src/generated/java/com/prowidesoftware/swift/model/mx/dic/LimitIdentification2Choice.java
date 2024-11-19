
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
 * Limit details of one particular limit set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitIdentification2Choice", propOrder = {
    "cur",
    "dflt",
    "allCur",
    "allDflt"
})
public class LimitIdentification2Choice {

    @XmlElement(name = "Cur")
    protected LimitIdentification5 cur;
    @XmlElement(name = "Dflt")
    protected LimitIdentification5 dflt;
    @XmlElement(name = "AllCur")
    protected LimitIdentification6 allCur;
    @XmlElement(name = "AllDflt")
    protected LimitIdentification6 allDflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification2Choice setCur(LimitIdentification5 value) {
        this.cur = value;
        return this;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification2Choice setDflt(LimitIdentification5 value) {
        this.dflt = value;
        return this;
    }

    /**
     * Gets the value of the allCur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification6 getAllCur() {
        return allCur;
    }

    /**
     * Sets the value of the allCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification2Choice setAllCur(LimitIdentification6 value) {
        this.allCur = value;
        return this;
    }

    /**
     * Gets the value of the allDflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification6 getAllDflt() {
        return allDflt;
    }

    /**
     * Sets the value of the allDflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification2Choice setAllDflt(LimitIdentification6 value) {
        this.allDflt = value;
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
