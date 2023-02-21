
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
@XmlType(name = "CardPaymentInvoice3", propOrder = {
    "invcHdr",
    "tradAgrmt",
    "tradDlvry",
    "lineItm"
})
public class CardPaymentInvoice3 {

    @XmlElement(name = "InvcHdr", required = true)
    protected InvoiceHeader3 invcHdr;
    @XmlElement(name = "TradAgrmt", required = true)
    protected TradeAgreement16 tradAgrmt;
    @XmlElement(name = "TradDlvry", required = true)
    protected TradeDelivery3 tradDlvry;
    @XmlElement(name = "LineItm")
    protected List<LineItem17> lineItm;

    /**
     * Gets the value of the invcHdr property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader3 }
     *     
     */
    public InvoiceHeader3 getInvcHdr() {
        return invcHdr;
    }

    /**
     * Sets the value of the invcHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader3 }
     *     
     */
    public CardPaymentInvoice3 setInvcHdr(InvoiceHeader3 value) {
        this.invcHdr = value;
        return this;
    }

    /**
     * Gets the value of the tradAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement16 }
     *     
     */
    public TradeAgreement16 getTradAgrmt() {
        return tradAgrmt;
    }

    /**
     * Sets the value of the tradAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement16 }
     *     
     */
    public CardPaymentInvoice3 setTradAgrmt(TradeAgreement16 value) {
        this.tradAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDelivery3 }
     *     
     */
    public TradeDelivery3 getTradDlvry() {
        return tradDlvry;
    }

    /**
     * Sets the value of the tradDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDelivery3 }
     *     
     */
    public CardPaymentInvoice3 setTradDlvry(TradeDelivery3 value) {
        this.tradDlvry = value;
        return this;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItm property.
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
     * {@link LineItem17 }
     * 
     * 
     */
    public List<LineItem17> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<LineItem17>();
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
    public CardPaymentInvoice3 addLineItm(LineItem17 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
