
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
 * Scope
 * The ClearingPositionsSettlementInstruction message is formed by external payment systems, and sent to the central payment system. The message contains batch booking of clearing transactions, credits and debits, from external payment systems.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPositionsSettlementInstructionV01", propOrder = {
    "grpHdr",
    "clrRegrHdr",
    "cbrfClrInstrDtls",
    "splmtryData"
})
public class ClearingPositionsSettlementInstructionV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader50 grpHdr;
    @XmlElement(name = "ClrRegrHdr", required = true)
    protected ClearingRegisterHeaderDetails1 clrRegrHdr;
    @XmlElement(name = "CBRFClrInstrDtls", required = true)
    protected ClearingInstructions1 cbrfClrInstrDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader50 }
     *     
     */
    public GroupHeader50 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader50 }
     *     
     */
    public ClearingPositionsSettlementInstructionV01 setGrpHdr(GroupHeader50 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the clrRegrHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingRegisterHeaderDetails1 }
     *     
     */
    public ClearingRegisterHeaderDetails1 getClrRegrHdr() {
        return clrRegrHdr;
    }

    /**
     * Sets the value of the clrRegrHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingRegisterHeaderDetails1 }
     *     
     */
    public ClearingPositionsSettlementInstructionV01 setClrRegrHdr(ClearingRegisterHeaderDetails1 value) {
        this.clrRegrHdr = value;
        return this;
    }

    /**
     * Gets the value of the cbrfClrInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingInstructions1 }
     *     
     */
    public ClearingInstructions1 getCBRFClrInstrDtls() {
        return cbrfClrInstrDtls;
    }

    /**
     * Sets the value of the cbrfClrInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingInstructions1 }
     *     
     */
    public ClearingPositionsSettlementInstructionV01 setCBRFClrInstrDtls(ClearingInstructions1 value) {
        this.cbrfClrInstrDtls = value;
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
    public ClearingPositionsSettlementInstructionV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
