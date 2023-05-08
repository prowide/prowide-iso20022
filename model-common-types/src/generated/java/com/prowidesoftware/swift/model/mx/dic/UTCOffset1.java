
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
    @XmlElement(name = "NbOfHrs", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar nbOfHrs;

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
     *     {@link String }
     *     
     */
    public Calendar getNbOfHrs() {
        return nbOfHrs;
    }

    /**
     * Sets the value of the nbOfHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UTCOffset1 setNbOfHrs(Calendar value) {
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
