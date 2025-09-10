
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
 * Information relating to post-trade lifecycle events.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTradeEvent1", propOrder = {
    "tp",
    "orgnlRef",
    "undrlygLbltyRef",
    "prftOrLossSttlmDt",
    "prftOrLoss",
    "outsdngSttlmAmt"
})
public class PostTradeEvent1 {

    @XmlElement(name = "Tp", required = true)
    protected PostTradeEventType2Choice tp;
    @XmlElement(name = "OrgnlRef", required = true)
    protected String orgnlRef;
    @XmlElement(name = "UndrlygLbltyRef")
    protected String undrlygLbltyRef;
    @XmlElement(name = "PrftOrLossSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate prftOrLossSttlmDt;
    @XmlElement(name = "PrftOrLoss")
    protected ProfitAndLossAmount2 prftOrLoss;
    @XmlElement(name = "OutsdngSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount outsdngSttlmAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PostTradeEventType2Choice }
     *     
     */
    public PostTradeEventType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTradeEventType2Choice }
     *     
     */
    public PostTradeEvent1 setTp(PostTradeEventType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRef() {
        return orgnlRef;
    }

    /**
     * Sets the value of the orgnlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostTradeEvent1 setOrgnlRef(String value) {
        this.orgnlRef = value;
        return this;
    }

    /**
     * Gets the value of the undrlygLbltyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygLbltyRef() {
        return undrlygLbltyRef;
    }

    /**
     * Sets the value of the undrlygLbltyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostTradeEvent1 setUndrlygLbltyRef(String value) {
        this.undrlygLbltyRef = value;
        return this;
    }

    /**
     * Gets the value of the prftOrLossSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPrftOrLossSttlmDt() {
        return prftOrLossSttlmDt;
    }

    /**
     * Sets the value of the prftOrLossSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostTradeEvent1 setPrftOrLossSttlmDt(LocalDate value) {
        this.prftOrLossSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the prftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLossAmount2 }
     *     
     */
    public ProfitAndLossAmount2 getPrftOrLoss() {
        return prftOrLoss;
    }

    /**
     * Sets the value of the prftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLossAmount2 }
     *     
     */
    public PostTradeEvent1 setPrftOrLoss(ProfitAndLossAmount2 value) {
        this.prftOrLoss = value;
        return this;
    }

    /**
     * Gets the value of the outsdngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOutsdngSttlmAmt() {
        return outsdngSttlmAmt;
    }

    /**
     * Sets the value of the outsdngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PostTradeEvent1 setOutsdngSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.outsdngSttlmAmt = value;
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
