
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
 * The MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager
 * This message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * When sent by the collateral taker the MarginCallRequest message is used to:
 * - request new collateral at the initiation of an exposure
 * - request additional collateral
 * When sent by the collateral giver the MarginCallRequest message is used to:
 * - request the return of collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallRequestV03", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "mrgnDtlsDueToA",
    "mrgnDtlsDueToB",
    "rqrmntDtlsDueToA",
    "rqrmntDtlsDueToB",
    "mrgnCallRslt",
    "xpctdCollDueToB",
    "xpctdCollDueToA",
    "splmtryData"
})
public class MarginCallRequestV03 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation3 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement2 agrmt;
    @XmlElement(name = "MrgnDtlsDueToA")
    protected MarginCall1 mrgnDtlsDueToA;
    @XmlElement(name = "MrgnDtlsDueToB")
    protected MarginCall1 mrgnDtlsDueToB;
    @XmlElement(name = "RqrmntDtlsDueToA")
    protected MarginRequirement1Choice rqrmntDtlsDueToA;
    @XmlElement(name = "RqrmntDtlsDueToB")
    protected MarginRequirement1Choice rqrmntDtlsDueToB;
    @XmlElement(name = "MrgnCallRslt", required = true)
    protected MarginCallResult3 mrgnCallRslt;
    @XmlElement(name = "XpctdCollDueToB")
    protected ExpectedCollateral1Choice xpctdCollDueToB;
    @XmlElement(name = "XpctdCollDueToA")
    protected ExpectedCollateral1Choice xpctdCollDueToA;
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
    public MarginCallRequestV03 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation3 }
     *     
     */
    public Obligation3 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation3 }
     *     
     */
    public MarginCallRequestV03 setOblgtn(Obligation3 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement2 }
     *     
     */
    public Agreement2 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement2 }
     *     
     */
    public MarginCallRequestV03 setAgrmt(Agreement2 value) {
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
    public MarginCallRequestV03 setMrgnDtlsDueToA(MarginCall1 value) {
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
    public MarginCallRequestV03 setMrgnDtlsDueToB(MarginCall1 value) {
        this.mrgnDtlsDueToB = value;
        return this;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToA() {
        return rqrmntDtlsDueToA;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginCallRequestV03 setRqrmntDtlsDueToA(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToA = value;
        return this;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToB() {
        return rqrmntDtlsDueToB;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginCallRequestV03 setRqrmntDtlsDueToB(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToB = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult3 }
     *     
     */
    public MarginCallResult3 getMrgnCallRslt() {
        return mrgnCallRslt;
    }

    /**
     * Sets the value of the mrgnCallRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult3 }
     *     
     */
    public MarginCallRequestV03 setMrgnCallRslt(MarginCallResult3 value) {
        this.mrgnCallRslt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdCollDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral1Choice }
     *     
     */
    public ExpectedCollateral1Choice getXpctdCollDueToB() {
        return xpctdCollDueToB;
    }

    /**
     * Sets the value of the xpctdCollDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral1Choice }
     *     
     */
    public MarginCallRequestV03 setXpctdCollDueToB(ExpectedCollateral1Choice value) {
        this.xpctdCollDueToB = value;
        return this;
    }

    /**
     * Gets the value of the xpctdCollDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral1Choice }
     *     
     */
    public ExpectedCollateral1Choice getXpctdCollDueToA() {
        return xpctdCollDueToA;
    }

    /**
     * Sets the value of the xpctdCollDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral1Choice }
     *     
     */
    public MarginCallRequestV03 setXpctdCollDueToA(ExpectedCollateral1Choice value) {
        this.xpctdCollDueToA = value;
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
    public MarginCallRequestV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
