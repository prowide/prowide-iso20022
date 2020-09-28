
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
 * Set of elements providing information specific to the individual direct debit(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIToFIDirectDebitTransactionInformationDetails1", propOrder = {
    "grpHdr",
    "cdtInstr",
    "splmtryData"
})
public class FIToFIDirectDebitTransactionInformationDetails1 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader63 grpHdr;
    @XmlElement(name = "CdtInstr", required = true)
    protected List<CreditTransferTransaction9> cdtInstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader63 }
     *     
     */
    public GroupHeader63 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader63 }
     *     
     */
    public FIToFIDirectDebitTransactionInformationDetails1 setGrpHdr(GroupHeader63 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the cdtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransaction9 }
     * 
     * 
     */
    public List<CreditTransferTransaction9> getCdtInstr() {
        if (cdtInstr == null) {
            cdtInstr = new ArrayList<CreditTransferTransaction9>();
        }
        return this.cdtInstr;
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
     * Adds a new item to the cdtInstr list.
     * @see #getCdtInstr()
     * 
     */
    public FIToFIDirectDebitTransactionInformationDetails1 addCdtInstr(CreditTransferTransaction9 cdtInstr) {
        getCdtInstr().add(cdtInstr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FIToFIDirectDebitTransactionInformationDetails1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
