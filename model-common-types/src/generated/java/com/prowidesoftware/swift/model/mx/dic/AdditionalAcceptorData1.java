
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
 * Contains additional acceptor data
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAcceptorData1", propOrder = {
    "addtlTxRefNb",
    "taxRegnId",
    "corpTaxId",
    "corpTaxIdTp",
    "addtlId",
    "chrtcs",
    "addtlInf"
})
public class AdditionalAcceptorData1 {

    @XmlElement(name = "AddtlTxRefNb")
    protected String addtlTxRefNb;
    @XmlElement(name = "TaxRegnId")
    protected String taxRegnId;
    @XmlElement(name = "CorpTaxId")
    protected String corpTaxId;
    @XmlElement(name = "CorpTaxIdTp")
    @XmlSchemaType(name = "string")
    protected CorporateTaxType1Code corpTaxIdTp;
    @XmlElement(name = "AddtlId")
    protected List<AdditionalIdentification1> addtlId;
    @XmlElement(name = "Chrtcs")
    protected AdditionalCharacteristics1 chrtcs;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the addtlTxRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxRefNb() {
        return addtlTxRefNb;
    }

    /**
     * Sets the value of the addtlTxRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAcceptorData1 setAddtlTxRefNb(String value) {
        this.addtlTxRefNb = value;
        return this;
    }

    /**
     * Gets the value of the taxRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegnId() {
        return taxRegnId;
    }

    /**
     * Sets the value of the taxRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAcceptorData1 setTaxRegnId(String value) {
        this.taxRegnId = value;
        return this;
    }

    /**
     * Gets the value of the corpTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpTaxId() {
        return corpTaxId;
    }

    /**
     * Sets the value of the corpTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAcceptorData1 setCorpTaxId(String value) {
        this.corpTaxId = value;
        return this;
    }

    /**
     * Gets the value of the corpTaxIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateTaxType1Code }
     *     
     */
    public CorporateTaxType1Code getCorpTaxIdTp() {
        return corpTaxIdTp;
    }

    /**
     * Sets the value of the corpTaxIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateTaxType1Code }
     *     
     */
    public AdditionalAcceptorData1 setCorpTaxIdTp(CorporateTaxType1Code value) {
        this.corpTaxIdTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalIdentification1 }
     * 
     * 
     */
    public List<AdditionalIdentification1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<AdditionalIdentification1>();
        }
        return this.addtlId;
    }

    /**
     * Gets the value of the chrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristics1 }
     *     
     */
    public AdditionalCharacteristics1 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristics1 }
     *     
     */
    public AdditionalAcceptorData1 setChrtcs(AdditionalCharacteristics1 value) {
        this.chrtcs = value;
        return this;
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
    public AdditionalAcceptorData1 setAddtlInf(String value) {
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
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public AdditionalAcceptorData1 addAddtlId(AdditionalIdentification1 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

}
