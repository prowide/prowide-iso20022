
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Totals of the reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals14", propOrder = {
    "id",
    "dt",
    "chckptRef",
    "fin",
    "msg",
    "addtlFeeRcncltn",
    "ccy",
    "amt",
    "cdtDbt"
})
public class TransactionTotals14 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "ChckptRef")
    protected String chckptRef;
    @XmlElement(name = "Fin")
    protected List<FinancialReconciliation3> fin;
    @XmlElement(name = "Msg")
    protected List<MessageReconciliation3> msg;
    @XmlElement(name = "AddtlFeeRcncltn")
    protected List<AdditionalFeeReconciliation3> addtlFeeRcncltn;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotals14 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotals14 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the chckptRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckptRef() {
        return chckptRef;
    }

    /**
     * Sets the value of the chckptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotals14 setChckptRef(String value) {
        this.chckptRef = value;
        return this;
    }

    /**
     * Gets the value of the fin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialReconciliation3 }
     * 
     * 
     * @return
     *     The value of the fin property.
     */
    public List<FinancialReconciliation3> getFin() {
        if (fin == null) {
            fin = new ArrayList<>();
        }
        return this.fin;
    }

    /**
     * Gets the value of the msg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageReconciliation3 }
     * 
     * 
     * @return
     *     The value of the msg property.
     */
    public List<MessageReconciliation3> getMsg() {
        if (msg == null) {
            msg = new ArrayList<>();
        }
        return this.msg;
    }

    /**
     * Gets the value of the addtlFeeRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFeeRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFeeRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFeeReconciliation3 }
     * 
     * 
     * @return
     *     The value of the addtlFeeRcncltn property.
     */
    public List<AdditionalFeeReconciliation3> getAddtlFeeRcncltn() {
        if (addtlFeeRcncltn == null) {
            addtlFeeRcncltn = new ArrayList<>();
        }
        return this.addtlFeeRcncltn;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotals14 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals14 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public TransactionTotals14 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
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
     * Adds a new item to the fin list.
     * @see #getFin()
     * 
     */
    public TransactionTotals14 addFin(FinancialReconciliation3 fin) {
        getFin().add(fin);
        return this;
    }

    /**
     * Adds a new item to the msg list.
     * @see #getMsg()
     * 
     */
    public TransactionTotals14 addMsg(MessageReconciliation3 msg) {
        getMsg().add(msg);
        return this;
    }

    /**
     * Adds a new item to the addtlFeeRcncltn list.
     * @see #getAddtlFeeRcncltn()
     * 
     */
    public TransactionTotals14 addAddtlFeeRcncltn(AdditionalFeeReconciliation3 addtlFeeRcncltn) {
        getAddtlFeeRcncltn().add(addtlFeeRcncltn);
        return this;
    }

}
