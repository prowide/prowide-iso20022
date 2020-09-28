
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details on the measures decided by the board in case of non compliance with the weekly liquidity thresholds applicable to public debt constant net asset value money market funds and low volatility net asset value money market funds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure1Choice", propOrder = {
    "frstMeasrTp",
    "scndMeasrTp"
})
public class Measure1Choice {

    @XmlElement(name = "FrstMeasrTp")
    @XmlSchemaType(name = "string")
    protected ArrangementType2Code frstMeasrTp;
    @XmlElement(name = "ScndMeasrTp")
    @XmlSchemaType(name = "string")
    protected ArrangementType3Code scndMeasrTp;

    /**
     * Gets the value of the frstMeasrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementType2Code }
     *     
     */
    public ArrangementType2Code getFrstMeasrTp() {
        return frstMeasrTp;
    }

    /**
     * Sets the value of the frstMeasrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementType2Code }
     *     
     */
    public Measure1Choice setFrstMeasrTp(ArrangementType2Code value) {
        this.frstMeasrTp = value;
        return this;
    }

    /**
     * Gets the value of the scndMeasrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementType3Code }
     *     
     */
    public ArrangementType3Code getScndMeasrTp() {
        return scndMeasrTp;
    }

    /**
     * Sets the value of the scndMeasrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementType3Code }
     *     
     */
    public Measure1Choice setScndMeasrTp(ArrangementType3Code value) {
        this.scndMeasrTp = value;
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
