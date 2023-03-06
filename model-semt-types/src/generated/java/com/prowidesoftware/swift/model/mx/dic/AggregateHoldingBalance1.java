
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Overall holding position, in a single financial instrument, held in a securities account at a specified place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateHoldingBalance1", propOrder = {
    "finInstrmId",
    "hldgForm",
    "hldgPhysTp",
    "balForFinInstrm",
    "splmtryData"
})
public class AggregateHoldingBalance1 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "HldgForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code hldgForm;
    @XmlElement(name = "HldgPhysTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code hldgPhysTp;
    @XmlElement(name = "BalForFinInstrm", required = true)
    protected List<FinancialInstrumentAggregateBalance1> balForFinInstrm;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public AggregateHoldingBalance1 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the hldgForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getHldgForm() {
        return hldgForm;
    }

    /**
     * Sets the value of the hldgForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public AggregateHoldingBalance1 setHldgForm(FormOfSecurity1Code value) {
        this.hldgForm = value;
        return this;
    }

    /**
     * Gets the value of the hldgPhysTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public PhysicalTransferType1Code getHldgPhysTp() {
        return hldgPhysTp;
    }

    /**
     * Sets the value of the hldgPhysTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public AggregateHoldingBalance1 setHldgPhysTp(PhysicalTransferType1Code value) {
        this.hldgPhysTp = value;
        return this;
    }

    /**
     * Gets the value of the balForFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balForFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAggregateBalance1 }
     * 
     * 
     */
    public List<FinancialInstrumentAggregateBalance1> getBalForFinInstrm() {
        if (balForFinInstrm == null) {
            balForFinInstrm = new ArrayList<FinancialInstrumentAggregateBalance1>();
        }
        return this.balForFinInstrm;
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
     * Adds a new item to the balForFinInstrm list.
     * @see #getBalForFinInstrm()
     * 
     */
    public AggregateHoldingBalance1 addBalForFinInstrm(FinancialInstrumentAggregateBalance1 balForFinInstrm) {
        getBalForFinInstrm().add(balForFinInstrm);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AggregateHoldingBalance1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
