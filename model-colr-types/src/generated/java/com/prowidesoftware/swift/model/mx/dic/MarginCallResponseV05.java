
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
 * Scope
 * The MarginCallResponse message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager or vice versa. This is a response to the MarginCallRequest message. The margin call can be accepted, fully disputed or partially disputed.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * When sent by the collateral giver the MarginCallResponse message is used to:
 * - fully accept the MarginCallRequest
 * - or partially accept the MarginCallRequest.
 * 
 * When sent by the collateral taker the MarginCallResponse message is used to:
 * - fully accept the recall of collateral
 * - or partially accept the recall of collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallResponseV05", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "mrgnDtlsDueToA",
    "mrgnDtlsDueToB",
    "agrdAmtDueToA",
    "agrdAmtDueToB",
    "rspnDtls",
    "splmtryData"
})
public class MarginCallResponseV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation9 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "MrgnDtlsDueToA")
    protected MarginCall1 mrgnDtlsDueToA;
    @XmlElement(name = "MrgnDtlsDueToB")
    protected MarginCall1 mrgnDtlsDueToB;
    @XmlElement(name = "AgrdAmtDueToA")
    protected AgreedAmount1Choice agrdAmtDueToA;
    @XmlElement(name = "AgrdAmtDueToB")
    protected AgreedAmount1Choice agrdAmtDueToB;
    @XmlElement(name = "RspnDtls")
    protected Response1 rspnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarginCallResponseV05 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation9 }
     *     
     */
    public Obligation9 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation9 }
     *     
     */
    public MarginCallResponseV05 setOblgtn(Obligation9 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement4 }
     *     
     */
    public Agreement4 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement4 }
     *     
     */
    public MarginCallResponseV05 setAgrmt(Agreement4 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnDtlsDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlsDueToA() {
        return mrgnDtlsDueToA;
    }

    /**
     * Sets the value of the mrgnDtlsDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCallResponseV05 setMrgnDtlsDueToA(MarginCall1 value) {
        this.mrgnDtlsDueToA = value;
        return this;
    }

    /**
     * Gets the value of the mrgnDtlsDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlsDueToB() {
        return mrgnDtlsDueToB;
    }

    /**
     * Sets the value of the mrgnDtlsDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCallResponseV05 setMrgnDtlsDueToB(MarginCall1 value) {
        this.mrgnDtlsDueToB = value;
        return this;
    }

    /**
     * Gets the value of the agrdAmtDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public AgreedAmount1Choice getAgrdAmtDueToA() {
        return agrdAmtDueToA;
    }

    /**
     * Sets the value of the agrdAmtDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public MarginCallResponseV05 setAgrdAmtDueToA(AgreedAmount1Choice value) {
        this.agrdAmtDueToA = value;
        return this;
    }

    /**
     * Gets the value of the agrdAmtDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public AgreedAmount1Choice getAgrdAmtDueToB() {
        return agrdAmtDueToB;
    }

    /**
     * Sets the value of the agrdAmtDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public MarginCallResponseV05 setAgrdAmtDueToB(AgreedAmount1Choice value) {
        this.agrdAmtDueToB = value;
        return this;
    }

    /**
     * Gets the value of the rspnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Response1 }
     *     
     */
    public Response1 getRspnDtls() {
        return rspnDtls;
    }

    /**
     * Sets the value of the rspnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response1 }
     *     
     */
    public MarginCallResponseV05 setRspnDtls(Response1 value) {
        this.rspnDtls = value;
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
    public MarginCallResponseV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
