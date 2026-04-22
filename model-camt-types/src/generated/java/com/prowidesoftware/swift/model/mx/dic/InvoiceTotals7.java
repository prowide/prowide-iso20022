
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies totals related to the invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTotals7", propOrder = {
    "tax",
    "adjstmnt",
    "ttlInvcAmt",
    "pmtDueDt",
    "cshAcct"
})
public class InvoiceTotals7 {

    @XmlElement(name = "Tax")
    protected List<BillingTaxRecord2> tax;
    @XmlElement(name = "Adjstmnt")
    protected Adjustment5 adjstmnt;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected AmountAndForeignExchange1 ttlInvcAmt;
    @XmlElement(name = "PmtDueDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate pmtDueDt;
    @XmlElement(name = "CshAcct")
    protected AccountIdentification4Choice cshAcct;

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingTaxRecord2 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<BillingTaxRecord2> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment5 }
     *     
     */
    public Adjustment5 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Sets the value of the adjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment5 }
     *     
     */
    public InvoiceTotals7 setAdjstmnt(Adjustment5 value) {
        this.adjstmnt = value;
        return this;
    }

    /**
     * Gets the value of the ttlInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndForeignExchange1 }
     *     
     */
    public AmountAndForeignExchange1 getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Sets the value of the ttlInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndForeignExchange1 }
     *     
     */
    public InvoiceTotals7 setTtlInvcAmt(AmountAndForeignExchange1 value) {
        this.ttlInvcAmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceTotals7 setPmtDueDt(LocalDate value) {
        this.pmtDueDt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public InvoiceTotals7 setCshAcct(AccountIdentification4Choice value) {
        this.cshAcct = value;
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
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public InvoiceTotals7 addTax(BillingTaxRecord2 tax) {
        getTax().add(tax);
        return this;
    }

}
