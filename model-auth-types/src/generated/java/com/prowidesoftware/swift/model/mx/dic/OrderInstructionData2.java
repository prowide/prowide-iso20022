
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Order Instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInstructionData2", propOrder = {
    "buySellInd",
    "ordrVldtySts",
    "ordrSts",
    "initlQty",
    "rmngQty",
    "dispdQty",
    "minAccptblQty",
    "minExctbl",
    "pssvOnlyInd",
    "slfExctnPrvntn",
    "rtgStrtgy"
})
public class OrderInstructionData2 {

    @XmlElement(name = "BuySellInd")
    @XmlSchemaType(name = "string")
    protected Side6Code buySellInd;
    @XmlElement(name = "OrdrVldtySts")
    @XmlSchemaType(name = "string")
    protected OrderStatus10Code ordrVldtySts;
    @XmlElement(name = "OrdrSts")
    @XmlSchemaType(name = "string")
    protected List<OrderStatus11Code> ordrSts;
    @XmlElement(name = "InitlQty")
    protected FinancialInstrumentQuantity25Choice initlQty;
    @XmlElement(name = "RmngQty")
    protected FinancialInstrumentQuantity25Choice rmngQty;
    @XmlElement(name = "DispdQty")
    protected FinancialInstrumentQuantity25Choice dispdQty;
    @XmlElement(name = "MinAccptblQty")
    protected FinancialInstrumentQuantity25Choice minAccptblQty;
    @XmlElement(name = "MinExctbl")
    protected MinimumExecutable1 minExctbl;
    @XmlElement(name = "PssvOnlyInd")
    protected Boolean pssvOnlyInd;
    @XmlElement(name = "SlfExctnPrvntn")
    protected Boolean slfExctnPrvntn;
    @XmlElement(name = "RtgStrtgy")
    protected String rtgStrtgy;

    /**
     * Gets the value of the buySellInd property.
     * 
     * @return
     *     possible object is
     *     {@link Side6Code }
     *     
     */
    public Side6Code getBuySellInd() {
        return buySellInd;
    }

    /**
     * Sets the value of the buySellInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side6Code }
     *     
     */
    public OrderInstructionData2 setBuySellInd(Side6Code value) {
        this.buySellInd = value;
        return this;
    }

    /**
     * Gets the value of the ordrVldtySts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus10Code }
     *     
     */
    public OrderStatus10Code getOrdrVldtySts() {
        return ordrVldtySts;
    }

    /**
     * Sets the value of the ordrVldtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus10Code }
     *     
     */
    public OrderInstructionData2 setOrdrVldtySts(OrderStatus10Code value) {
        this.ordrVldtySts = value;
        return this;
    }

    /**
     * Gets the value of the ordrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatus11Code }
     * 
     * 
     */
    public List<OrderStatus11Code> getOrdrSts() {
        if (ordrSts == null) {
            ordrSts = new ArrayList<OrderStatus11Code>();
        }
        return this.ordrSts;
    }

    /**
     * Gets the value of the initlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getInitlQty() {
        return initlQty;
    }

    /**
     * Sets the value of the initlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public OrderInstructionData2 setInitlQty(FinancialInstrumentQuantity25Choice value) {
        this.initlQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getRmngQty() {
        return rmngQty;
    }

    /**
     * Sets the value of the rmngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public OrderInstructionData2 setRmngQty(FinancialInstrumentQuantity25Choice value) {
        this.rmngQty = value;
        return this;
    }

    /**
     * Gets the value of the dispdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getDispdQty() {
        return dispdQty;
    }

    /**
     * Sets the value of the dispdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public OrderInstructionData2 setDispdQty(FinancialInstrumentQuantity25Choice value) {
        this.dispdQty = value;
        return this;
    }

    /**
     * Gets the value of the minAccptblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getMinAccptblQty() {
        return minAccptblQty;
    }

    /**
     * Sets the value of the minAccptblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public OrderInstructionData2 setMinAccptblQty(FinancialInstrumentQuantity25Choice value) {
        this.minAccptblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExctbl property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumExecutable1 }
     *     
     */
    public MinimumExecutable1 getMinExctbl() {
        return minExctbl;
    }

    /**
     * Sets the value of the minExctbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumExecutable1 }
     *     
     */
    public OrderInstructionData2 setMinExctbl(MinimumExecutable1 value) {
        this.minExctbl = value;
        return this;
    }

    /**
     * Gets the value of the pssvOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssvOnlyInd() {
        return pssvOnlyInd;
    }

    /**
     * Sets the value of the pssvOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrderInstructionData2 setPssvOnlyInd(Boolean value) {
        this.pssvOnlyInd = value;
        return this;
    }

    /**
     * Gets the value of the slfExctnPrvntn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlfExctnPrvntn() {
        return slfExctnPrvntn;
    }

    /**
     * Sets the value of the slfExctnPrvntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrderInstructionData2 setSlfExctnPrvntn(Boolean value) {
        this.slfExctnPrvntn = value;
        return this;
    }

    /**
     * Gets the value of the rtgStrtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgStrtgy() {
        return rtgStrtgy;
    }

    /**
     * Sets the value of the rtgStrtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderInstructionData2 setRtgStrtgy(String value) {
        this.rtgStrtgy = value;
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
     * Adds a new item to the ordrSts list.
     * @see #getOrdrSts()
     * 
     */
    public OrderInstructionData2 addOrdrSts(OrderStatus11Code ordrSts) {
        getOrdrSts().add(ordrSts);
        return this;
    }

}
