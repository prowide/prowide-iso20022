
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
 * Information about a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTradeTransaction1", propOrder = {
    "tp",
    "id",
    "txDt",
    "tndrClsgDt",
    "txAmt",
    "ctrctAmtPctg",
    "addtlInf"
})
public class UnderlyingTradeTransaction1 {

    @XmlElement(name = "Tp", required = true)
    protected UnderlyingTradeTransactionType1Choice tp;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "TxDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate txDt;
    @XmlElement(name = "TndrClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tndrClsgDt;
    @XmlElement(name = "TxAmt")
    protected ActiveCurrencyAndAmount txAmt;
    @XmlElement(name = "CtrctAmtPctg")
    protected BigDecimal ctrctAmtPctg;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTradeTransactionType1Choice }
     *     
     */
    public UnderlyingTradeTransactionType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTradeTransactionType1Choice }
     *     
     */
    public UnderlyingTradeTransaction1 setTp(UnderlyingTradeTransactionType1Choice value) {
        this.tp = value;
        return this;
    }

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
    public UnderlyingTradeTransaction1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingTradeTransaction1 setTxDt(LocalDate value) {
        this.txDt = value;
        return this;
    }

    /**
     * Gets the value of the tndrClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTndrClsgDt() {
        return tndrClsgDt;
    }

    /**
     * Sets the value of the tndrClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingTradeTransaction1 setTndrClsgDt(LocalDate value) {
        this.tndrClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnderlyingTradeTransaction1 setTxAmt(ActiveCurrencyAndAmount value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctAmtPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctAmtPctg() {
        return ctrctAmtPctg;
    }

    /**
     * Sets the value of the ctrctAmtPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UnderlyingTradeTransaction1 setCtrctAmtPctg(BigDecimal value) {
        this.ctrctAmtPctg = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public UnderlyingTradeTransaction1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
