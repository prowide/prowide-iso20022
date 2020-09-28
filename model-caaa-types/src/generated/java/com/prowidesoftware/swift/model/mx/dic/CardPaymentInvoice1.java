
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
 * Detailed invoice data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentInvoice1", propOrder = {
    "invcHdr",
    "tradAgrmt",
    "tradDlvry",
    "lineItm"
})
public class CardPaymentInvoice1 {

    @XmlElement(name = "InvcHdr", required = true)
    protected InvoiceHeader1 invcHdr;
    @XmlElement(name = "TradAgrmt", required = true)
    protected TradeAgreement6 tradAgrmt;
    @XmlElement(name = "TradDlvry", required = true)
    protected TradeDelivery1 tradDlvry;
    @XmlElement(name = "LineItm")
    protected List<LineItem10> lineItm;

    /**
     * Gets the value of the invcHdr property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader1 }
     *     
     */
    public InvoiceHeader1 getInvcHdr() {
        return invcHdr;
    }

    /**
     * Sets the value of the invcHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader1 }
     *     
     */
    public CardPaymentInvoice1 setInvcHdr(InvoiceHeader1 value) {
        this.invcHdr = value;
        return this;
    }

    /**
     * Gets the value of the tradAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement6 }
     *     
     */
    public TradeAgreement6 getTradAgrmt() {
        return tradAgrmt;
    }

    /**
     * Sets the value of the tradAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement6 }
     *     
     */
    public CardPaymentInvoice1 setTradAgrmt(TradeAgreement6 value) {
        this.tradAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDelivery1 }
     *     
     */
    public TradeDelivery1 getTradDlvry() {
        return tradDlvry;
    }

    /**
     * Sets the value of the tradDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDelivery1 }
     *     
     */
    public CardPaymentInvoice1 setTradDlvry(TradeDelivery1 value) {
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
     * {@link LineItem10 }
     * 
     * 
     */
    public List<LineItem10> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<LineItem10>();
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
    public CardPaymentInvoice1 addLineItm(LineItem10 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
