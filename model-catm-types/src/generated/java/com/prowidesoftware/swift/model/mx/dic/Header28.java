
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
 * Set of characteristics related to the reject of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header28", propOrder = {
    "dwnldTrf",
    "frmtVrsn",
    "xchgId",
    "creDtTm",
    "initgPty",
    "rcptPty"
})
public class Header28 {

    @XmlElement(name = "DwnldTrf")
    protected boolean dwnldTrf;
    @XmlElement(name = "FrmtVrsn", required = true)
    protected String frmtVrsn;
    @XmlElement(name = "XchgId")
    protected BigDecimal xchgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InitgPty")
    protected GenericIdentification71 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification92 rcptPty;

    /**
     * Gets the value of the dwnldTrf property.
     * 
     */
    public boolean isDwnldTrf() {
        return dwnldTrf;
    }

    /**
     * Sets the value of the dwnldTrf property.
     * 
     */
    public Header28 setDwnldTrf(boolean value) {
        this.dwnldTrf = value;
        return this;
    }

    /**
     * Gets the value of the frmtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmtVrsn() {
        return frmtVrsn;
    }

    /**
     * Sets the value of the frmtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header28 setFrmtVrsn(String value) {
        this.frmtVrsn = value;
        return this;
    }

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Header28 setXchgId(BigDecimal value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Header28 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification71 }
     *     
     */
    public GenericIdentification71 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification71 }
     *     
     */
    public Header28 setInitgPty(GenericIdentification71 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification92 }
     *     
     */
    public GenericIdentification92 getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification92 }
     *     
     */
    public Header28 setRcptPty(GenericIdentification92 value) {
        this.rcptPty = value;
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
