
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
 * Identification of a security or other asset.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument101", propOrder = {
    "lineId",
    "instrm",
    "clntRef",
    "ctrPtyRef",
    "trfeeAcct",
    "trfr",
    "sttlmPtiesDtls",
    "asstsHeldInOwnNm",
    "trfRsltsInChngOfBnfclOwnr",
    "addtlInf"
})
public class FinancialInstrument101 {

    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "Instrm", required = true)
    protected FinancialInstrument61Choice instrm;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "TrfeeAcct")
    protected Account28 trfeeAcct;
    @XmlElement(name = "Trfr")
    protected Account28 trfr;
    @XmlElement(name = "SttlmPtiesDtls")
    protected FundSettlementParameters18 sttlmPtiesDtls;
    @XmlElement(name = "AsstsHeldInOwnNm")
    protected Boolean asstsHeldInOwnNm;
    @XmlElement(name = "TrfRsltsInChngOfBnfclOwnr")
    protected Boolean trfRsltsInChngOfBnfclOwnr;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument101 setLineId(String value) {
        this.lineId = value;
        return this;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument61Choice }
     *     
     */
    public FinancialInstrument61Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument61Choice }
     *     
     */
    public FinancialInstrument101 setInstrm(FinancialInstrument61Choice value) {
        this.instrm = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FinancialInstrument101 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FinancialInstrument101 setCtrPtyRef(AdditionalReference10 value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public FinancialInstrument101 setTrfeeAcct(Account28 value) {
        this.trfeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfr property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfr() {
        return trfr;
    }

    /**
     * Sets the value of the trfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public FinancialInstrument101 setTrfr(Account28 value) {
        this.trfr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters18 }
     *     
     */
    public FundSettlementParameters18 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters18 }
     *     
     */
    public FinancialInstrument101 setSttlmPtiesDtls(FundSettlementParameters18 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the asstsHeldInOwnNm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsstsHeldInOwnNm() {
        return asstsHeldInOwnNm;
    }

    /**
     * Sets the value of the asstsHeldInOwnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument101 setAsstsHeldInOwnNm(Boolean value) {
        this.asstsHeldInOwnNm = value;
        return this;
    }

    /**
     * Gets the value of the trfRsltsInChngOfBnfclOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfRsltsInChngOfBnfclOwnr() {
        return trfRsltsInChngOfBnfclOwnr;
    }

    /**
     * Sets the value of the trfRsltsInChngOfBnfclOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument101 setTrfRsltsInChngOfBnfclOwnr(Boolean value) {
        this.trfRsltsInChngOfBnfclOwnr = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public FinancialInstrument101 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
