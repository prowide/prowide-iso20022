
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Message authentication code (MAC), computed on the data to protect with an encryption key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticatedData8", propOrder = {
    "vrsn",
    "rcpt",
    "macAlgo",
    "ncpsltdCntt",
    "mac"
})
public class AuthenticatedData8 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "Rcpt", required = true)
    protected List<Recipient11Choice> rcpt;
    @XmlElement(name = "MACAlgo", required = true)
    protected AlgorithmIdentification22 macAlgo;
    @XmlElement(name = "NcpsltdCntt", required = true)
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "MAC", required = true)
    protected byte[] mac;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AuthenticatedData8 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipient11Choice }
     * 
     * 
     */
    public List<Recipient11Choice> getRcpt() {
        if (rcpt == null) {
            rcpt = new ArrayList<Recipient11Choice>();
        }
        return this.rcpt;
    }

    /**
     * Gets the value of the macAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification22 }
     *     
     */
    public AlgorithmIdentification22 getMACAlgo() {
        return macAlgo;
    }

    /**
     * Sets the value of the macAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification22 }
     *     
     */
    public AuthenticatedData8 setMACAlgo(AlgorithmIdentification22 value) {
        this.macAlgo = value;
        return this;
    }

    /**
     * Gets the value of the ncpsltdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Sets the value of the ncpsltdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public AuthenticatedData8 setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
        return this;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public AuthenticatedData8 setMAC(byte[] value) {
        this.mac = value;
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

    /**
     * Adds a new item to the rcpt list.
     * @see #getRcpt()
     * 
     */
    public AuthenticatedData8 addRcpt(Recipient11Choice rcpt) {
        getRcpt().add(rcpt);
        return this;
    }

}
