
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
 * Report data for the low volatility net asset value money market fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowVolatilityNetAssetValueReportData1", propOrder = {
    "amtsdCostMtdPricDvtnEvt",
    "cstNetAsstValDvtnEvt",
    "mtrgAsstThrshldEvt"
})
public class LowVolatilityNetAssetValueReportData1 {

    @XmlElement(name = "AmtsdCostMtdPricDvtnEvt")
    protected List<AmortisedCostMethodPriceDeviationEvent1> amtsdCostMtdPricDvtnEvt;
    @XmlElement(name = "CstNetAsstValDvtnEvt")
    protected List<ConstantNetAssetValueDeviationEvent1> cstNetAsstValDvtnEvt;
    @XmlElement(name = "MtrgAsstThrshldEvt")
    protected List<MaturingAssetThresholdEvent1> mtrgAsstThrshldEvt;

    /**
     * Gets the value of the amtsdCostMtdPricDvtnEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtsdCostMtdPricDvtnEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtsdCostMtdPricDvtnEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmortisedCostMethodPriceDeviationEvent1 }
     * 
     * 
     */
    public List<AmortisedCostMethodPriceDeviationEvent1> getAmtsdCostMtdPricDvtnEvt() {
        if (amtsdCostMtdPricDvtnEvt == null) {
            amtsdCostMtdPricDvtnEvt = new ArrayList<AmortisedCostMethodPriceDeviationEvent1>();
        }
        return this.amtsdCostMtdPricDvtnEvt;
    }

    /**
     * Gets the value of the cstNetAsstValDvtnEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstNetAsstValDvtnEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstNetAsstValDvtnEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstantNetAssetValueDeviationEvent1 }
     * 
     * 
     */
    public List<ConstantNetAssetValueDeviationEvent1> getCstNetAsstValDvtnEvt() {
        if (cstNetAsstValDvtnEvt == null) {
            cstNetAsstValDvtnEvt = new ArrayList<ConstantNetAssetValueDeviationEvent1>();
        }
        return this.cstNetAsstValDvtnEvt;
    }

    /**
     * Gets the value of the mtrgAsstThrshldEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtrgAsstThrshldEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtrgAsstThrshldEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaturingAssetThresholdEvent1 }
     * 
     * 
     */
    public List<MaturingAssetThresholdEvent1> getMtrgAsstThrshldEvt() {
        if (mtrgAsstThrshldEvt == null) {
            mtrgAsstThrshldEvt = new ArrayList<MaturingAssetThresholdEvent1>();
        }
        return this.mtrgAsstThrshldEvt;
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
     * Adds a new item to the amtsdCostMtdPricDvtnEvt list.
     * @see #getAmtsdCostMtdPricDvtnEvt()
     * 
     */
    public LowVolatilityNetAssetValueReportData1 addAmtsdCostMtdPricDvtnEvt(AmortisedCostMethodPriceDeviationEvent1 amtsdCostMtdPricDvtnEvt) {
        getAmtsdCostMtdPricDvtnEvt().add(amtsdCostMtdPricDvtnEvt);
        return this;
    }

    /**
     * Adds a new item to the cstNetAsstValDvtnEvt list.
     * @see #getCstNetAsstValDvtnEvt()
     * 
     */
    public LowVolatilityNetAssetValueReportData1 addCstNetAsstValDvtnEvt(ConstantNetAssetValueDeviationEvent1 cstNetAsstValDvtnEvt) {
        getCstNetAsstValDvtnEvt().add(cstNetAsstValDvtnEvt);
        return this;
    }

    /**
     * Adds a new item to the mtrgAsstThrshldEvt list.
     * @see #getMtrgAsstThrshldEvt()
     * 
     */
    public LowVolatilityNetAssetValueReportData1 addMtrgAsstThrshldEvt(MaturingAssetThresholdEvent1 mtrgAsstThrshldEvt) {
        getMtrgAsstThrshldEvt().add(mtrgAsstThrshldEvt);
        return this;
    }

}
