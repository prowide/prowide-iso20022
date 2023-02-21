
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
 * Specifies the details of the first leg in a two leg transaction process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoLegTransactionDetails1", propOrder = {
    "tradDt",
    "opngLegId",
    "clsgLegId",
    "grssTradAmt",
    "othrAmts",
    "scndLegNrrtv",
    "endPric",
    "clsgDt",
    "clsgSttlmAmt",
    "prcgDt",
    "twoLegTxTp"
})
public class TwoLegTransactionDetails1 {

    @XmlElement(name = "TradDt")
    protected TradeDate1Choice tradDt;
    @XmlElement(name = "OpngLegId")
    protected String opngLegId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "GrssTradAmt")
    protected AmountAndDirection29 grssTradAmt;
    @XmlElement(name = "OthrAmts")
    protected List<OtherAmounts16> othrAmts;
    @XmlElement(name = "ScndLegNrrtv")
    protected String scndLegNrrtv;
    @XmlElement(name = "EndPric")
    protected Price4 endPric;
    @XmlElement(name = "ClsgDt")
    protected ClosingDate1Choice clsgDt;
    @XmlElement(name = "ClsgSttlmAmt")
    protected AmountAndDirection5 clsgSttlmAmt;
    @XmlElement(name = "PrcgDt")
    protected TradeDate4Choice prcgDt;
    @XmlElement(name = "TwoLegTxTp")
    protected TwoLegTransactionType1Choice twoLegTxTp;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate1Choice }
     *     
     */
    public TradeDate1Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate1Choice }
     *     
     */
    public TwoLegTransactionDetails1 setTradDt(TradeDate1Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the opngLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpngLegId() {
        return opngLegId;
    }

    /**
     * Sets the value of the opngLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TwoLegTransactionDetails1 setOpngLegId(String value) {
        this.opngLegId = value;
        return this;
    }

    /**
     * Gets the value of the clsgLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsgLegId() {
        return clsgLegId;
    }

    /**
     * Sets the value of the clsgLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TwoLegTransactionDetails1 setClsgLegId(String value) {
        this.clsgLegId = value;
        return this;
    }

    /**
     * Gets the value of the grssTradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getGrssTradAmt() {
        return grssTradAmt;
    }

    /**
     * Sets the value of the grssTradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public TwoLegTransactionDetails1 setGrssTradAmt(AmountAndDirection29 value) {
        this.grssTradAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts16 }
     * 
     * 
     */
    public List<OtherAmounts16> getOthrAmts() {
        if (othrAmts == null) {
            othrAmts = new ArrayList<OtherAmounts16>();
        }
        return this.othrAmts;
    }

    /**
     * Gets the value of the scndLegNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNrrtv() {
        return scndLegNrrtv;
    }

    /**
     * Sets the value of the scndLegNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TwoLegTransactionDetails1 setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the endPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getEndPric() {
        return endPric;
    }

    /**
     * Sets the value of the endPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public TwoLegTransactionDetails1 setEndPric(Price4 value) {
        this.endPric = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate1Choice }
     *     
     */
    public ClosingDate1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate1Choice }
     *     
     */
    public TwoLegTransactionDetails1 setClsgDt(ClosingDate1Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getClsgSttlmAmt() {
        return clsgSttlmAmt;
    }

    /**
     * Sets the value of the clsgSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public TwoLegTransactionDetails1 setClsgSttlmAmt(AmountAndDirection5 value) {
        this.clsgSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate4Choice }
     *     
     */
    public TradeDate4Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate4Choice }
     *     
     */
    public TwoLegTransactionDetails1 setPrcgDt(TradeDate4Choice value) {
        this.prcgDt = value;
        return this;
    }

    /**
     * Gets the value of the twoLegTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TwoLegTransactionType1Choice }
     *     
     */
    public TwoLegTransactionType1Choice getTwoLegTxTp() {
        return twoLegTxTp;
    }

    /**
     * Sets the value of the twoLegTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoLegTransactionType1Choice }
     *     
     */
    public TwoLegTransactionDetails1 setTwoLegTxTp(TwoLegTransactionType1Choice value) {
        this.twoLegTxTp = value;
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
     * Adds a new item to the othrAmts list.
     * @see #getOthrAmts()
     * 
     */
    public TwoLegTransactionDetails1 addOthrAmts(OtherAmounts16 othrAmts) {
        getOthrAmts().add(othrAmts);
        return this;
    }

}
