
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
 * Set of characteristics that unambiguously identify the single invoice financing request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRequestInformation1", propOrder = {
    "invcGnlInf",
    "invcTtlsInf",
    "cdtDbtNoteAmt",
    "instlmtInf",
    "reqdAmt",
    "spplr",
    "buyr",
    "invcPmtInf",
    "rfrdDoc"
})
public class InvoiceRequestInformation1 {

    @XmlElement(name = "InvcGnlInf", required = true)
    protected DocumentGeneralInformation1 invcGnlInf;
    @XmlElement(name = "InvcTtlsInf", required = true)
    protected InvoiceTotals1 invcTtlsInf;
    @XmlElement(name = "CdtDbtNoteAmt")
    protected ActiveCurrencyAndAmount cdtDbtNoteAmt;
    @XmlElement(name = "InstlmtInf")
    protected List<Instalment1> instlmtInf;
    @XmlElement(name = "ReqdAmt")
    protected FinancingRateOrAmountChoice reqdAmt;
    @XmlElement(name = "Spplr", required = true)
    protected PartyAndAccountIdentificationAndContactInformation1 spplr;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentificationAndContactInformation1 buyr;
    @XmlElement(name = "InvcPmtInf", required = true)
    protected PaymentInformation15 invcPmtInf;
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredDocumentInformation2> rfrdDoc;

    /**
     * Gets the value of the invcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentGeneralInformation1 }
     *     
     */
    public DocumentGeneralInformation1 getInvcGnlInf() {
        return invcGnlInf;
    }

    /**
     * Sets the value of the invcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentGeneralInformation1 }
     *     
     */
    public InvoiceRequestInformation1 setInvcGnlInf(DocumentGeneralInformation1 value) {
        this.invcGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the invcTtlsInf property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public InvoiceTotals1 getInvcTtlsInf() {
        return invcTtlsInf;
    }

    /**
     * Sets the value of the invcTtlsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public InvoiceRequestInformation1 setInvcTtlsInf(InvoiceTotals1 value) {
        this.invcTtlsInf = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtNoteAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdtDbtNoteAmt() {
        return cdtDbtNoteAmt;
    }

    /**
     * Sets the value of the cdtDbtNoteAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvoiceRequestInformation1 setCdtDbtNoteAmt(ActiveCurrencyAndAmount value) {
        this.cdtDbtNoteAmt = value;
        return this;
    }

    /**
     * Gets the value of the instlmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instlmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment1 }
     * 
     * 
     */
    public List<Instalment1> getInstlmtInf() {
        if (instlmtInf == null) {
            instlmtInf = new ArrayList<Instalment1>();
        }
        return this.instlmtInf;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public InvoiceRequestInformation1 setReqdAmt(FinancingRateOrAmountChoice value) {
        this.reqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndAccountIdentificationAndContactInformation1 }
     *     
     */
    public PartyAndAccountIdentificationAndContactInformation1 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndAccountIdentificationAndContactInformation1 }
     *     
     */
    public InvoiceRequestInformation1 setSpplr(PartyAndAccountIdentificationAndContactInformation1 value) {
        this.spplr = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndContactInformation1 }
     *     
     */
    public PartyIdentificationAndContactInformation1 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndContactInformation1 }
     *     
     */
    public InvoiceRequestInformation1 setBuyr(PartyIdentificationAndContactInformation1 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the invcPmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformation15 }
     *     
     */
    public PaymentInformation15 getInvcPmtInf() {
        return invcPmtInf;
    }

    /**
     * Sets the value of the invcPmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformation15 }
     *     
     */
    public InvoiceRequestInformation1 setInvcPmtInf(PaymentInformation15 value) {
        this.invcPmtInf = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation2 }
     * 
     * 
     */
    public List<ReferredDocumentInformation2> getRfrdDoc() {
        if (rfrdDoc == null) {
            rfrdDoc = new ArrayList<ReferredDocumentInformation2>();
        }
        return this.rfrdDoc;
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
     * Adds a new item to the instlmtInf list.
     * @see #getInstlmtInf()
     * 
     */
    public InvoiceRequestInformation1 addInstlmtInf(Instalment1 instlmtInf) {
        getInstlmtInf().add(instlmtInf);
        return this;
    }

    /**
     * Adds a new item to the rfrdDoc list.
     * @see #getRfrdDoc()
     * 
     */
    public InvoiceRequestInformation1 addRfrdDoc(ReferredDocumentInformation2 rfrdDoc) {
        getRfrdDoc().add(rfrdDoc);
        return this;
    }

}
