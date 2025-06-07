
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a related settlement instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSettlementInstruction2", propOrder = {
    "rltdSttlmInstrId",
    "rltdSttlmQty",
    "trfOfPrcdsTpInd",
    "prcdsQtyBrkdwn"
})
public class RelatedSettlementInstruction2 {

    @XmlElement(name = "RltdSttlmInstrId", required = true)
    protected String rltdSttlmInstrId;
    @XmlElement(name = "RltdSttlmQty")
    protected FinancialInstrumentQuantity18Choice rltdSttlmQty;
    @XmlElement(name = "TrfOfPrcdsTpInd")
    @XmlSchemaType(name = "string")
    protected TransferOfProceedsType1Code trfOfPrcdsTpInd;
    @XmlElement(name = "PrcdsQtyBrkdwn")
    protected ProceedsQuantityBreakdown1 prcdsQtyBrkdwn;

    /**
     * Gets the value of the rltdSttlmInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdSttlmInstrId() {
        return rltdSttlmInstrId;
    }

    /**
     * Sets the value of the rltdSttlmInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedSettlementInstruction2 setRltdSttlmInstrId(String value) {
        this.rltdSttlmInstrId = value;
        return this;
    }

    /**
     * Gets the value of the rltdSttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getRltdSttlmQty() {
        return rltdSttlmQty;
    }

    /**
     * Sets the value of the rltdSttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public RelatedSettlementInstruction2 setRltdSttlmQty(FinancialInstrumentQuantity18Choice value) {
        this.rltdSttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the trfOfPrcdsTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOfProceedsType1Code }
     *     
     */
    public TransferOfProceedsType1Code getTrfOfPrcdsTpInd() {
        return trfOfPrcdsTpInd;
    }

    /**
     * Sets the value of the trfOfPrcdsTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOfProceedsType1Code }
     *     
     */
    public RelatedSettlementInstruction2 setTrfOfPrcdsTpInd(TransferOfProceedsType1Code value) {
        this.trfOfPrcdsTpInd = value;
        return this;
    }

    /**
     * Gets the value of the prcdsQtyBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link ProceedsQuantityBreakdown1 }
     *     
     */
    public ProceedsQuantityBreakdown1 getPrcdsQtyBrkdwn() {
        return prcdsQtyBrkdwn;
    }

    /**
     * Sets the value of the prcdsQtyBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProceedsQuantityBreakdown1 }
     *     
     */
    public RelatedSettlementInstruction2 setPrcdsQtyBrkdwn(ProceedsQuantityBreakdown1 value) {
        this.prcdsQtyBrkdwn = value;
        return this;
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

}
