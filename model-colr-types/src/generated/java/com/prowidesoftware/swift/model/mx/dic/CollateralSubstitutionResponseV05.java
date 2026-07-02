
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
 * Scope
 * The CollateralSubstitutionResponse message is sent by either the collateral taker or its collateral manager to the collateral giver or its collateral manager. This is a response to the CollateralSubstitutionRequest message and the collateral proposed in the substitution request can be accepted or rejected. If the collateral proposed is rejected then a new CollateralSubstitutionRequest should be sent. Note: There are cases where the collateral giver will send this message when the collateral taker has initiated the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * This is a response to the CollateralSubstitutionRequest message and the collateral proposed in the substitution request can be accepted or rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionResponseV05", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "sbstitnRspn",
    "splmtryData"
})
public class CollateralSubstitutionResponseV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation9 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "SbstitnRspn", required = true)
    protected SubstitutionResponse2 sbstitnRspn;
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
    public CollateralSubstitutionResponseV05 setTxId(String value) {
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
    public CollateralSubstitutionResponseV05 setOblgtn(Obligation9 value) {
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
    public CollateralSubstitutionResponseV05 setAgrmt(Agreement4 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the sbstitnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionResponse2 }
     *     
     */
    public SubstitutionResponse2 getSbstitnRspn() {
        return sbstitnRspn;
    }

    /**
     * Sets the value of the sbstitnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionResponse2 }
     *     
     */
    public CollateralSubstitutionResponseV05 setSbstitnRspn(SubstitutionResponse2 value) {
        this.sbstitnRspn = value;
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
    public CollateralSubstitutionResponseV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
