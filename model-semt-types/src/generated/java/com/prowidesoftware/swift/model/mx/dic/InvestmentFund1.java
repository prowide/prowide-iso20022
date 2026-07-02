
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Details about the investment fund class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFund1", propOrder = {
    "finInstrmId",
    "clssTp",
    "ttlUnitsOutsdng",
    "txnlUnits",
    "ttlVal",
    "pric",
    "splmtryData"
})
public class InvestmentFund1 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "TtlUnitsOutsdng")
    protected BigDecimal ttlUnitsOutsdng;
    @XmlElement(name = "TxnlUnits")
    protected BigDecimal txnlUnits;
    @XmlElement(name = "TtlVal")
    protected AmountAndDirection30 ttlVal;
    @XmlElement(name = "Pric")
    protected List<PriceInformation10> pric;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public InvestmentFund1 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFund1 setClssTp(String value) {
        this.clssTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlUnitsOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlUnitsOutsdng() {
        return ttlUnitsOutsdng;
    }

    /**
     * Sets the value of the ttlUnitsOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentFund1 setTtlUnitsOutsdng(BigDecimal value) {
        this.ttlUnitsOutsdng = value;
        return this;
    }

    /**
     * Gets the value of the txnlUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxnlUnits() {
        return txnlUnits;
    }

    /**
     * Sets the value of the txnlUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentFund1 setTxnlUnits(BigDecimal value) {
        this.txnlUnits = value;
        return this;
    }

    /**
     * Gets the value of the ttlVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getTtlVal() {
        return ttlVal;
    }

    /**
     * Sets the value of the ttlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public InvestmentFund1 setTtlVal(AmountAndDirection30 value) {
        this.ttlVal = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInformation10 }
     * 
     * 
     */
    public List<PriceInformation10> getPric() {
        if (pric == null) {
            pric = new ArrayList<PriceInformation10>();
        }
        return this.pric;
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
     * Adds a new item to the pric list.
     * @see #getPric()
     * 
     */
    public InvestmentFund1 addPric(PriceInformation10 pric) {
        getPric().add(pric);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InvestmentFund1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
