
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
 * Identifies the creditor enrolment to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorActivationCancellation3", propOrder = {
    "orgnlBizInstr",
    "cxlRsn",
    "orgnlActvtn",
    "splmtryData"
})
public class DebtorActivationCancellation3 {

    @XmlElement(name = "OrgnlBizInstr")
    protected OriginalBusinessInstruction1 orgnlBizInstr;
    @XmlElement(name = "CxlRsn")
    protected DebtorActivationCancellationReason3 cxlRsn;
    @XmlElement(name = "OrgnlActvtn", required = true)
    protected OriginalActivation3Choice orgnlActvtn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlBizInstr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction1 }
     *     
     */
    public OriginalBusinessInstruction1 getOrgnlBizInstr() {
        return orgnlBizInstr;
    }

    /**
     * Sets the value of the orgnlBizInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction1 }
     *     
     */
    public DebtorActivationCancellation3 setOrgnlBizInstr(OriginalBusinessInstruction1 value) {
        this.orgnlBizInstr = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivationCancellationReason3 }
     *     
     */
    public DebtorActivationCancellationReason3 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivationCancellationReason3 }
     *     
     */
    public DebtorActivationCancellation3 setCxlRsn(DebtorActivationCancellationReason3 value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlActvtn property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalActivation3Choice }
     *     
     */
    public OriginalActivation3Choice getOrgnlActvtn() {
        return orgnlActvtn;
    }

    /**
     * Sets the value of the orgnlActvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalActivation3Choice }
     *     
     */
    public DebtorActivationCancellation3 setOrgnlActvtn(OriginalActivation3Choice value) {
        this.orgnlActvtn = value;
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
    public DebtorActivationCancellation3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
