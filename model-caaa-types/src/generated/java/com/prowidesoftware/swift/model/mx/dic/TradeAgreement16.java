
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
 * Contractual details related to the agreement between parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAgreement16", propOrder = {
    "buyr",
    "sellr",
    "qtnDocId",
    "ctrctDocId",
    "buyrOrdrIdDoc",
    "addtlRefDoc",
    "incotrms"
})
public class TradeAgreement16 {

    @XmlElement(name = "Buyr", required = true)
    protected TradeParty4 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected TradeParty4 sellr;
    @XmlElement(name = "QtnDocId")
    protected DocumentIdentification22 qtnDocId;
    @XmlElement(name = "CtrctDocId")
    protected DocumentIdentification22 ctrctDocId;
    @XmlElement(name = "BuyrOrdrIdDoc")
    protected DocumentIdentification22 buyrOrdrIdDoc;
    @XmlElement(name = "AddtlRefDoc")
    protected List<DocumentGeneralInformation2> addtlRefDoc;
    @XmlElement(name = "Incotrms")
    protected Incoterms3 incotrms;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeAgreement16 setBuyr(TradeParty4 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeAgreement16 setSellr(TradeParty4 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the qtnDocId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getQtnDocId() {
        return qtnDocId;
    }

    /**
     * Sets the value of the qtnDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeAgreement16 setQtnDocId(DocumentIdentification22 value) {
        this.qtnDocId = value;
        return this;
    }

    /**
     * Gets the value of the ctrctDocId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getCtrctDocId() {
        return ctrctDocId;
    }

    /**
     * Sets the value of the ctrctDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeAgreement16 setCtrctDocId(DocumentIdentification22 value) {
        this.ctrctDocId = value;
        return this;
    }

    /**
     * Gets the value of the buyrOrdrIdDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getBuyrOrdrIdDoc() {
        return buyrOrdrIdDoc;
    }

    /**
     * Sets the value of the buyrOrdrIdDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeAgreement16 setBuyrOrdrIdDoc(DocumentIdentification22 value) {
        this.buyrOrdrIdDoc = value;
        return this;
    }

    /**
     * Gets the value of the addtlRefDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRefDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRefDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation2 }
     * 
     * 
     */
    public List<DocumentGeneralInformation2> getAddtlRefDoc() {
        if (addtlRefDoc == null) {
            addtlRefDoc = new ArrayList<DocumentGeneralInformation2>();
        }
        return this.addtlRefDoc;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms3 }
     *     
     */
    public Incoterms3 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms3 }
     *     
     */
    public TradeAgreement16 setIncotrms(Incoterms3 value) {
        this.incotrms = value;
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
     * Adds a new item to the addtlRefDoc list.
     * @see #getAddtlRefDoc()
     * 
     */
    public TradeAgreement16 addAddtlRefDoc(DocumentGeneralInformation2 addtlRefDoc) {
        getAddtlRefDoc().add(addtlRefDoc);
        return this;
    }

}
