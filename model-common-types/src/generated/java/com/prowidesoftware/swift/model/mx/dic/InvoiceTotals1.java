
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "InvoiceTotals1", propOrder = {
    "ttlTaxblAmt",
    "ttlTaxAmt",
    "adjstmnt",
    "ttlInvcAmt",
    "pmtDueDt"
})
public class InvoiceTotals1 {

    @XmlElement(name = "TtlTaxblAmt", required = true)
    protected ActiveCurrencyAndAmount ttlTaxblAmt;
    @XmlElement(name = "TtlTaxAmt", required = true)
    protected ActiveCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Adjstmnt")
    protected Adjustment5 adjstmnt;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected ActiveCurrencyAndAmount ttlInvcAmt;
    @XmlElement(name = "PmtDueDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;

    /**
     * Gets the value of the ttlTaxblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxblAmt() {
        return ttlTaxblAmt;
    }

    /**
     * Sets the value of the ttlTaxblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvoiceTotals1 setTtlTaxblAmt(ActiveCurrencyAndAmount value) {
        this.ttlTaxblAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvoiceTotals1 setTtlTaxAmt(ActiveCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
        return this;
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
    public InvoiceTotals1 setAdjstmnt(Adjustment5 value) {
        this.adjstmnt = value;
        return this;
    }

    /**
     * Gets the value of the ttlInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Sets the value of the ttlInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvoiceTotals1 setTtlInvcAmt(ActiveCurrencyAndAmount value) {
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
    public XMLGregorianCalendar getPmtDueDt() {
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
    public InvoiceTotals1 setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
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
