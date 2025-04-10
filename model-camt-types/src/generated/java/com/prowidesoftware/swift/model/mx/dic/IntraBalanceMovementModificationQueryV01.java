
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
 * The IntraBalanceMovementModificationQuery message is sent from an account owner/requestor to a settlement infrastructure to query for the status of intra-balance movement modification instruction(s) based on a set of search criteria or business attributes.
 * The message may also be used to: 
 * - re-send a message sent by the account owner to the account servicer (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovementModificationQueryV01", propOrder = {
    "id",
    "qryDef",
    "splmtryData"
})
public class IntraBalanceMovementModificationQueryV01 {

    @XmlElement(name = "Id")
    protected DocumentIdentification51 id;
    @XmlElement(name = "QryDef", required = true)
    protected IntraBalanceQueryDefinition8 qryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public DocumentIdentification51 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public IntraBalanceMovementModificationQueryV01 setId(DocumentIdentification51 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the qryDef property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceQueryDefinition8 }
     *     
     */
    public IntraBalanceQueryDefinition8 getQryDef() {
        return qryDef;
    }

    /**
     * Sets the value of the qryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceQueryDefinition8 }
     *     
     */
    public IntraBalanceMovementModificationQueryV01 setQryDef(IntraBalanceQueryDefinition8 value) {
        this.qryDef = value;
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
    public IntraBalanceMovementModificationQueryV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
