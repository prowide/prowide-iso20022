
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
 * Detailed invoice data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentInvoice2", propOrder = {
    "invcHdr",
    "tradAgrmt",
    "tradDlvry",
    "lineItm"
})
public class CardPaymentInvoice2 {

    @XmlElement(name = "InvcHdr", required = true)
    protected InvoiceHeader2 invcHdr;
    @XmlElement(name = "TradAgrmt", required = true)
    protected TradeAgreement13 tradAgrmt;
    @XmlElement(name = "TradDlvry", required = true)
    protected TradeDelivery2 tradDlvry;
    @XmlElement(name = "LineItm")
    protected List<LineItem16> lineItm;

    /**
     * Gets the value of the invcHdr property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader2 }
     *     
     */
    public InvoiceHeader2 getInvcHdr() {
        return invcHdr;
    }

    /**
     * Sets the value of the invcHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader2 }
     *     
     */
    public CardPaymentInvoice2 setInvcHdr(InvoiceHeader2 value) {
        this.invcHdr = value;
        return this;
    }

    /**
     * Gets the value of the tradAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement13 }
     *     
     */
    public TradeAgreement13 getTradAgrmt() {
        return tradAgrmt;
    }

    /**
     * Sets the value of the tradAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement13 }
     *     
     */
    public CardPaymentInvoice2 setTradAgrmt(TradeAgreement13 value) {
        this.tradAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDelivery2 }
     *     
     */
    public TradeDelivery2 getTradDlvry() {
        return tradDlvry;
    }

    /**
     * Sets the value of the tradDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDelivery2 }
     *     
     */
    public CardPaymentInvoice2 setTradDlvry(TradeDelivery2 value) {
        this.tradDlvry = value;
        return this;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem16 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<LineItem16> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
        }
        return this.lineItm;
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
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public CardPaymentInvoice2 addLineItm(LineItem16 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
