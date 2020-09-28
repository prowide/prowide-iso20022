
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
 * The ExcessCashMarginInstruction message is sent from the participant to the collateral management system to to manage their Excess Cash position.
 * 
 * The message may be sent to manage immediate cash market margining settlement obligations or for excess cash standing instructions for a nominated market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessCashMarginInstructionV01", propOrder = {
    "reqHdr",
    "xcssCshMrgnSttlmInstr",
    "splmtryData"
})
public class ExcessCashMarginInstructionV01 {

    @XmlElement(name = "ReqHdr", required = true)
    protected ExcessCashInstructionHeader1 reqHdr;
    @XmlElement(name = "XcssCshMrgnSttlmInstr", required = true)
    protected ExcessCashInstruction1 xcssCshMrgnSttlmInstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the reqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessCashInstructionHeader1 }
     *     
     */
    public ExcessCashInstructionHeader1 getReqHdr() {
        return reqHdr;
    }

    /**
     * Sets the value of the reqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessCashInstructionHeader1 }
     *     
     */
    public ExcessCashMarginInstructionV01 setReqHdr(ExcessCashInstructionHeader1 value) {
        this.reqHdr = value;
        return this;
    }

    /**
     * Gets the value of the xcssCshMrgnSttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessCashInstruction1 }
     *     
     */
    public ExcessCashInstruction1 getXcssCshMrgnSttlmInstr() {
        return xcssCshMrgnSttlmInstr;
    }

    /**
     * Sets the value of the xcssCshMrgnSttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessCashInstruction1 }
     *     
     */
    public ExcessCashMarginInstructionV01 setXcssCshMrgnSttlmInstr(ExcessCashInstruction1 value) {
        this.xcssCshMrgnSttlmInstr = value;
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
    public ExcessCashMarginInstructionV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
