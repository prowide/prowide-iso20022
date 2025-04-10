
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Configuration parameters to communicate with a host.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters1", propOrder = {
    "pmryAdr",
    "pmryPortNb",
    "scndryAdr",
    "scndryPortNb",
    "usrNm",
    "accsCd",
    "clntCert"
})
public class NetworkParameters1 {

    @XmlElement(name = "PmryAdr", required = true)
    protected String pmryAdr;
    @XmlElement(name = "PmryPortNb", required = true)
    protected BigDecimal pmryPortNb;
    @XmlElement(name = "ScndryAdr")
    protected String scndryAdr;
    @XmlElement(name = "ScndryPortNb")
    protected BigDecimal scndryPortNb;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected String accsCd;
    @XmlElement(name = "ClntCert")
    protected byte[] clntCert;

    /**
     * Gets the value of the pmryAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmryAdr() {
        return pmryAdr;
    }

    /**
     * Sets the value of the pmryAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetworkParameters1 setPmryAdr(String value) {
        this.pmryAdr = value;
        return this;
    }

    /**
     * Gets the value of the pmryPortNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmryPortNb() {
        return pmryPortNb;
    }

    /**
     * Sets the value of the pmryPortNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NetworkParameters1 setPmryPortNb(BigDecimal value) {
        this.pmryPortNb = value;
        return this;
    }

    /**
     * Gets the value of the scndryAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryAdr() {
        return scndryAdr;
    }

    /**
     * Sets the value of the scndryAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetworkParameters1 setScndryAdr(String value) {
        this.scndryAdr = value;
        return this;
    }

    /**
     * Gets the value of the scndryPortNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScndryPortNb() {
        return scndryPortNb;
    }

    /**
     * Sets the value of the scndryPortNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NetworkParameters1 setScndryPortNb(BigDecimal value) {
        this.scndryPortNb = value;
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
    public NetworkParameters1 setUsrNm(String value) {
        this.usrNm = value;
        return this;
    }

    /**
     * Gets the value of the accsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccsCd() {
        return accsCd;
    }

    /**
     * Sets the value of the accsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetworkParameters1 setAccsCd(String value) {
        this.accsCd = value;
        return this;
    }

    /**
     * Gets the value of the clntCert property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClntCert() {
        return clntCert;
    }

    /**
     * Sets the value of the clntCert property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public NetworkParameters1 setClntCert(byte[] value) {
        this.clntCert = value;
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
