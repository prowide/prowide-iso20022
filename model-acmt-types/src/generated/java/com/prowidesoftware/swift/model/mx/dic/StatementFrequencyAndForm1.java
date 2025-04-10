
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
 * Specifies a frequency, format and delivery address for statements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementFrequencyAndForm1", propOrder = {
    "frqcy",
    "comMtd",
    "dlvryAdr",
    "frmt"
})
public class StatementFrequencyAndForm1 {

    @XmlElement(name = "Frqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency7Code frqcy;
    @XmlElement(name = "ComMtd", required = true)
    protected CommunicationMethod2Choice comMtd;
    @XmlElement(name = "DlvryAdr", required = true)
    protected String dlvryAdr;
    @XmlElement(name = "Frmt", required = true)
    protected CommunicationFormat1Choice frmt;

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency7Code }
     *     
     */
    public Frequency7Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency7Code }
     *     
     */
    public StatementFrequencyAndForm1 setFrqcy(Frequency7Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the comMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod2Choice }
     *     
     */
    public CommunicationMethod2Choice getComMtd() {
        return comMtd;
    }

    /**
     * Sets the value of the comMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod2Choice }
     *     
     */
    public StatementFrequencyAndForm1 setComMtd(CommunicationMethod2Choice value) {
        this.comMtd = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryAdr() {
        return dlvryAdr;
    }

    /**
     * Sets the value of the dlvryAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatementFrequencyAndForm1 setDlvryAdr(String value) {
        this.dlvryAdr = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationFormat1Choice }
     *     
     */
    public CommunicationFormat1Choice getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationFormat1Choice }
     *     
     */
    public StatementFrequencyAndForm1 setFrmt(CommunicationFormat1Choice value) {
        this.frmt = value;
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
