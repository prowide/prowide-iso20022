
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
 * Fulfilment instructions for the retrieval
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalFulfilmentInstructions3", propOrder = {
    "reqdMtd",
    "estblishdMtd",
    "actlDlvryMtd",
    "ctct",
    "pstlAdr",
    "rcpt",
    "trgt",
    "frmt",
    "tp",
    "val"
})
public class RetrievalFulfilmentInstructions3 {

    @XmlElement(name = "ReqdMtd")
    protected List<String> reqdMtd;
    @XmlElement(name = "EstblishdMtd")
    protected List<String> estblishdMtd;
    @XmlElement(name = "ActlDlvryMtd")
    protected String actlDlvryMtd;
    @XmlElement(name = "Ctct")
    protected ContactBusiness1 ctct;
    @XmlElement(name = "PstlAdr")
    protected Address2 pstlAdr;
    @XmlElement(name = "Rcpt")
    @XmlSchemaType(name = "string")
    protected PartyType19Code rcpt;
    @XmlElement(name = "Trgt")
    @XmlSchemaType(name = "string")
    protected List<UserInterface8Code> trgt;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the reqdMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the reqdMtd property.
     */
    public List<String> getReqdMtd() {
        if (reqdMtd == null) {
            reqdMtd = new ArrayList<>();
        }
        return this.reqdMtd;
    }

    /**
     * Gets the value of the estblishdMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estblishdMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstblishdMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the estblishdMtd property.
     */
    public List<String> getEstblishdMtd() {
        if (estblishdMtd == null) {
            estblishdMtd = new ArrayList<>();
        }
        return this.estblishdMtd;
    }

    /**
     * Gets the value of the actlDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActlDlvryMtd() {
        return actlDlvryMtd;
    }

    /**
     * Sets the value of the actlDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievalFulfilmentInstructions3 setActlDlvryMtd(String value) {
        this.actlDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public RetrievalFulfilmentInstructions3 setCtct(ContactBusiness1 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public RetrievalFulfilmentInstructions3 setPstlAdr(Address2 value) {
        this.pstlAdr = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType19Code }
     *     
     */
    public PartyType19Code getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType19Code }
     *     
     */
    public RetrievalFulfilmentInstructions3 setRcpt(PartyType19Code value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterface8Code }
     * 
     * 
     * @return
     *     The value of the trgt property.
     */
    public List<UserInterface8Code> getTrgt() {
        if (trgt == null) {
            trgt = new ArrayList<>();
        }
        return this.trgt;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat4Code }
     *     
     */
    public OutputFormat4Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat4Code }
     *     
     */
    public RetrievalFulfilmentInstructions3 setFrmt(OutputFormat4Code value) {
        this.frmt = value;
        return this;
    }

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
    public RetrievalFulfilmentInstructions3 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievalFulfilmentInstructions3 setVal(String value) {
        this.val = value;
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
     * Adds a new item to the reqdMtd list.
     * @see #getReqdMtd()
     * 
     */
    public RetrievalFulfilmentInstructions3 addReqdMtd(String reqdMtd) {
        getReqdMtd().add(reqdMtd);
        return this;
    }

    /**
     * Adds a new item to the estblishdMtd list.
     * @see #getEstblishdMtd()
     * 
     */
    public RetrievalFulfilmentInstructions3 addEstblishdMtd(String estblishdMtd) {
        getEstblishdMtd().add(estblishdMtd);
        return this;
    }

    /**
     * Adds a new item to the trgt list.
     * @see #getTrgt()
     * 
     */
    public RetrievalFulfilmentInstructions3 addTrgt(UserInterface8Code trgt) {
        getTrgt().add(trgt);
        return this;
    }

}
