
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
 * The CollateralValueQuery message is sent by a system member (such as a directly connected party) to the system transaction administrator to query the current available value of securities for auto collateralisation for one specific or several cash accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueQueryV02", propOrder = {
    "msgHdr",
    "collValQryDef",
    "splmtryData"
})
public class CollateralValueQueryV02 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader3 msgHdr;
    @XmlElement(name = "CollValQryDef")
    protected CollateralValueCriteriaDefinition4Choice collValQryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader3 }
     *     
     */
    public MessageHeader3 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader3 }
     *     
     */
    public CollateralValueQueryV02 setMsgHdr(MessageHeader3 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the collValQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueCriteriaDefinition4Choice }
     *     
     */
    public CollateralValueCriteriaDefinition4Choice getCollValQryDef() {
        return collValQryDef;
    }

    /**
     * Sets the value of the collValQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueCriteriaDefinition4Choice }
     *     
     */
    public CollateralValueQueryV02 setCollValQryDef(CollateralValueCriteriaDefinition4Choice value) {
        this.collValQryDef = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CollateralValueQueryV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
