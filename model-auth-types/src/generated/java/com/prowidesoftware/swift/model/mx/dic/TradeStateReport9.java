
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
 * Provides details for a trade state report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStateReport9", propOrder = {
    "techRcrdId",
    "ctrPtyData",
    "lnData",
    "collData",
    "rcncltnFlg",
    "ctrctMod",
    "splmtryData"
})
public class TradeStateReport9 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "CtrPtyData", required = true)
    protected CounterpartyData76 ctrPtyData;
    @XmlElement(name = "LnData")
    protected TransactionLoanData20Choice lnData;
    @XmlElement(name = "CollData")
    protected TransactionCollateralData15Choice collData;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag1 rcncltnFlg;
    @XmlElement(name = "CtrctMod", required = true)
    protected ContractModification2 ctrctMod;
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
    public TradeStateReport9 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData76 }
     *     
     */
    public CounterpartyData76 getCtrPtyData() {
        return ctrPtyData;
    }

    /**
     * Sets the value of the ctrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData76 }
     *     
     */
    public TradeStateReport9 setCtrPtyData(CounterpartyData76 value) {
        this.ctrPtyData = value;
        return this;
    }

    /**
     * Gets the value of the lnData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLoanData20Choice }
     *     
     */
    public TransactionLoanData20Choice getLnData() {
        return lnData;
    }

    /**
     * Sets the value of the lnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLoanData20Choice }
     *     
     */
    public TradeStateReport9 setLnData(TransactionLoanData20Choice value) {
        this.lnData = value;
        return this;
    }

    /**
     * Gets the value of the collData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCollateralData15Choice }
     *     
     */
    public TransactionCollateralData15Choice getCollData() {
        return collData;
    }

    /**
     * Sets the value of the collData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCollateralData15Choice }
     *     
     */
    public TradeStateReport9 setCollData(TransactionCollateralData15Choice value) {
        this.collData = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag1 }
     *     
     */
    public ReconciliationFlag1 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag1 }
     *     
     */
    public TradeStateReport9 setRcncltnFlg(ReconciliationFlag1 value) {
        this.rcncltnFlg = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification2 }
     *     
     */
    public ContractModification2 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification2 }
     *     
     */
    public TradeStateReport9 setCtrctMod(ContractModification2 value) {
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
    public TradeStateReport9 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
