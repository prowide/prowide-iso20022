
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
 * Information in relation with the net asset value per unit or share at the end of each month.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Month2Choice", propOrder = {
    "yrInf",
    "qrtrInf",
    "frstHalfYrInf",
    "scndHalfYrInf",
    "lastNineMnthsInf",
    "frstNineMnthsInf"
})
public class Month2Choice {

    @XmlElement(name = "YrInf")
    protected Year2 yrInf;
    @XmlElement(name = "QrtrInf")
    protected Quarter2 qrtrInf;
    @XmlElement(name = "FrstHalfYrInf")
    protected HalfYear2 frstHalfYrInf;
    @XmlElement(name = "ScndHalfYrInf")
    protected HalfYear2 scndHalfYrInf;
    @XmlElement(name = "LastNineMnthsInf")
    protected NineMonths2 lastNineMnthsInf;
    @XmlElement(name = "FrstNineMnthsInf")
    protected NineMonths2 frstNineMnthsInf;

    /**
     * Gets the value of the yrInf property.
     * 
     * @return
     *     possible object is
     *     {@link Year2 }
     *     
     */
    public Year2 getYrInf() {
        return yrInf;
    }

    /**
     * Sets the value of the yrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year2 }
     *     
     */
    public Month2Choice setYrInf(Year2 value) {
        this.yrInf = value;
        return this;
    }

    /**
     * Gets the value of the qrtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link Quarter2 }
     *     
     */
    public Quarter2 getQrtrInf() {
        return qrtrInf;
    }

    /**
     * Sets the value of the qrtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarter2 }
     *     
     */
    public Month2Choice setQrtrInf(Quarter2 value) {
        this.qrtrInf = value;
        return this;
    }

    /**
     * Gets the value of the frstHalfYrInf property.
     * 
     * @return
     *     possible object is
     *     {@link HalfYear2 }
     *     
     */
    public HalfYear2 getFrstHalfYrInf() {
        return frstHalfYrInf;
    }

    /**
     * Sets the value of the frstHalfYrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfYear2 }
     *     
     */
    public Month2Choice setFrstHalfYrInf(HalfYear2 value) {
        this.frstHalfYrInf = value;
        return this;
    }

    /**
     * Gets the value of the scndHalfYrInf property.
     * 
     * @return
     *     possible object is
     *     {@link HalfYear2 }
     *     
     */
    public HalfYear2 getScndHalfYrInf() {
        return scndHalfYrInf;
    }

    /**
     * Sets the value of the scndHalfYrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfYear2 }
     *     
     */
    public Month2Choice setScndHalfYrInf(HalfYear2 value) {
        this.scndHalfYrInf = value;
        return this;
    }

    /**
     * Gets the value of the lastNineMnthsInf property.
     * 
     * @return
     *     possible object is
     *     {@link NineMonths2 }
     *     
     */
    public NineMonths2 getLastNineMnthsInf() {
        return lastNineMnthsInf;
    }

    /**
     * Sets the value of the lastNineMnthsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NineMonths2 }
     *     
     */
    public Month2Choice setLastNineMnthsInf(NineMonths2 value) {
        this.lastNineMnthsInf = value;
        return this;
    }

    /**
     * Gets the value of the frstNineMnthsInf property.
     * 
     * @return
     *     possible object is
     *     {@link NineMonths2 }
     *     
     */
    public NineMonths2 getFrstNineMnthsInf() {
        return frstNineMnthsInf;
    }

    /**
     * Sets the value of the frstNineMnthsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NineMonths2 }
     *     
     */
    public Month2Choice setFrstNineMnthsInf(NineMonths2 value) {
        this.frstNineMnthsInf = value;
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
