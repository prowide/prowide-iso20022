
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reference and status information concerning the original transactions, included in the original instruction, to which the reversal message applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionInformation24", propOrder = {
    "rvslId",
    "orgnlPmtInfId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlIntrBkSttlmAmt",
    "rvsdIntrBkSttlmAmt",
    "rvsdInstdAmt",
    "xchgRate",
    "compstnAmt",
    "chrgBr",
    "chrgsInf",
    "instgAgt",
    "instdAgt",
    "rvslRsnInf",
    "orgnlTxRef"
})
public class PaymentTransactionInformation24 {

    @XmlElement(name = "RvslId")
    protected String rvslId;
    @XmlElement(name = "OrgnlPmtInfId")
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlIntrBkSttlmAmt")
    protected EuroMax9Amount orgnlIntrBkSttlmAmt;
    @XmlElement(name = "RvsdIntrBkSttlmAmt", required = true)
    protected EuroMax9Amount rvsdIntrBkSttlmAmt;
    @XmlElement(name = "RvsdInstdAmt")
    protected CurrencyAndAmount rvsdInstdAmt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CompstnAmt")
    protected EuroMax9Amount compstnAmt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType2Code chrgBr;
    @XmlElement(name = "ChrgsInf")
    protected List<ChargesInformation4> chrgsInf;
    @XmlElement(name = "InstgAgt")
    protected FinancialInstitution2 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected FinancialInstitution2 instdAgt;
    @XmlElement(name = "RvslRsnInf")
    protected List<ReversalReasonInformation5> rvslRsnInf;
    @XmlElement(name = "OrgnlTxRef", required = true)
    protected OriginalTransactionReference9 orgnlTxRef;

    /**
     * Gets the value of the rvslId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvslId() {
        return rvslId;
    }

    /**
     * Sets the value of the rvslId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionInformation24 setRvslId(String value) {
        this.rvslId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionInformation24 setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionInformation24 setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionInformation24 setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionInformation24 setOrgnlTxId(String value) {
        this.orgnlTxId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EuroMax9Amount }
     *     
     */
    public EuroMax9Amount getOrgnlIntrBkSttlmAmt() {
        return orgnlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuroMax9Amount }
     *     
     */
    public PaymentTransactionInformation24 setOrgnlIntrBkSttlmAmt(EuroMax9Amount value) {
        this.orgnlIntrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the rvsdIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EuroMax9Amount }
     *     
     */
    public EuroMax9Amount getRvsdIntrBkSttlmAmt() {
        return rvsdIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the rvsdIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuroMax9Amount }
     *     
     */
    public PaymentTransactionInformation24 setRvsdIntrBkSttlmAmt(EuroMax9Amount value) {
        this.rvsdIntrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the rvsdInstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getRvsdInstdAmt() {
        return rvsdInstdAmt;
    }

    /**
     * Sets the value of the rvsdInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentTransactionInformation24 setRvsdInstdAmt(CurrencyAndAmount value) {
        this.rvsdInstdAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTransactionInformation24 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the compstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EuroMax9Amount }
     *     
     */
    public EuroMax9Amount getCompstnAmt() {
        return compstnAmt;
    }

    /**
     * Sets the value of the compstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuroMax9Amount }
     *     
     */
    public PaymentTransactionInformation24 setCompstnAmt(EuroMax9Amount value) {
        this.compstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType2Code }
     *     
     */
    public ChargeBearerType2Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType2Code }
     *     
     */
    public PaymentTransactionInformation24 setChrgBr(ChargeBearerType2Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesInformation4 }
     * 
     * 
     * @return
     *     The value of the chrgsInf property.
     */
    public List<ChargesInformation4> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public FinancialInstitution2 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public PaymentTransactionInformation24 setInstgAgt(FinancialInstitution2 value) {
        this.instgAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public FinancialInstitution2 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public PaymentTransactionInformation24 setInstdAgt(FinancialInstitution2 value) {
        this.instdAgt = value;
        return this;
    }

    /**
     * Gets the value of the rvslRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rvslRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvslRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReversalReasonInformation5 }
     * 
     * 
     * @return
     *     The value of the rvslRsnInf property.
     */
    public List<ReversalReasonInformation5> getRvslRsnInf() {
        if (rvslRsnInf == null) {
            rvslRsnInf = new ArrayList<>();
        }
        return this.rvslRsnInf;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference9 }
     *     
     */
    public OriginalTransactionReference9 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference9 }
     *     
     */
    public PaymentTransactionInformation24 setOrgnlTxRef(OriginalTransactionReference9 value) {
        this.orgnlTxRef = value;
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
     * Adds a new item to the chrgsInf list.
     * @see #getChrgsInf()
     * 
     */
    public PaymentTransactionInformation24 addChrgsInf(ChargesInformation4 chrgsInf) {
        getChrgsInf().add(chrgsInf);
        return this;
    }

    /**
     * Adds a new item to the rvslRsnInf list.
     * @see #getRvslRsnInf()
     * 
     */
    public PaymentTransactionInformation24 addRvslRsnInf(ReversalReasonInformation5 rvslRsnInf) {
        getRvslRsnInf().add(rvslRsnInf);
        return this;
    }

}
