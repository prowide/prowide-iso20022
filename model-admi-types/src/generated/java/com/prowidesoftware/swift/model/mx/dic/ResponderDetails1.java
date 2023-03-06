
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the Financial Institution responding to the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponderDetails1", propOrder = {
    "dtTmStmp",
    "rspndr"
})
public class ResponderDetails1 {

    @XmlElement(name = "DtTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTmStmp;
    @XmlElement(name = "Rspndr", required = true)
    protected String rspndr;

    /**
     * Gets the value of the dtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtTmStmp() {
        return dtTmStmp;
    }

    /**
     * Sets the value of the dtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponderDetails1 setDtTmStmp(XMLGregorianCalendar value) {
        this.dtTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the rspndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndr() {
        return rspndr;
    }

    /**
     * Sets the value of the rspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponderDetails1 setRspndr(String value) {
        this.rspndr = value;
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
