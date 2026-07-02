
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
 * Limit details of one particular limit set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitIdentification1Choice", propOrder = {
    "cur",
    "dflt",
    "allCur",
    "allDflt"
})
public class LimitIdentification1Choice {

    @XmlElement(name = "Cur")
    protected LimitIdentification1 cur;
    @XmlElement(name = "Dflt")
    protected LimitIdentification1 dflt;
    @XmlElement(name = "AllCur")
    protected LimitIdentification2 allCur;
    @XmlElement(name = "AllDflt")
    protected LimitIdentification2 allDflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitIdentification1 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitIdentification1Choice setCur(LimitIdentification1 value) {
        this.cur = value;
        return this;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitIdentification1 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitIdentification1Choice setDflt(LimitIdentification1 value) {
        this.dflt = value;
        return this;
    }

    /**
     * Gets the value of the allCur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification2 }
     *     
     */
    public LimitIdentification2 getAllCur() {
        return allCur;
    }

    /**
     * Sets the value of the allCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification2 }
     *     
     */
    public LimitIdentification1Choice setAllCur(LimitIdentification2 value) {
        this.allCur = value;
        return this;
    }

    /**
     * Gets the value of the allDflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification2 }
     *     
     */
    public LimitIdentification2 getAllDflt() {
        return allDflt;
    }

    /**
     * Sets the value of the allDflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification2 }
     *     
     */
    public LimitIdentification1Choice setAllDflt(LimitIdentification2 value) {
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
