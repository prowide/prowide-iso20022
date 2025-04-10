
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
 * Configuration parameters for physical interface.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalInterfaceParameter1", propOrder = {
    "intrfcNm",
    "intrfcTp",
    "usrNm",
    "accsCd",
    "sctyPrfl",
    "addtlParams"
})
public class PhysicalInterfaceParameter1 {

    @XmlElement(name = "IntrfcNm", required = true)
    protected String intrfcNm;
    @XmlElement(name = "IntrfcTp")
    @XmlSchemaType(name = "string")
    protected POICommunicationType2Code intrfcTp;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected byte[] accsCd;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "AddtlParams")
    protected byte[] addtlParams;

    /**
     * Gets the value of the intrfcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrfcNm() {
        return intrfcNm;
    }

    /**
     * Sets the value of the intrfcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PhysicalInterfaceParameter1 setIntrfcNm(String value) {
        this.intrfcNm = value;
        return this;
    }

    /**
     * Gets the value of the intrfcTp property.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public POICommunicationType2Code getIntrfcTp() {
        return intrfcTp;
    }

    /**
     * Sets the value of the intrfcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public PhysicalInterfaceParameter1 setIntrfcTp(POICommunicationType2Code value) {
        this.intrfcTp = value;
        return this;
    }

    /**
     * Gets the value of the usrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Sets the value of the usrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PhysicalInterfaceParameter1 setUsrNm(String value) {
        this.usrNm = value;
        return this;
    }

    /**
     * Gets the value of the accsCd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccsCd() {
        return accsCd;
    }

    /**
     * Sets the value of the accsCd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PhysicalInterfaceParameter1 setAccsCd(byte[] value) {
        this.accsCd = value;
        return this;
    }

    /**
     * Gets the value of the sctyPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Sets the value of the sctyPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PhysicalInterfaceParameter1 setSctyPrfl(String value) {
        this.sctyPrfl = value;
        return this;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PhysicalInterfaceParameter1 setAddtlParams(byte[] value) {
        this.addtlParams = value;
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
