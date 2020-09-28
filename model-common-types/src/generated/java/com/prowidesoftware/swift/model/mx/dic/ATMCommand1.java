
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
 * Maintenance command to perform on an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand1", propOrder = {
    "tp",
    "urgcy",
    "dtTm",
    "cmdId",
    "cmdParams"
})
public class ATMCommand1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand1Code tp;
    @XmlElement(name = "Urgcy", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel2Code urgcy;
    @XmlElement(name = "DtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "CmdParams")
    protected ATMCommandParameters1Choice cmdParams;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand1Code }
     *     
     */
    public ATMCommand1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand1Code }
     *     
     */
    public ATMCommand1 setTp(ATMCommand1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the urgcy property.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public TMSContactLevel2Code getUrgcy() {
        return urgcy;
    }

    /**
     * Sets the value of the urgcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public ATMCommand1 setUrgcy(TMSContactLevel2Code value) {
        this.urgcy = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ATMCommand1 setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommand1 setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
        return this;
    }

    /**
     * Gets the value of the cmdParams property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandParameters1Choice }
     *     
     */
    public ATMCommandParameters1Choice getCmdParams() {
        return cmdParams;
    }

    /**
     * Sets the value of the cmdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandParameters1Choice }
     *     
     */
    public ATMCommand1 setCmdParams(ATMCommandParameters1Choice value) {
        this.cmdParams = value;
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
