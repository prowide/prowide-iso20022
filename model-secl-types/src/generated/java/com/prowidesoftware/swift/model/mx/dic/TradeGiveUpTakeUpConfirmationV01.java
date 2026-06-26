
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
 * The TradeGiveUpTakeUpConfirmation message is sent by the clearing and settlement system to the participant (the giver) to confirm the give-up request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeGiveUpTakeUpConfirmationV01", propOrder = {
    "tradRefs",
    "gvUpClrMmb",
    "takeUpClrMmb",
    "gvUpSttlmPtcpt",
    "takeUpSttlmPtcpt",
    "tradData",
    "splmtryData"
})
public class TradeGiveUpTakeUpConfirmationV01 {

    @XmlElement(name = "TradRefs", required = true)
    protected TradeReference1 tradRefs;
    @XmlElement(name = "GvUpClrMmb", required = true)
    protected PartyIdentification180Choice gvUpClrMmb;
    @XmlElement(name = "TakeUpClrMmb", required = true)
    protected PartyIdentification180Choice takeUpClrMmb;
    @XmlElement(name = "GvUpSttlmPtcpt")
    protected PartyIdentification180Choice gvUpSttlmPtcpt;
    @XmlElement(name = "TakeUpSttlmPtcpt")
    protected PartyIdentification180Choice takeUpSttlmPtcpt;
    @XmlElement(name = "TradData", required = true)
    protected TradeData18 tradData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the tradRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TradeReference1 }
     *     
     */
    public TradeReference1 getTradRefs() {
        return tradRefs;
    }

    /**
     * Sets the value of the tradRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeReference1 }
     *     
     */
    public TradeGiveUpTakeUpConfirmationV01 setTradRefs(TradeReference1 value) {
        this.tradRefs = value;
        return this;
    }

    /**
     * Gets the value of the gvUpClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getGvUpClrMmb() {
        return gvUpClrMmb;
    }

    /**
     * Sets the value of the gvUpClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeGiveUpTakeUpConfirmationV01 setGvUpClrMmb(PartyIdentification180Choice value) {
        this.gvUpClrMmb = value;
        return this;
    }

    /**
     * Gets the value of the takeUpClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getTakeUpClrMmb() {
        return takeUpClrMmb;
    }

    /**
     * Sets the value of the takeUpClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeGiveUpTakeUpConfirmationV01 setTakeUpClrMmb(PartyIdentification180Choice value) {
        this.takeUpClrMmb = value;
        return this;
    }

    /**
     * Gets the value of the gvUpSttlmPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getGvUpSttlmPtcpt() {
        return gvUpSttlmPtcpt;
    }

    /**
     * Sets the value of the gvUpSttlmPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeGiveUpTakeUpConfirmationV01 setGvUpSttlmPtcpt(PartyIdentification180Choice value) {
        this.gvUpSttlmPtcpt = value;
        return this;
    }

    /**
     * Gets the value of the takeUpSttlmPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getTakeUpSttlmPtcpt() {
        return takeUpSttlmPtcpt;
    }

    /**
     * Sets the value of the takeUpSttlmPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeGiveUpTakeUpConfirmationV01 setTakeUpSttlmPtcpt(PartyIdentification180Choice value) {
        this.takeUpSttlmPtcpt = value;
        return this;
    }

    /**
     * Gets the value of the tradData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData18 }
     *     
     */
    public TradeData18 getTradData() {
        return tradData;
    }

    /**
     * Sets the value of the tradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData18 }
     *     
     */
    public TradeGiveUpTakeUpConfirmationV01 setTradData(TradeData18 value) {
        this.tradData = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeGiveUpTakeUpConfirmationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
