
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceExtensionSD1", propOrder = {
    "plcAndNm",
    "txPos",
    "asOfDt",
    "dlvryDt",
    "contraPtcptNb",
    "rcvrAcctNb",
    "dlvrrAcctNb"
})
public class AccountBalanceExtensionSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "TxPos")
    protected AdjustedBalanceTypeSD1Choice txPos;
    @XmlElement(name = "AsOfDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate asOfDt;
    @XmlElement(name = "DlvryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dlvryDt;
    @XmlElement(name = "ContraPtcptNb")
    protected String contraPtcptNb;
    @XmlElement(name = "RcvrAcctNb")
    protected String rcvrAcctNb;
    @XmlElement(name = "DlvrrAcctNb")
    protected String dlvrrAcctNb;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountBalanceExtensionSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the txPos property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedBalanceTypeSD1Choice }
     *     
     */
    public AdjustedBalanceTypeSD1Choice getTxPos() {
        return txPos;
    }

    /**
     * Sets the value of the txPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedBalanceTypeSD1Choice }
     *     
     */
    public AccountBalanceExtensionSD1 setTxPos(AdjustedBalanceTypeSD1Choice value) {
        this.txPos = value;
        return this;
    }

    /**
     * Gets the value of the asOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAsOfDt() {
        return asOfDt;
    }

    /**
     * Sets the value of the asOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountBalanceExtensionSD1 setAsOfDt(LocalDate value) {
        this.asOfDt = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountBalanceExtensionSD1 setDlvryDt(LocalDate value) {
        this.dlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the contraPtcptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraPtcptNb() {
        return contraPtcptNb;
    }

    /**
     * Sets the value of the contraPtcptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountBalanceExtensionSD1 setContraPtcptNb(String value) {
        this.contraPtcptNb = value;
        return this;
    }

    /**
     * Gets the value of the rcvrAcctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrAcctNb() {
        return rcvrAcctNb;
    }

    /**
     * Sets the value of the rcvrAcctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountBalanceExtensionSD1 setRcvrAcctNb(String value) {
        this.rcvrAcctNb = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrAcctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrrAcctNb() {
        return dlvrrAcctNb;
    }

    /**
     * Sets the value of the dlvrrAcctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountBalanceExtensionSD1 setDlvrrAcctNb(String value) {
        this.dlvrrAcctNb = value;
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
