
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Result of verifications performed prior or after the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationResult1", propOrder = {
    "tp",
    "ntty",
    "othrNtty",
    "rslt",
    "othrRslt",
    "rsltDtls"
})
public class VerificationResult1 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Ntty")
    @XmlSchemaType(name = "string")
    protected VerificationEntity1Code ntty;
    @XmlElement(name = "OthrNtty")
    protected String othrNtty;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Verification2Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls")
    protected List<AdditionalData1> rsltDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationResult1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ntty property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationEntity1Code }
     *     
     */
    public VerificationEntity1Code getNtty() {
        return ntty;
    }

    /**
     * Sets the value of the ntty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationEntity1Code }
     *     
     */
    public VerificationResult1 setNtty(VerificationEntity1Code value) {
        this.ntty = value;
        return this;
    }

    /**
     * Gets the value of the othrNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtty() {
        return othrNtty;
    }

    /**
     * Sets the value of the othrNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationResult1 setOthrNtty(String value) {
        this.othrNtty = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Verification2Code }
     *     
     */
    public Verification2Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification2Code }
     *     
     */
    public VerificationResult1 setRslt(Verification2Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the othrRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Sets the value of the othrRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationResult1 setOthrRslt(String value) {
        this.othrRslt = value;
        return this;
    }

    /**
     * Gets the value of the rsltDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsltDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsltDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the rsltDtls property.
     */
    public List<AdditionalData1> getRsltDtls() {
        if (rsltDtls == null) {
            rsltDtls = new ArrayList<>();
        }
        return this.rsltDtls;
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
     * Adds a new item to the rsltDtls list.
     * @see #getRsltDtls()
     * 
     */
    public VerificationResult1 addRsltDtls(AdditionalData1 rsltDtls) {
        getRsltDtls().add(rsltDtls);
        return this;
    }

}
