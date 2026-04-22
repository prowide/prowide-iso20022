
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
 * Information related the acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorData2", propOrder = {
    "id",
    "schmeAssgndId",
    "bizNm",
    "lglCorpNm",
    "submittdAdr",
    "apldAdr",
    "bizRegnId",
    "bizRegnIdTp",
    "lclData",
    "addtlTxRefNb",
    "prtnrId",
    "prvtData",
    "ntlData"
})
public class AcceptorData2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SchmeAssgndId")
    protected String schmeAssgndId;
    @XmlElement(name = "BizNm")
    protected String bizNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "SubmittdAdr")
    protected Address4 submittdAdr;
    @XmlElement(name = "ApldAdr")
    protected Address4 apldAdr;
    @XmlElement(name = "BizRegnId")
    protected String bizRegnId;
    @XmlElement(name = "BizRegnIdTp")
    protected String bizRegnIdTp;
    @XmlElement(name = "LclData")
    protected List<LocalData18> lclData;
    @XmlElement(name = "AddtlTxRefNb")
    protected String addtlTxRefNb;
    @XmlElement(name = "PrtnrId")
    protected String prtnrId;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the schmeAssgndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeAssgndId() {
        return schmeAssgndId;
    }

    /**
     * Sets the value of the schmeAssgndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setSchmeAssgndId(String value) {
        this.schmeAssgndId = value;
        return this;
    }

    /**
     * Gets the value of the bizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizNm() {
        return bizNm;
    }

    /**
     * Sets the value of the bizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setBizNm(String value) {
        this.bizNm = value;
        return this;
    }

    /**
     * Gets the value of the lglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglCorpNm() {
        return lglCorpNm;
    }

    /**
     * Sets the value of the lglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setLglCorpNm(String value) {
        this.lglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the submittdAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getSubmittdAdr() {
        return submittdAdr;
    }

    /**
     * Sets the value of the submittdAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public AcceptorData2 setSubmittdAdr(Address4 value) {
        this.submittdAdr = value;
        return this;
    }

    /**
     * Gets the value of the apldAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getApldAdr() {
        return apldAdr;
    }

    /**
     * Sets the value of the apldAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public AcceptorData2 setApldAdr(Address4 value) {
        this.apldAdr = value;
        return this;
    }

    /**
     * Gets the value of the bizRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRegnId() {
        return bizRegnId;
    }

    /**
     * Sets the value of the bizRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setBizRegnId(String value) {
        this.bizRegnId = value;
        return this;
    }

    /**
     * Gets the value of the bizRegnIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRegnIdTp() {
        return bizRegnIdTp;
    }

    /**
     * Sets the value of the bizRegnIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setBizRegnIdTp(String value) {
        this.bizRegnIdTp = value;
        return this;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData18 }
     * 
     * 
     * @return
     *     The value of the lclData property.
     */
    public List<LocalData18> getLclData() {
        if (lclData == null) {
            lclData = new ArrayList<>();
        }
        return this.lclData;
    }

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
    public AcceptorData2 setAddtlTxRefNb(String value) {
        this.addtlTxRefNb = value;
        return this;
    }

    /**
     * Gets the value of the prtnrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtnrId() {
        return prtnrId;
    }

    /**
     * Sets the value of the prtnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorData2 setPrtnrId(String value) {
        this.prtnrId = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the lclData list.
     * @see #getLclData()
     * 
     */
    public AcceptorData2 addLclData(LocalData18 lclData) {
        getLclData().add(lclData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public AcceptorData2 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public AcceptorData2 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
