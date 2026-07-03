
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
 * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation18", propOrder = {
    "rfrdDocInf",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation18 {

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation8> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount4 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation3 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification272 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification272 invcee;
    @XmlElement(name = "TaxRmt")
    protected TaxData1 taxRmt;
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment4 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf")
    protected List<String> addtlRmtInf;

    /**
     * Gets the value of the rfrdDocInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDocInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation8 }
     * 
     * 
     */
    public List<ReferredDocumentInformation8> getRfrdDocInf() {
        if (rfrdDocInf == null) {
            rfrdDocInf = new ArrayList<ReferredDocumentInformation8>();
        }
        return this.rfrdDocInf;
    }

    /**
     * Gets the value of the rfrdDocAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount4 }
     *     
     */
    public RemittanceAmount4 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Sets the value of the rfrdDocAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount4 }
     *     
     */
    public StructuredRemittanceInformation18 setRfrdDocAmt(RemittanceAmount4 value) {
        this.rfrdDocAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrRefInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation3 }
     *     
     */
    public CreditorReferenceInformation3 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Sets the value of the cdtrRefInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation3 }
     *     
     */
    public StructuredRemittanceInformation18 setCdtrRefInf(CreditorReferenceInformation3 value) {
        this.cdtrRefInf = value;
        return this;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public StructuredRemittanceInformation18 setInvcr(PartyIdentification272 value) {
        this.invcr = value;
        return this;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public StructuredRemittanceInformation18 setInvcee(PartyIdentification272 value) {
        this.invcee = value;
        return this;
    }

    /**
     * Gets the value of the taxRmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTaxRmt() {
        return taxRmt;
    }

    /**
     * Sets the value of the taxRmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public StructuredRemittanceInformation18 setTaxRmt(TaxData1 value) {
        this.taxRmt = value;
        return this;
    }

    /**
     * Gets the value of the grnshmtRmt property.
     * 
     * @return
     *     possible object is
     *     {@link Garnishment4 }
     *     
     */
    public Garnishment4 getGrnshmtRmt() {
        return grnshmtRmt;
    }

    /**
     * Sets the value of the grnshmtRmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Garnishment4 }
     *     
     */
    public StructuredRemittanceInformation18 setGrnshmtRmt(Garnishment4 value) {
        this.grnshmtRmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRmtInf() {
        if (addtlRmtInf == null) {
            addtlRmtInf = new ArrayList<String>();
        }
        return this.addtlRmtInf;
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
     * Adds a new item to the rfrdDocInf list.
     * @see #getRfrdDocInf()
     * 
     */
    public StructuredRemittanceInformation18 addRfrdDocInf(ReferredDocumentInformation8 rfrdDocInf) {
        getRfrdDocInf().add(rfrdDocInf);
        return this;
    }

    /**
     * Adds a new item to the addtlRmtInf list.
     * @see #getAddtlRmtInf()
     * 
     */
    public StructuredRemittanceInformation18 addAddtlRmtInf(String addtlRmtInf) {
        getAddtlRmtInf().add(addtlRmtInf);
        return this;
    }

}
