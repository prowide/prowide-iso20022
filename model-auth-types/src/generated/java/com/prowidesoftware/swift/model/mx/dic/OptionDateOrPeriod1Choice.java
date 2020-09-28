
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides the exercise date or notice period for a call/put option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDateOrPeriod1Choice", propOrder = {
    "earlstExrcDt",
    "ntcePrd"
})
public class OptionDateOrPeriod1Choice {

    @XmlElement(name = "EarlstExrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstExrcDt;
    @XmlElement(name = "NtcePrd")
    protected BigDecimal ntcePrd;

    /**
     * Gets the value of the earlstExrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlstExrcDt() {
        return earlstExrcDt;
    }

    /**
     * Sets the value of the earlstExrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OptionDateOrPeriod1Choice setEarlstExrcDt(XMLGregorianCalendar value) {
        this.earlstExrcDt = value;
        return this;
    }

    /**
     * Gets the value of the ntcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtcePrd() {
        return ntcePrd;
    }

    /**
     * Sets the value of the ntcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OptionDateOrPeriod1Choice setNtcePrd(BigDecimal value) {
        this.ntcePrd = value;
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
