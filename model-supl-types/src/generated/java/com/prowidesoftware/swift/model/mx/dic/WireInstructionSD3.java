
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment wire instruction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireInstructionSD3", propOrder = {
    "plcAndNm",
    "wireQty",
    "bkNm",
    "bkAdr",
    "bkCity",
    "bkCtry",
    "bkAttnTo",
    "bkCmnts",
    "bnfcryAcct",
    "bnfcryAcctId",
    "bnfcryAcctCmnts"
})
public class WireInstructionSD3 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "WireQty", required = true)
    protected FinancialInstrumentQuantity15Choice wireQty;
    @XmlElement(name = "BkNm", required = true)
    protected String bkNm;
    @XmlElement(name = "BkAdr", required = true)
    protected String bkAdr;
    @XmlElement(name = "BkCity", required = true)
    protected String bkCity;
    @XmlElement(name = "BkCtry", required = true)
    protected String bkCtry;
    @XmlElement(name = "BkAttnTo", required = true)
    protected String bkAttnTo;
    @XmlElement(name = "BkCmnts", required = true)
    protected String bkCmnts;
    @XmlElement(name = "BnfcryAcct", required = true)
    protected String bnfcryAcct;
    @XmlElement(name = "BnfcryAcctId", required = true)
    protected String bnfcryAcctId;
    @XmlElement(name = "BnfcryAcctCmnts", required = true)
    protected String bnfcryAcctCmnts;

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
    public WireInstructionSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the wireQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getWireQty() {
        return wireQty;
    }

    /**
     * Sets the value of the wireQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public WireInstructionSD3 setWireQty(FinancialInstrumentQuantity15Choice value) {
        this.wireQty = value;
        return this;
    }

    /**
     * Gets the value of the bkNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkNm() {
        return bkNm;
    }

    /**
     * Sets the value of the bkNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBkNm(String value) {
        this.bkNm = value;
        return this;
    }

    /**
     * Gets the value of the bkAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkAdr() {
        return bkAdr;
    }

    /**
     * Sets the value of the bkAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBkAdr(String value) {
        this.bkAdr = value;
        return this;
    }

    /**
     * Gets the value of the bkCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkCity() {
        return bkCity;
    }

    /**
     * Sets the value of the bkCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBkCity(String value) {
        this.bkCity = value;
        return this;
    }

    /**
     * Gets the value of the bkCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkCtry() {
        return bkCtry;
    }

    /**
     * Sets the value of the bkCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBkCtry(String value) {
        this.bkCtry = value;
        return this;
    }

    /**
     * Gets the value of the bkAttnTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkAttnTo() {
        return bkAttnTo;
    }

    /**
     * Sets the value of the bkAttnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBkAttnTo(String value) {
        this.bkAttnTo = value;
        return this;
    }

    /**
     * Gets the value of the bkCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkCmnts() {
        return bkCmnts;
    }

    /**
     * Sets the value of the bkCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBkCmnts(String value) {
        this.bkCmnts = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryAcct() {
        return bnfcryAcct;
    }

    /**
     * Sets the value of the bnfcryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBnfcryAcct(String value) {
        this.bnfcryAcct = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryAcctId() {
        return bnfcryAcctId;
    }

    /**
     * Sets the value of the bnfcryAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBnfcryAcctId(String value) {
        this.bnfcryAcctId = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryAcctCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryAcctCmnts() {
        return bnfcryAcctCmnts;
    }

    /**
     * Sets the value of the bnfcryAcctCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WireInstructionSD3 setBnfcryAcctCmnts(String value) {
        this.bnfcryAcctCmnts = value;
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
