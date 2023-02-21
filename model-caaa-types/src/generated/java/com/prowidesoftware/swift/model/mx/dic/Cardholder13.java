
package com.prowidesoftware.swift.model.mx.dic;

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
 * Data related to the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder13", propOrder = {
    "id",
    "nm",
    "lang",
    "bllgAdr",
    "shppgAdr",
    "tripNb",
    "vhcl",
    "authntcn",
    "txVrfctnRslt",
    "prsnlData"
})
public class Cardholder13 {

    @XmlElement(name = "Id")
    protected PersonIdentification15 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress22 bllgAdr;
    @XmlElement(name = "ShppgAdr")
    protected PostalAddress22 shppgAdr;
    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "Vhcl")
    protected Vehicle1 vhcl;
    @XmlElement(name = "Authntcn")
    protected List<CardholderAuthentication11> authntcn;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "PrsnlData")
    protected String prsnlData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification15 }
     *     
     */
    public PersonIdentification15 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification15 }
     *     
     */
    public Cardholder13 setId(PersonIdentification15 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder13 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder13 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public Cardholder13 setBllgAdr(PostalAddress22 value) {
        this.bllgAdr = value;
        return this;
    }

    /**
     * Gets the value of the shppgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getShppgAdr() {
        return shppgAdr;
    }

    /**
     * Sets the value of the shppgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public Cardholder13 setShppgAdr(PostalAddress22 value) {
        this.shppgAdr = value;
        return this;
    }

    /**
     * Gets the value of the tripNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Sets the value of the tripNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder13 setTripNb(String value) {
        this.tripNb = value;
        return this;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle1 }
     *     
     */
    public Vehicle1 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle1 }
     *     
     */
    public Cardholder13 setVhcl(Vehicle1 value) {
        this.vhcl = value;
        return this;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderAuthentication11 }
     * 
     * 
     */
    public List<CardholderAuthentication11> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<CardholderAuthentication11>();
        }
        return this.authntcn;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult4 }
     * 
     * 
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<TransactionVerificationResult4>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the prsnlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlData() {
        return prsnlData;
    }

    /**
     * Sets the value of the prsnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder13 setPrsnlData(String value) {
        this.prsnlData = value;
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
     * Adds a new item to the authntcn list.
     * @see #getAuthntcn()
     * 
     */
    public Cardholder13 addAuthntcn(CardholderAuthentication11 authntcn) {
        getAuthntcn().add(authntcn);
        return this;
    }

    /**
     * Adds a new item to the txVrfctnRslt list.
     * @see #getTxVrfctnRslt()
     * 
     */
    public Cardholder13 addTxVrfctnRslt(TransactionVerificationResult4 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

}
