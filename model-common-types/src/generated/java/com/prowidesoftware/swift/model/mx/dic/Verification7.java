
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Method and data intended to be verified as well as the related results.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verification7", propOrder = {
    "tp",
    "othrTp",
    "subTp",
    "ntty",
    "othrNtty",
    "rslt",
    "othrRslt",
    "rsltDtls",
    "addtlInf"
})
public class Verification7 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "SubTp")
    protected String subTp;
    @XmlElement(name = "Ntty")
    @XmlSchemaType(name = "string")
    protected VerificationEntity2Code ntty;
    @XmlElement(name = "OthrNtty")
    protected String othrNtty;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Verification3Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls")
    protected List<AdditionalData1> rsltDtls;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

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
    public Verification7 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Verification7 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Verification7 setSubTp(String value) {
        this.subTp = value;
        return this;
    }

    /**
     * Gets the value of the ntty property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationEntity2Code }
     *     
     */
    public VerificationEntity2Code getNtty() {
        return ntty;
    }

    /**
     * Sets the value of the ntty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationEntity2Code }
     *     
     */
    public Verification7 setNtty(VerificationEntity2Code value) {
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
    public Verification7 setOthrNtty(String value) {
        this.othrNtty = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Verification3Code }
     *     
     */
    public Verification3Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification3Code }
     *     
     */
    public Verification7 setRslt(Verification3Code value) {
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
    public Verification7 setOthrRslt(String value) {
        this.othrRslt = value;
        return this;
    }

    /**
     * Gets the value of the rsltDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsltDtls property.
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
     */
    public List<AdditionalData1> getRsltDtls() {
        if (rsltDtls == null) {
            rsltDtls = new ArrayList<AdditionalData1>();
        }
        return this.rsltDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Verification7 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the rsltDtls list.
     * @see #getRsltDtls()
     * 
     */
    public Verification7 addRsltDtls(AdditionalData1 rsltDtls) {
        getRsltDtls().add(rsltDtls);
        return this;
    }

}
