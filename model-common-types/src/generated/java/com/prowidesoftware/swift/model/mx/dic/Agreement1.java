
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
 * Contractual details related to the agreement between parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreement1", propOrder = {
    "desc",
    "id",
    "dt",
    "ccy",
    "termntnTp",
    "startDt",
    "dlvryTp",
    "mrgnRatio"
})
public class Agreement1 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TermntnTp")
    @XmlSchemaType(name = "string")
    protected TerminationType1Code termntnTp;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected DeliveryType1Code dlvryTp;
    @XmlElement(name = "MrgnRatio")
    protected BigDecimal mrgnRatio;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Agreement1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the termntnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationType1Code }
     *     
     */
    public TerminationType1Code getTermntnTp() {
        return termntnTp;
    }

    /**
     * Sets the value of the termntnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationType1Code }
     *     
     */
    public Agreement1 setTermntnTp(TerminationType1Code value) {
        this.termntnTp = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Agreement1 setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType1Code }
     *     
     */
    public DeliveryType1Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType1Code }
     *     
     */
    public Agreement1 setDlvryTp(DeliveryType1Code value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRatio() {
        return mrgnRatio;
    }

    /**
     * Sets the value of the mrgnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Agreement1 setMrgnRatio(BigDecimal value) {
        this.mrgnRatio = value;
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
