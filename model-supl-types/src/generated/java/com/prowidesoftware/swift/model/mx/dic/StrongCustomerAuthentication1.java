
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
 * EU PSD2 Strong Consumer Authentication data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrongCustomerAuthentication1", propOrder = {
    "sbjtToSCA",
    "xmptn",
    "dlgtdAuthrty",
    "wvr",
    "rsnAuthntcnNotPrfrmd"
})
public class StrongCustomerAuthentication1 {

    @XmlElement(name = "SbjtToSCA")
    protected Boolean sbjtToSCA;
    @XmlElement(name = "Xmptn")
    protected List<Exemption1> xmptn;
    @XmlElement(name = "DlgtdAuthrty")
    @XmlSchemaType(name = "string")
    protected AttestationValue1Code dlgtdAuthrty;
    @XmlElement(name = "Wvr")
    @XmlSchemaType(name = "string")
    protected AttestationValue1Code wvr;
    @XmlElement(name = "RsnAuthntcnNotPrfrmd")
    protected String rsnAuthntcnNotPrfrmd;

    /**
     * Gets the value of the sbjtToSCA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbjtToSCA() {
        return sbjtToSCA;
    }

    /**
     * Sets the value of the sbjtToSCA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StrongCustomerAuthentication1 setSbjtToSCA(Boolean value) {
        this.sbjtToSCA = value;
        return this;
    }

    /**
     * Gets the value of the xmptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xmptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exemption1 }
     * 
     * 
     * @return
     *     The value of the xmptn property.
     */
    public List<Exemption1> getXmptn() {
        if (xmptn == null) {
            xmptn = new ArrayList<>();
        }
        return this.xmptn;
    }

    /**
     * Gets the value of the dlgtdAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link AttestationValue1Code }
     *     
     */
    public AttestationValue1Code getDlgtdAuthrty() {
        return dlgtdAuthrty;
    }

    /**
     * Sets the value of the dlgtdAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttestationValue1Code }
     *     
     */
    public StrongCustomerAuthentication1 setDlgtdAuthrty(AttestationValue1Code value) {
        this.dlgtdAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the wvr property.
     * 
     * @return
     *     possible object is
     *     {@link AttestationValue1Code }
     *     
     */
    public AttestationValue1Code getWvr() {
        return wvr;
    }

    /**
     * Sets the value of the wvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttestationValue1Code }
     *     
     */
    public StrongCustomerAuthentication1 setWvr(AttestationValue1Code value) {
        this.wvr = value;
        return this;
    }

    /**
     * Gets the value of the rsnAuthntcnNotPrfrmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsnAuthntcnNotPrfrmd() {
        return rsnAuthntcnNotPrfrmd;
    }

    /**
     * Sets the value of the rsnAuthntcnNotPrfrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StrongCustomerAuthentication1 setRsnAuthntcnNotPrfrmd(String value) {
        this.rsnAuthntcnNotPrfrmd = value;
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
     * Adds a new item to the xmptn list.
     * @see #getXmptn()
     * 
     */
    public StrongCustomerAuthentication1 addXmptn(Exemption1 xmptn) {
        getXmptn().add(xmptn);
        return this;
    }

}
