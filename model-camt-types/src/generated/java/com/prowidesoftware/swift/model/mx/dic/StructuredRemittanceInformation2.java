
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Structured information supplied to enable the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an accounts receivable system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation2", propOrder = {
    "rfrdDocTp",
    "rfrdDocRltdDt",
    "rfrdDocAmt",
    "docRefNb",
    "cdtrRef",
    "invcr",
    "invcee"
})
public class StructuredRemittanceInformation2 {

    @XmlElement(name = "RfrdDocTp")
    @XmlSchemaType(name = "string")
    protected DocumentType1Code rfrdDocTp;
    @XmlElement(name = "RfrdDocRltdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rfrdDocRltdDt;
    @XmlElement(name = "RfrdDocAmt")
    protected List<ReferredDocumentAmount1Choice> rfrdDocAmt;
    @XmlElement(name = "DocRefNb")
    protected String docRefNb;
    @XmlElement(name = "CdtrRef")
    protected String cdtrRef;
    @XmlElement(name = "Invcr")
    protected PartyIdentification1 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification1 invcee;

    /**
     * Gets the value of the rfrdDocTp property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1Code }
     *     
     */
    public DocumentType1Code getRfrdDocTp() {
        return rfrdDocTp;
    }

    /**
     * Sets the value of the rfrdDocTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1Code }
     *     
     */
    public StructuredRemittanceInformation2 setRfrdDocTp(DocumentType1Code value) {
        this.rfrdDocTp = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDocRltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public StructuredRemittanceInformation2 setRfrdDocRltdDt(XMLGregorianCalendar value) {
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
     * Gets the value of the docRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefNb() {
        return docRefNb;
    }

    /**
     * Sets the value of the docRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredRemittanceInformation2 setDocRefNb(String value) {
        this.docRefNb = value;
        return this;
    }

    /**
     * Gets the value of the cdtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrRef() {
        return cdtrRef;
    }

    /**
     * Sets the value of the cdtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredRemittanceInformation2 setCdtrRef(String value) {
        this.cdtrRef = value;
        return this;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public StructuredRemittanceInformation2 setInvcr(PartyIdentification1 value) {
        this.invcr = value;
        return this;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public StructuredRemittanceInformation2 setInvcee(PartyIdentification1 value) {
        this.invcee = value;
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
    public StructuredRemittanceInformation2 addRfrdDocAmt(ReferredDocumentAmount1Choice rfrdDocAmt) {
        getRfrdDocAmt().add(rfrdDocAmt);
        return this;
    }

}
