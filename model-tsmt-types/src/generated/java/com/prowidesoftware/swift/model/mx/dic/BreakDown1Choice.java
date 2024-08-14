
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
 * Specifies if breakdown is by purchase order or commercial invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakDown1Choice", propOrder = {
    "byPurchsOrdr",
    "byComrclInvc"
})
public class BreakDown1Choice {

    @XmlElement(name = "ByPurchsOrdr")
    protected ReportLine5 byPurchsOrdr;
    @XmlElement(name = "ByComrclInvc")
    protected ReportLine6 byComrclInvc;

    /**
     * Gets the value of the byPurchsOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLine5 }
     *     
     */
    public ReportLine5 getByPurchsOrdr() {
        return byPurchsOrdr;
    }

    /**
     * Sets the value of the byPurchsOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLine5 }
     *     
     */
    public BreakDown1Choice setByPurchsOrdr(ReportLine5 value) {
        this.byPurchsOrdr = value;
        return this;
    }

    /**
     * Gets the value of the byComrclInvc property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLine6 }
     *     
     */
    public ReportLine6 getByComrclInvc() {
        return byComrclInvc;
    }

    /**
     * Sets the value of the byComrclInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLine6 }
     *     
     */
    public BreakDown1Choice setByComrclInvc(ReportLine6 value) {
        this.byComrclInvc = value;
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
