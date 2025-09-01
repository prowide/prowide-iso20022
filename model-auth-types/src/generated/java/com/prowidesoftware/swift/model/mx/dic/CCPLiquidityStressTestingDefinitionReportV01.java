
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
 * The CCPLiquidityStressTestingDefinitionReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about how the central counterparty defines liquidity stress scenarios used to stress the liquidity resources and requirements of the CCP.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPLiquidityStressTestingDefinitionReportV01", propOrder = {
    "lqdtyStrssScnroDef",
    "splmtryData"
})
public class CCPLiquidityStressTestingDefinitionReportV01 {

    @XmlElement(name = "LqdtyStrssScnroDef", required = true)
    protected List<LiquidityStressScenarioDefinition1> lqdtyStrssScnroDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the lqdtyStrssScnroDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lqdtyStrssScnroDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLqdtyStrssScnroDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidityStressScenarioDefinition1 }
     * 
     * 
     */
    public List<LiquidityStressScenarioDefinition1> getLqdtyStrssScnroDef() {
        if (lqdtyStrssScnroDef == null) {
            lqdtyStrssScnroDef = new ArrayList<LiquidityStressScenarioDefinition1>();
        }
        return this.lqdtyStrssScnroDef;
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
     * Adds a new item to the lqdtyStrssScnroDef list.
     * @see #getLqdtyStrssScnroDef()
     * 
     */
    public CCPLiquidityStressTestingDefinitionReportV01 addLqdtyStrssScnroDef(LiquidityStressScenarioDefinition1 lqdtyStrssScnroDef) {
        getLqdtyStrssScnroDef().add(lqdtyStrssScnroDef);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPLiquidityStressTestingDefinitionReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
