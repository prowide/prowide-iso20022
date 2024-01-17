
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the single order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleOrder1", propOrder = {
    "mnlOrdrInd",
    "drctdOrdr",
    "rcvdDptmt",
    "cstmrHdlgInstr",
    "ordrDtls",
    "sprdAndBchmkCrvDtls",
    "yldDtls",
    "twoLegTxDtls",
    "tradRgltryTmStmpsDtls"
})
public class SingleOrder1 {

    @XmlElement(name = "MnlOrdrInd")
    protected Boolean mnlOrdrInd;
    @XmlElement(name = "DrctdOrdr")
    protected Boolean drctdOrdr;
    @XmlElement(name = "RcvdDptmt")
    protected String rcvdDptmt;
    @XmlElement(name = "CstmrHdlgInstr")
    protected CustomerHandlingInstructionChoice cstmrHdlgInstr;
    @XmlElement(name = "OrdrDtls", required = true)
    protected Order3 ordrDtls;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;
    @XmlElement(name = "TwoLegTxDtls")
    protected SecuritiesFinancing1 twoLegTxDtls;
    @XmlElement(name = "TradRgltryTmStmpsDtls")
    protected TradeRegulatoryTimeStampGroup tradRgltryTmStmpsDtls;

    /**
     * Gets the value of the mnlOrdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMnlOrdrInd() {
        return mnlOrdrInd;
    }

    /**
     * Sets the value of the mnlOrdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SingleOrder1 setMnlOrdrInd(Boolean value) {
        this.mnlOrdrInd = value;
        return this;
    }

    /**
     * Gets the value of the drctdOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctdOrdr() {
        return drctdOrdr;
    }

    /**
     * Sets the value of the drctdOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SingleOrder1 setDrctdOrdr(Boolean value) {
        this.drctdOrdr = value;
        return this;
    }

    /**
     * Gets the value of the rcvdDptmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdDptmt() {
        return rcvdDptmt;
    }

    /**
     * Sets the value of the rcvdDptmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SingleOrder1 setRcvdDptmt(String value) {
        this.rcvdDptmt = value;
        return this;
    }

    /**
     * Gets the value of the cstmrHdlgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerHandlingInstructionChoice }
     *     
     */
    public CustomerHandlingInstructionChoice getCstmrHdlgInstr() {
        return cstmrHdlgInstr;
    }

    /**
     * Sets the value of the cstmrHdlgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerHandlingInstructionChoice }
     *     
     */
    public SingleOrder1 setCstmrHdlgInstr(CustomerHandlingInstructionChoice value) {
        this.cstmrHdlgInstr = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order3 }
     *     
     */
    public Order3 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order3 }
     *     
     */
    public SingleOrder1 setOrdrDtls(Order3 value) {
        this.ordrDtls = value;
        return this;
    }

    /**
     * Gets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public BenchmarkCurve1 getSprdAndBchmkCrvDtls() {
        return sprdAndBchmkCrvDtls;
    }

    /**
     * Sets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public SingleOrder1 setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
        return this;
    }

    /**
     * Gets the value of the yldDtls property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getYldDtls() {
        return yldDtls;
    }

    /**
     * Sets the value of the yldDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public SingleOrder1 setYldDtls(YieldCalculation1 value) {
        this.yldDtls = value;
        return this;
    }

    /**
     * Gets the value of the twoLegTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public SecuritiesFinancing1 getTwoLegTxDtls() {
        return twoLegTxDtls;
    }

    /**
     * Sets the value of the twoLegTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public SingleOrder1 setTwoLegTxDtls(SecuritiesFinancing1 value) {
        this.twoLegTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltryTmStmpsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRegulatoryTimeStampGroup }
     *     
     */
    public TradeRegulatoryTimeStampGroup getTradRgltryTmStmpsDtls() {
        return tradRgltryTmStmpsDtls;
    }

    /**
     * Sets the value of the tradRgltryTmStmpsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRegulatoryTimeStampGroup }
     *     
     */
    public SingleOrder1 setTradRgltryTmStmpsDtls(TradeRegulatoryTimeStampGroup value) {
        this.tradRgltryTmStmpsDtls = value;
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
