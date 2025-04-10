
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
 * This message is sent by the central counterparty to the clearing member to confim the details of the transaction (sell or buy) resulting from the buy in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInConfirmationV01", propOrder = {
    "id",
    "clrMmb",
    "buyInDtls",
    "orgnlSttlmOblgtn",
    "splmtryData"
})
public class BuyInConfirmationV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "BuyInDtls", required = true)
    protected BuyIn2 buyInDtls;
    @XmlElement(name = "OrgnlSttlmOblgtn")
    protected SettlementObligation1 orgnlSttlmOblgtn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public BuyInConfirmationV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public BuyInConfirmationV01 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the buyInDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BuyIn2 }
     *     
     */
    public BuyIn2 getBuyInDtls() {
        return buyInDtls;
    }

    /**
     * Sets the value of the buyInDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyIn2 }
     *     
     */
    public BuyInConfirmationV01 setBuyInDtls(BuyIn2 value) {
        this.buyInDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlSttlmOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligation1 }
     *     
     */
    public SettlementObligation1 getOrgnlSttlmOblgtn() {
        return orgnlSttlmOblgtn;
    }

    /**
     * Sets the value of the orgnlSttlmOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligation1 }
     *     
     */
    public BuyInConfirmationV01 setOrgnlSttlmOblgtn(SettlementObligation1 value) {
        this.orgnlSttlmOblgtn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
    public BuyInConfirmationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
