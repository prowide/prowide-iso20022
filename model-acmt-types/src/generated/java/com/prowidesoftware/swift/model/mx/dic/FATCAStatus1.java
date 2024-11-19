
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
 * Foreign Account Tax Compliance Act (FATCA) status information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAStatus1", propOrder = {
    "tp",
    "src"
})
public class FATCAStatus1 {

    @XmlElement(name = "Tp", required = true)
    protected FATCAStatus1Choice tp;
    @XmlElement(name = "Src")
    protected FATCASource1Choice src;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAStatus1Choice }
     *     
     */
    public FATCAStatus1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAStatus1Choice }
     *     
     */
    public FATCAStatus1 setTp(FATCAStatus1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link FATCASource1Choice }
     *     
     */
    public FATCASource1Choice getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCASource1Choice }
     *     
     */
    public FATCAStatus1 setSrc(FATCASource1Choice value) {
        this.src = value;
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
