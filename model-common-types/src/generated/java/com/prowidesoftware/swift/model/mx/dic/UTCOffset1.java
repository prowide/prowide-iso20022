
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the parameters to calculate the local reporting time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UTCOffset1", propOrder = {
    "sgn",
    "nbOfHrs"
})
public class UTCOffset1 {

    @XmlElement(name = "Sgn")
    protected boolean sgn;
    @XmlElement(name = "NbOfHrs", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar nbOfHrs;

    /**
     * Gets the value of the sgn property.
     * 
     */
    public boolean isSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     */
    public UTCOffset1 setSgn(boolean value) {
        this.sgn = value;
        return this;
    }

    /**
     * Gets the value of the nbOfHrs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNbOfHrs() {
        return nbOfHrs;
    }

    /**
     * Sets the value of the nbOfHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public UTCOffset1 setNbOfHrs(XMLGregorianCalendar value) {
        this.nbOfHrs = value;
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
