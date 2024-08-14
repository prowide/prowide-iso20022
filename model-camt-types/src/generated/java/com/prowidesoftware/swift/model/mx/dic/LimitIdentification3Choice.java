
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
@XmlType(name = "LimitIdentification3Choice", propOrder = {
    "cur",
    "dflt",
    "allCur",
    "allDflt"
})
public class LimitIdentification3Choice {

    @XmlElement(name = "Cur")
    protected LimitIdentification8 cur;
    @XmlElement(name = "Dflt")
    protected LimitIdentification8 dflt;
    @XmlElement(name = "AllCur")
    protected LimitIdentification9 allCur;
    @XmlElement(name = "AllDflt")
    protected LimitIdentification9 allDflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitIdentification8 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitIdentification3Choice setCur(LimitIdentification8 value) {
        this.cur = value;
        return this;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitIdentification8 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitIdentification3Choice setDflt(LimitIdentification8 value) {
        this.dflt = value;
        return this;
    }

    /**
     * Gets the value of the allCur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification9 }
     *     
     */
    public LimitIdentification9 getAllCur() {
        return allCur;
    }

    /**
     * Sets the value of the allCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification9 }
     *     
     */
    public LimitIdentification3Choice setAllCur(LimitIdentification9 value) {
        this.allCur = value;
        return this;
    }

    /**
     * Gets the value of the allDflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification9 }
     *     
     */
    public LimitIdentification9 getAllDflt() {
        return allDflt;
    }

    /**
     * Sets the value of the allDflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification9 }
     *     
     */
    public LimitIdentification3Choice setAllDflt(LimitIdentification9 value) {
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
