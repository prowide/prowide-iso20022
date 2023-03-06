
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
 * Provides details for a trade state report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStateReport16", propOrder = {
    "techRcrdId",
    "ctrPtySpcfcData",
    "lnData",
    "collData",
    "rcncltnFlg",
    "ctrctMod",
    "splmtryData"
})
public class TradeStateReport16 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "CtrPtySpcfcData", required = true)
    protected CounterpartyData88 ctrPtySpcfcData;
    @XmlElement(name = "LnData")
    protected TransactionLoanData31Choice lnData;
    @XmlElement(name = "CollData")
    protected TransactionCollateralData18Choice collData;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag2 rcncltnFlg;
    @XmlElement(name = "CtrctMod", required = true)
    protected ContractModification3 ctrctMod;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeStateReport16 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData88 }
     *     
     */
    public CounterpartyData88 getCtrPtySpcfcData() {
        return ctrPtySpcfcData;
    }

    /**
     * Sets the value of the ctrPtySpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData88 }
     *     
     */
    public TradeStateReport16 setCtrPtySpcfcData(CounterpartyData88 value) {
        this.ctrPtySpcfcData = value;
        return this;
    }

    /**
     * Gets the value of the lnData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLoanData31Choice }
     *     
     */
    public TransactionLoanData31Choice getLnData() {
        return lnData;
    }

    /**
     * Sets the value of the lnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLoanData31Choice }
     *     
     */
    public TradeStateReport16 setLnData(TransactionLoanData31Choice value) {
        this.lnData = value;
        return this;
    }

    /**
     * Gets the value of the collData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCollateralData18Choice }
     *     
     */
    public TransactionCollateralData18Choice getCollData() {
        return collData;
    }

    /**
     * Sets the value of the collData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCollateralData18Choice }
     *     
     */
    public TradeStateReport16 setCollData(TransactionCollateralData18Choice value) {
        this.collData = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public ReconciliationFlag2 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public TradeStateReport16 setRcncltnFlg(ReconciliationFlag2 value) {
        this.rcncltnFlg = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification3 }
     *     
     */
    public ContractModification3 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification3 }
     *     
     */
    public TradeStateReport16 setCtrctMod(ContractModification3 value) {
        this.ctrctMod = value;
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
    public TradeStateReport16 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
