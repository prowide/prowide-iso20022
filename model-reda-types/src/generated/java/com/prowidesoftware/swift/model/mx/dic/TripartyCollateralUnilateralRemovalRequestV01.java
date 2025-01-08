
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope:
 * A collateral giver/taker sends a TripartyCollateralFinancialInstrumentRemovalRequest to the Triparty Agent to remove a financial instrument from the collateral pool.
 * 
 * The status of this request is provided with the reda.028 , the CollateralDataStatusAdvice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralUnilateralRemovalRequestV01", propOrder = {
    "pgntn",
    "rmvlReqId",
    "ptyA",
    "clntPtyA",
    "collSd",
    "reqDtls",
    "splmtryData"
})
public class TripartyCollateralUnilateralRemovalRequestV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RmvlReqId", required = true)
    protected String rmvlReqId;
    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification232 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentification232 clntPtyA;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ReqDtls", required = true)
    protected RequestDetails28 reqDtls;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rmvlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmvlReqId() {
        return rmvlReqId;
    }

    /**
     * Sets the value of the rmvlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setRmvlReqId(String value) {
        this.rmvlReqId = value;
        return this;
    }

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setPtyA(PartyIdentification232 value) {
        this.ptyA = value;
        return this;
    }

    /**
     * Gets the value of the clntPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyA() {
        return clntPtyA;
    }

    /**
     * Sets the value of the clntPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setClntPtyA(PartyIdentification232 value) {
        this.clntPtyA = value;
        return this;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setCollSd(CollateralRole1Code value) {
        this.collSd = value;
        return this;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetails28 }
     *     
     */
    public RequestDetails28 getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetails28 }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setReqDtls(RequestDetails28 value) {
        this.reqDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public TripartyCollateralUnilateralRemovalRequestV01 setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
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
