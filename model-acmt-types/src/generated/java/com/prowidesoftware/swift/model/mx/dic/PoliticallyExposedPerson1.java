
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
 * Politically exposed person checks.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliticallyExposedPerson1", propOrder = {
    "pltclyXpsdPrsnTp",
    "pltclyXpsdPrsnSts"
})
public class PoliticallyExposedPerson1 {

    @XmlElement(name = "PltclyXpsdPrsnTp", required = true)
    protected PoliticalExposureType2Choice pltclyXpsdPrsnTp;
    @XmlElement(name = "PltclyXpsdPrsnSts")
    protected PoliticallyExposedPersonStatus1Choice pltclyXpsdPrsnSts;

    /**
     * Gets the value of the pltclyXpsdPrsnTp property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticalExposureType2Choice }
     *     
     */
    public PoliticalExposureType2Choice getPltclyXpsdPrsnTp() {
        return pltclyXpsdPrsnTp;
    }

    /**
     * Sets the value of the pltclyXpsdPrsnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalExposureType2Choice }
     *     
     */
    public PoliticallyExposedPerson1 setPltclyXpsdPrsnTp(PoliticalExposureType2Choice value) {
        this.pltclyXpsdPrsnTp = value;
        return this;
    }

    /**
     * Gets the value of the pltclyXpsdPrsnSts property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticallyExposedPersonStatus1Choice }
     *     
     */
    public PoliticallyExposedPersonStatus1Choice getPltclyXpsdPrsnSts() {
        return pltclyXpsdPrsnSts;
    }

    /**
     * Sets the value of the pltclyXpsdPrsnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticallyExposedPersonStatus1Choice }
     *     
     */
    public PoliticallyExposedPerson1 setPltclyXpsdPrsnSts(PoliticallyExposedPersonStatus1Choice value) {
        this.pltclyXpsdPrsnSts = value;
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
