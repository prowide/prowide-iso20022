
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TradePartyIdentification5", propOrder = {
    "submitgPty",
    "tradPty",
    "fndId"
})
public class TradePartyIdentification5 {

    @XmlElement(name = "SubmitgPty", required = true)
    protected PartyIdentification19Choice submitgPty;
    @XmlElement(name = "TradPty", required = true)
    protected PartyIdentification19Choice tradPty;
    @XmlElement(name = "FndId")
    protected List<FundIdentification3> fndId;

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification19Choice }
     *     
     */
    public PartyIdentification19Choice getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification19Choice }
     *     
     */
    public TradePartyIdentification5 setSubmitgPty(PartyIdentification19Choice value) {
        this.submitgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification19Choice }
     *     
     */
    public PartyIdentification19Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification19Choice }
     *     
     */
    public TradePartyIdentification5 setTradPty(PartyIdentification19Choice value) {
        this.tradPty = value;
        return this;
    }

    /**
     * Gets the value of the fndId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndId property.
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
     * {@link FundIdentification3 }
     * 
     * 
     */
    public List<FundIdentification3> getFndId() {
        if (fndId == null) {
            fndId = new ArrayList<FundIdentification3>();
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
    public TradePartyIdentification5 addFndId(FundIdentification3 fndId) {
        getFndId().add(fndId);
        return this;
    }

}
