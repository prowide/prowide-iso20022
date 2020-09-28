
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Structured information supplied to enable the matching, i.e.  reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an accounts receivable system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation6", propOrder = {
    "rfrdDocInf",
    "rfrdDocRltdDt",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation6 {

    @XmlElement(name = "RfrdDocInf")
    protected ReferredDocumentInformation1 rfrdDocInf;
    @XmlElement(name = "RfrdDocRltdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rfrdDocRltdDt;
    @XmlElement(name = "RfrdDocAmt")
    protected List<ReferredDocumentAmount1Choice> rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation1 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification8 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification8 invcee;
    @XmlElement(name = "AddtlRmtInf")
    protected String addtlRmtInf;

    /**
     * Gets the value of the rfrdDocInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentInformation1 }
     *     
     */
    public ReferredDocumentInformation1 getRfrdDocInf() {
        return rfrdDocInf;
    }

    /**
     * Sets the value of the rfrdDocInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentInformation1 }
     *     
     */
    public StructuredRemittanceInformation6 setRfrdDocInf(ReferredDocumentInformation1 value) {
        this.rfrdDocInf = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDocRltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRfrdDocRltdDt() {
        return rfrdDocRltdDt;
    }

    /**
     * Sets the value of the rfrdDocRltdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public StructuredRemittanceInformation6 setRfrdDocRltdDt(XMLGregorianCalendar value) {
        this.rfrdDocRltdDt = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDocAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDocAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentAmount1Choice }
     * 
     * 
     */
    public List<ReferredDocumentAmount1Choice> getRfrdDocAmt() {
        if (rfrdDocAmt == null) {
            rfrdDocAmt = new ArrayList<ReferredDocumentAmount1Choice>();
        }
        return this.rfrdDocAmt;
    }

    /**
     * Gets the value of the cdtrRefInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation1 }
     *     
     */
    public CreditorReferenceInformation1 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Sets the value of the cdtrRefInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation1 }
     *     
     */
    public StructuredRemittanceInformation6 setCdtrRefInf(CreditorReferenceInformation1 value) {
        this.cdtrRefInf = value;
        return this;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public StructuredRemittanceInformation6 setInvcr(PartyIdentification8 value) {
        this.invcr = value;
        return this;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public StructuredRemittanceInformation6 setInvcee(PartyIdentification8 value) {
        this.invcee = value;
        return this;
    }

    /**
     * Gets the value of the addtlRmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRmtInf() {
        return addtlRmtInf;
    }

    /**
     * Sets the value of the addtlRmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredRemittanceInformation6 setAddtlRmtInf(String value) {
        this.addtlRmtInf = value;
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
     * Adds a new item to the rfrdDocAmt list.
     * @see #getRfrdDocAmt()
     * 
     */
    public StructuredRemittanceInformation6 addRfrdDocAmt(ReferredDocumentAmount1Choice rfrdDocAmt) {
        getRfrdDocAmt().add(rfrdDocAmt);
        return this;
    }

}
