
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
 * Currency control contract registration details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistration7", propOrder = {
    "ctrctRegnId",
    "rptgPty",
    "regnAgt",
    "ctrctRegnOpng",
    "splmtryData"
})
public class ContractRegistration7 {

    @XmlElement(name = "CtrctRegnId", required = true)
    protected String ctrctRegnId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty6 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 regnAgt;
    @XmlElement(name = "CtrctRegnOpng", required = true)
    protected List<ContractRegistration8> ctrctRegnOpng;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrctRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctRegnId() {
        return ctrctRegnId;
    }

    /**
     * Sets the value of the ctrctRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractRegistration7 setCtrctRegnId(String value) {
        this.ctrctRegnId = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty6 }
     *     
     */
    public TradeParty6 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty6 }
     *     
     */
    public ContractRegistration7 setRptgPty(TradeParty6 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ContractRegistration7 setRegnAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctRegnOpng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctRegnOpng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctRegnOpng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractRegistration8 }
     * 
     * 
     */
    public List<ContractRegistration8> getCtrctRegnOpng() {
        if (ctrctRegnOpng == null) {
            ctrctRegnOpng = new ArrayList<ContractRegistration8>();
        }
        return this.ctrctRegnOpng;
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
     * Adds a new item to the ctrctRegnOpng list.
     * @see #getCtrctRegnOpng()
     * 
     */
    public ContractRegistration7 addCtrctRegnOpng(ContractRegistration8 ctrctRegnOpng) {
        getCtrctRegnOpng().add(ctrctRegnOpng);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ContractRegistration7 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
