
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Currency control document entry supporting the contract registration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingDocumentEntry2", propOrder = {
    "ntryId",
    "orgnlDoc",
    "docTp",
    "ttlAmt",
    "ttlAmtAftrShipmnt",
    "ttlAmtInCtrctCcy",
    "ttlAmtAftrShipmntInCtrctCcy",
    "shipmntAttrbts",
    "ntryAmdmntId",
    "mtrtyData",
    "addtlInf",
    "attchmnt"
})
public class SupportingDocumentEntry2 {

    @XmlElement(name = "NtryId", required = true)
    protected String ntryId;
    @XmlElement(name = "OrgnlDoc", required = true)
    protected DocumentIdentification22 orgnlDoc;
    @XmlElement(name = "DocTp", required = true)
    protected String docTp;
    @XmlElement(name = "TtlAmt")
    protected ActiveCurrencyAndAmount ttlAmt;
    @XmlElement(name = "TtlAmtAftrShipmnt")
    protected ActiveCurrencyAndAmount ttlAmtAftrShipmnt;
    @XmlElement(name = "TtlAmtInCtrctCcy")
    protected ActiveCurrencyAndAmount ttlAmtInCtrctCcy;
    @XmlElement(name = "TtlAmtAftrShipmntInCtrctCcy")
    protected ActiveCurrencyAndAmount ttlAmtAftrShipmntInCtrctCcy;
    @XmlElement(name = "ShipmntAttrbts", required = true)
    protected ShipmentAttribute2 shipmntAttrbts;
    @XmlElement(name = "NtryAmdmntId")
    protected DocumentEntryAmendment1 ntryAmdmntId;
    @XmlElement(name = "MtrtyData")
    protected String mtrtyData;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the ntryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryId() {
        return ntryId;
    }

    /**
     * Sets the value of the ntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentEntry2 setNtryId(String value) {
        this.ntryId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getOrgnlDoc() {
        return orgnlDoc;
    }

    /**
     * Sets the value of the orgnlDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public SupportingDocumentEntry2 setOrgnlDoc(DocumentIdentification22 value) {
        this.orgnlDoc = value;
        return this;
    }

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentEntry2 setDocTp(String value) {
        this.docTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SupportingDocumentEntry2 setTtlAmt(ActiveCurrencyAndAmount value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtAftrShipmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtAftrShipmnt() {
        return ttlAmtAftrShipmnt;
    }

    /**
     * Sets the value of the ttlAmtAftrShipmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SupportingDocumentEntry2 setTtlAmtAftrShipmnt(ActiveCurrencyAndAmount value) {
        this.ttlAmtAftrShipmnt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtInCtrctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtInCtrctCcy() {
        return ttlAmtInCtrctCcy;
    }

    /**
     * Sets the value of the ttlAmtInCtrctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SupportingDocumentEntry2 setTtlAmtInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.ttlAmtInCtrctCcy = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtAftrShipmntInCtrctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtAftrShipmntInCtrctCcy() {
        return ttlAmtAftrShipmntInCtrctCcy;
    }

    /**
     * Sets the value of the ttlAmtAftrShipmntInCtrctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SupportingDocumentEntry2 setTtlAmtAftrShipmntInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.ttlAmtAftrShipmntInCtrctCcy = value;
        return this;
    }

    /**
     * Gets the value of the shipmntAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentAttribute2 }
     *     
     */
    public ShipmentAttribute2 getShipmntAttrbts() {
        return shipmntAttrbts;
    }

    /**
     * Sets the value of the shipmntAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentAttribute2 }
     *     
     */
    public SupportingDocumentEntry2 setShipmntAttrbts(ShipmentAttribute2 value) {
        this.shipmntAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the ntryAmdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentEntryAmendment1 }
     *     
     */
    public DocumentEntryAmendment1 getNtryAmdmntId() {
        return ntryAmdmntId;
    }

    /**
     * Sets the value of the ntryAmdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentEntryAmendment1 }
     *     
     */
    public SupportingDocumentEntry2 setNtryAmdmntId(DocumentEntryAmendment1 value) {
        this.ntryAmdmntId = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtrtyData() {
        return mtrtyData;
    }

    /**
     * Sets the value of the mtrtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentEntry2 setMtrtyData(String value) {
        this.mtrtyData = value;
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
    public SupportingDocumentEntry2 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<DocumentGeneralInformation5>();
        }
        return this.attchmnt;
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
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public SupportingDocumentEntry2 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

}
