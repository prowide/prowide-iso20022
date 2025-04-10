
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
@XmlType(name = "TwoLegTransactionDetails5", propOrder = {
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
public class TwoLegTransactionDetails5 {

    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
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
    protected Price14 endPric;
    @XmlElement(name = "ClsgDt")
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "ClsgSttlmAmt")
    protected AmountAndDirection5 clsgSttlmAmt;
    @XmlElement(name = "PrcgDt")
    protected TradeDate7Choice prcgDt;
    @XmlElement(name = "TwoLegTxTp")
    protected TwoLegTransactionType4Choice twoLegTxTp;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TwoLegTransactionDetails5 setTradDt(TradeDate8Choice value) {
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
    public TwoLegTransactionDetails5 setOpngLegId(String value) {
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
    public TwoLegTransactionDetails5 setClsgLegId(String value) {
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
    public TwoLegTransactionDetails5 setGrssTradAmt(AmountAndDirection29 value) {
        this.grssTradAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmts property.
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
     * @return
     *     The value of the othrAmts property.
     */
    public List<OtherAmounts16> getOthrAmts() {
        if (othrAmts == null) {
            othrAmts = new ArrayList<>();
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
    public TwoLegTransactionDetails5 setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the endPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getEndPric() {
        return endPric;
    }

    /**
     * Sets the value of the endPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public TwoLegTransactionDetails5 setEndPric(Price14 value) {
        this.endPric = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public TwoLegTransactionDetails5 setClsgDt(ClosingDate4Choice value) {
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
    public TwoLegTransactionDetails5 setClsgSttlmAmt(AmountAndDirection5 value) {
        this.clsgSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TradeDate7Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TwoLegTransactionDetails5 setPrcgDt(TradeDate7Choice value) {
        this.prcgDt = value;
        return this;
    }

    /**
     * Gets the value of the twoLegTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TwoLegTransactionType4Choice }
     *     
     */
    public TwoLegTransactionType4Choice getTwoLegTxTp() {
        return twoLegTxTp;
    }

    /**
     * Sets the value of the twoLegTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoLegTransactionType4Choice }
     *     
     */
    public TwoLegTransactionDetails5 setTwoLegTxTp(TwoLegTransactionType4Choice value) {
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
    public TwoLegTransactionDetails5 addOthrAmts(OtherAmounts16 othrAmts) {
        getOthrAmts().add(othrAmts);
        return this;
    }

}
