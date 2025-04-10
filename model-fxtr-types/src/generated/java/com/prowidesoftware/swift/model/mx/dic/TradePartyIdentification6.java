
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
 * Entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentification6", propOrder = {
    "submitgPty",
    "tradPty",
    "fndId"
})
public class TradePartyIdentification6 {

    @XmlElement(name = "SubmitgPty", required = true)
    protected PartyIdentification73Choice submitgPty;
    @XmlElement(name = "TradPty")
    protected PartyIdentification73Choice tradPty;
    @XmlElement(name = "FndId")
    protected List<FundIdentification4> fndId;

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public TradePartyIdentification6 setSubmitgPty(PartyIdentification73Choice value) {
        this.submitgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public TradePartyIdentification6 setTradPty(PartyIdentification73Choice value) {
        this.tradPty = value;
        return this;
    }

    /**
     * Gets the value of the fndId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundIdentification4 }
     * 
     * 
     * @return
     *     The value of the fndId property.
     */
    public List<FundIdentification4> getFndId() {
        if (fndId == null) {
            fndId = new ArrayList<>();
        }
        return this.fndId;
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
     * Adds a new item to the fndId list.
     * @see #getFndId()
     * 
     */
    public TradePartyIdentification6 addFndId(FundIdentification4 fndId) {
        getFndId().add(fndId);
        return this;
    }

}
