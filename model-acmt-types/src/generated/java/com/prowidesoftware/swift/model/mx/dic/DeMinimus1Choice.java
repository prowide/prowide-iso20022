
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
 * De minimus applicability conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeMinimus1Choice", propOrder = {
    "deMnmsAplbl",
    "deMnmsNotAplbl"
})
public class DeMinimus1Choice {

    @XmlElement(name = "DeMnmsAplbl")
    protected DeMinimusApplicable1 deMnmsAplbl;
    @XmlElement(name = "DeMnmsNotAplbl")
    protected DeMinimusNotApplicable1 deMnmsNotAplbl;

    /**
     * Gets the value of the deMnmsAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimusApplicable1 }
     *     
     */
    public DeMinimusApplicable1 getDeMnmsAplbl() {
        return deMnmsAplbl;
    }

    /**
     * Sets the value of the deMnmsAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimusApplicable1 }
     *     
     */
    public DeMinimus1Choice setDeMnmsAplbl(DeMinimusApplicable1 value) {
        this.deMnmsAplbl = value;
        return this;
    }

    /**
     * Gets the value of the deMnmsNotAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimusNotApplicable1 }
     *     
     */
    public DeMinimusNotApplicable1 getDeMnmsNotAplbl() {
        return deMnmsNotAplbl;
    }

    /**
     * Sets the value of the deMnmsNotAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimusNotApplicable1 }
     *     
     */
    public DeMinimus1Choice setDeMnmsNotAplbl(DeMinimusNotApplicable1 value) {
        this.deMnmsNotAplbl = value;
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
