
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
 * Choice between a location and codified form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOrUnderConfirmationChoice1", propOrder = {
    "plcOfPresntn",
    "presntnUdrConf"
})
public class PlaceOrUnderConfirmationChoice1 {

    @XmlElement(name = "PlcOfPresntn")
    protected PlaceOfPresentation1 plcOfPresntn;
    @XmlElement(name = "PresntnUdrConf")
    @XmlSchemaType(name = "string")
    protected PresentationParty1Code presntnUdrConf;

    /**
     * Gets the value of the plcOfPresntn property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfPresentation1 }
     *     
     */
    public PlaceOfPresentation1 getPlcOfPresntn() {
        return plcOfPresntn;
    }

    /**
     * Sets the value of the plcOfPresntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfPresentation1 }
     *     
     */
    public PlaceOrUnderConfirmationChoice1 setPlcOfPresntn(PlaceOfPresentation1 value) {
        this.plcOfPresntn = value;
        return this;
    }

    /**
     * Gets the value of the presntnUdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationParty1Code }
     *     
     */
    public PresentationParty1Code getPresntnUdrConf() {
        return presntnUdrConf;
    }

    /**
     * Sets the value of the presntnUdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationParty1Code }
     *     
     */
    public PlaceOrUnderConfirmationChoice1 setPresntnUdrConf(PresentationParty1Code value) {
        this.presntnUdrConf = value;
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
