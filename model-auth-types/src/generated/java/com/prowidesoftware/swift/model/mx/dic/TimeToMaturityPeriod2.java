
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
 * Provides the start and end time for the time to maturity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToMaturityPeriod2", propOrder = {
    "start",
    "end"
})
public class TimeToMaturityPeriod2 {

    @XmlElement(name = "Start")
    protected MaturityTerm2 start;
    @XmlElement(name = "End")
    protected MaturityTerm2 end;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityTerm2 }
     *     
     */
    public MaturityTerm2 getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityTerm2 }
     *     
     */
    public TimeToMaturityPeriod2 setStart(MaturityTerm2 value) {
        this.start = value;
        return this;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityTerm2 }
     *     
     */
    public MaturityTerm2 getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityTerm2 }
     *     
     */
    public TimeToMaturityPeriod2 setEnd(MaturityTerm2 value) {
        this.end = value;
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
