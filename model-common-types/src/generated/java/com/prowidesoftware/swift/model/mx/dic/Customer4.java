
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
 * Information related to a consumer or a company.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer4", propOrder = {
    "tp",
    "refNb",
    "taxRegnId",
    "authrsdCtctCpny",
    "authrsdCtctNm",
    "authrsdCtctPhneNb",
    "vipInd",
    "cstmrRltsh"
})
public class Customer4 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CustomerType2Code tp;
    @XmlElement(name = "RefNb")
    protected String refNb;
    @XmlElement(name = "TaxRegnId")
    protected List<String> taxRegnId;
    @XmlElement(name = "AuthrsdCtctCpny")
    protected String authrsdCtctCpny;
    @XmlElement(name = "AuthrsdCtctNm")
    protected String authrsdCtctNm;
    @XmlElement(name = "AuthrsdCtctPhneNb")
    protected String authrsdCtctPhneNb;
    @XmlElement(name = "VIPInd")
    protected Boolean vipInd;
    @XmlElement(name = "CstmrRltsh")
    protected String cstmrRltsh;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType2Code }
     *     
     */
    public CustomerType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType2Code }
     *     
     */
    public Customer4 setTp(CustomerType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the refNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Customer4 setRefNb(String value) {
        this.refNb = value;
        return this;
    }

    /**
     * Gets the value of the taxRegnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRegnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRegnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxRegnId() {
        if (taxRegnId == null) {
            taxRegnId = new ArrayList<String>();
        }
        return this.taxRegnId;
    }

    /**
     * Gets the value of the authrsdCtctCpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrsdCtctCpny() {
        return authrsdCtctCpny;
    }

    /**
     * Sets the value of the authrsdCtctCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Customer4 setAuthrsdCtctCpny(String value) {
        this.authrsdCtctCpny = value;
        return this;
    }

    /**
     * Gets the value of the authrsdCtctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrsdCtctNm() {
        return authrsdCtctNm;
    }

    /**
     * Sets the value of the authrsdCtctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Customer4 setAuthrsdCtctNm(String value) {
        this.authrsdCtctNm = value;
        return this;
    }

    /**
     * Gets the value of the authrsdCtctPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrsdCtctPhneNb() {
        return authrsdCtctPhneNb;
    }

    /**
     * Sets the value of the authrsdCtctPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Customer4 setAuthrsdCtctPhneNb(String value) {
        this.authrsdCtctPhneNb = value;
        return this;
    }

    /**
     * Gets the value of the vipInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIPInd() {
        return vipInd;
    }

    /**
     * Sets the value of the vipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Customer4 setVIPInd(Boolean value) {
        this.vipInd = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRltsh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRltsh() {
        return cstmrRltsh;
    }

    /**
     * Sets the value of the cstmrRltsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Customer4 setCstmrRltsh(String value) {
        this.cstmrRltsh = value;
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
     * Adds a new item to the taxRegnId list.
     * @see #getTaxRegnId()
     * 
     */
    public Customer4 addTaxRegnId(String taxRegnId) {
        getTaxRegnId().add(taxRegnId);
        return this;
    }

}
