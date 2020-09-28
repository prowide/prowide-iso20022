
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for OutputTimeCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputTimeCriteria", propOrder = {
    "outputChannel",
    "toTm"
})
public class OutputTimeCriteria {

    @XmlElement(name = "OutputChannel", namespace = "urn:swift:snl:ns.Sw")
    protected String outputChannel;
    @XmlElement(name = "ToTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toTm;

    /**
     * OutputChannel
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputChannel() {
        return outputChannel;
    }

    /**
     * Sets the value of the outputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputTimeCriteria setOutputChannel(String value) {
        this.outputChannel = value;
        return this;
    }

    /**
     * Gets the value of the toTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToTm() {
        return toTm;
    }

    /**
     * Sets the value of the toTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OutputTimeCriteria setToTm(XMLGregorianCalendar value) {
        this.toTm = value;
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
