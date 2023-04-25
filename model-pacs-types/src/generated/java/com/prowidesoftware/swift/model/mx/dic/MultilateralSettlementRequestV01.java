
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The MultilateralSettlementRequest message is sent from an instructing agent to a market infrastructure to settle obligations between their participants using accounts held in a settlement service.
 * 
 * Usage: The MultilateralSettlementRequest message can contain one or more settlement instructions with multiple movements between accounts. By default, all movements present in an individual instruction shall be processed as a batch entry rather than a single entry per individual movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilateralSettlementRequestV01", propOrder = {
    "grpHdr",
    "sttlmReq",
    "splmtryData"
})
public class MultilateralSettlementRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader104 grpHdr;
    @XmlElement(name = "SttlmReq", required = true)
    protected List<MultilateralSettlementRequest2> sttlmReq;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader104 }
     *     
     */
    public GroupHeader104 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader104 }
     *     
     */
    public MultilateralSettlementRequestV01 setGrpHdr(GroupHeader104 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilateralSettlementRequest2 }
     * 
     * 
     * @return
     *     The value of the sttlmReq property.
     */
    public List<MultilateralSettlementRequest2> getSttlmReq() {
        if (sttlmReq == null) {
            sttlmReq = new ArrayList<>();
        }
        return this.sttlmReq;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public MultilateralSettlementRequestV01 setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
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

    /**
     * Adds a new item to the sttlmReq list.
     * @see #getSttlmReq()
     * 
     */
    public MultilateralSettlementRequestV01 addSttlmReq(MultilateralSettlementRequest2 sttlmReq) {
        getSttlmReq().add(sttlmReq);
        return this;
    }

}
