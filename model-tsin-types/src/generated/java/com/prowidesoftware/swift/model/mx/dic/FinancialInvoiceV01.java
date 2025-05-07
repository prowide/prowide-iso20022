
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
 * Scope
 * The FinancialInvoice message is used to support the provision of financial and related services where there is a requirement to exchange invoice information.
 * Usage
 * While the prime function of the FinancialInvoice message is as a request from the seller to the buyer for payment, the FinancialInvoice message can also serve to evidence an invoice in support of a financial service such as invoice factoring, letters of credit, and bank payment obligations, to enable Web based services such as electronic bill payment and presentment, and as the basis to transfer invoice information via third parties such as e-invoicing service providers.
 * A consequence of the receipt of an invoice by the buyer is that it acts as a trigger for the use of related messages that are already defined in ISO 20022, notably where the information contained in the Financial Invoice enables payment for the goods or services received, and/or is provided in support of a request for invoice financing. While certain of these related messages, such as the CreditTransfer and PaymentInitiation messages, are shown in the sequence diagram they are out of scope. They are shown only to illustrate a given scenario and to place the invoice in the context of the financial banking processes that might be conducted between different financial institutions.
 * The use of self-billing by the buyer to the seller, where the buyer acts as the invoice issuer or the process of handling an incorrect invoice, is not in scope.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInvoiceV01", propOrder = {
    "invcHdr",
    "tradAgrmt",
    "tradDlvry",
    "tradSttlm",
    "lineItm"
})
public class FinancialInvoiceV01 {

    @XmlElement(name = "InvcHdr", required = true)
    protected InvoiceHeader1 invcHdr;
    @XmlElement(name = "TradAgrmt", required = true)
    protected TradeAgreement6 tradAgrmt;
    @XmlElement(name = "TradDlvry", required = true)
    protected TradeDelivery1 tradDlvry;
    @XmlElement(name = "TradSttlm", required = true)
    protected TradeSettlement1 tradSttlm;
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
    public FinancialInvoiceV01 setInvcHdr(InvoiceHeader1 value) {
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
    public FinancialInvoiceV01 setTradAgrmt(TradeAgreement6 value) {
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
    public FinancialInvoiceV01 setTradDlvry(TradeDelivery1 value) {
        this.tradDlvry = value;
        return this;
    }

    /**
     * Gets the value of the tradSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSettlement1 }
     *     
     */
    public TradeSettlement1 getTradSttlm() {
        return tradSttlm;
    }

    /**
     * Sets the value of the tradSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSettlement1 }
     *     
     */
    public FinancialInvoiceV01 setTradSttlm(TradeSettlement1 value) {
        this.tradSttlm = value;
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
    public FinancialInvoiceV01 addLineItm(LineItem10 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
