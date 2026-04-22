
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "InvoiceLegalIssue5", propOrder = {
    "invcr",
    "invcee",
    "invcLglStmt",
    "pmtMtd"
})
public class InvoiceLegalIssue5 {

    @XmlElement(name = "Invcr", required = true)
    protected PartyIdentification272 invcr;
    @XmlElement(name = "Invcee", required = true)
    protected PartyIdentification272 invcee;
    @XmlElement(name = "InvcLglStmt")
    protected String invcLglStmt;
    @XmlElement(name = "PmtMtd")
    protected PaymentMethod3Choice pmtMtd;

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
    public InvoiceLegalIssue5 setInvcr(PartyIdentification272 value) {
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
    public InvoiceLegalIssue5 setInvcee(PartyIdentification272 value) {
        this.invcee = value;
        return this;
    }

    /**
     * Gets the value of the invcLglStmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcLglStmt() {
        return invcLglStmt;
    }

    /**
     * Sets the value of the invcLglStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLegalIssue5 setInvcLglStmt(String value) {
        this.invcLglStmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod3Choice }
     *     
     */
    public PaymentMethod3Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod3Choice }
     *     
     */
    public InvoiceLegalIssue5 setPmtMtd(PaymentMethod3Choice value) {
        this.pmtMtd = value;
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

}
