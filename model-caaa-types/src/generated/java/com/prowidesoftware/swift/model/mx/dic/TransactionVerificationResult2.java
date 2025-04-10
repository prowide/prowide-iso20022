
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
 * Result of the verifications performed by the issuer to deliver or decline the authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionVerificationResult2", propOrder = {
    "elctrncComrcAuthntcnRslt",
    "cscRslt",
    "crdhldrAdrVrfctnRslt",
    "dclndPdctCd"
})
public class TransactionVerificationResult2 {

    @XmlElement(name = "ElctrncComrcAuthntcnRslt")
    protected String elctrncComrcAuthntcnRslt;
    @XmlElement(name = "CSCRslt")
    @XmlSchemaType(name = "string")
    protected CSCResult1Code cscRslt;
    @XmlElement(name = "CrdhldrAdrVrfctnRslt")
    @XmlSchemaType(name = "string")
    protected List<CardholderAddressVerificationResult1Code> crdhldrAdrVrfctnRslt;
    @XmlElement(name = "DclndPdctCd")
    protected List<String> dclndPdctCd;

    /**
     * Gets the value of the elctrncComrcAuthntcnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncComrcAuthntcnRslt() {
        return elctrncComrcAuthntcnRslt;
    }

    /**
     * Sets the value of the elctrncComrcAuthntcnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionVerificationResult2 setElctrncComrcAuthntcnRslt(String value) {
        this.elctrncComrcAuthntcnRslt = value;
        return this;
    }

    /**
     * Gets the value of the cscRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CSCResult1Code }
     *     
     */
    public CSCResult1Code getCSCRslt() {
        return cscRslt;
    }

    /**
     * Sets the value of the cscRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSCResult1Code }
     *     
     */
    public TransactionVerificationResult2 setCSCRslt(CSCResult1Code value) {
        this.cscRslt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrAdrVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdhldrAdrVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrAdrVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderAddressVerificationResult1Code }
     * 
     * 
     * @return
     *     The value of the crdhldrAdrVrfctnRslt property.
     */
    public List<CardholderAddressVerificationResult1Code> getCrdhldrAdrVrfctnRslt() {
        if (crdhldrAdrVrfctnRslt == null) {
            crdhldrAdrVrfctnRslt = new ArrayList<>();
        }
        return this.crdhldrAdrVrfctnRslt;
    }

    /**
     * Gets the value of the dclndPdctCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dclndPdctCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDclndPdctCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dclndPdctCd property.
     */
    public List<String> getDclndPdctCd() {
        if (dclndPdctCd == null) {
            dclndPdctCd = new ArrayList<>();
        }
        return this.dclndPdctCd;
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
     * Adds a new item to the crdhldrAdrVrfctnRslt list.
     * @see #getCrdhldrAdrVrfctnRslt()
     * 
     */
    public TransactionVerificationResult2 addCrdhldrAdrVrfctnRslt(CardholderAddressVerificationResult1Code crdhldrAdrVrfctnRslt) {
        getCrdhldrAdrVrfctnRslt().add(crdhldrAdrVrfctnRslt);
        return this;
    }

    /**
     * Adds a new item to the dclndPdctCd list.
     * @see #getDclndPdctCd()
     * 
     */
    public TransactionVerificationResult2 addDclndPdctCd(String dclndPdctCd) {
        getDclndPdctCd().add(dclndPdctCd);
        return this;
    }

}
