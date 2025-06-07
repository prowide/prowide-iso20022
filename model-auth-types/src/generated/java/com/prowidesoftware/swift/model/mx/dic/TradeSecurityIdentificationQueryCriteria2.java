
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
 * Specifies the query criteria related to securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSecurityIdentificationQueryCriteria2", propOrder = {
    "oprtr",
    "id",
    "undrlygInstrmId"
})
public class TradeSecurityIdentificationQueryCriteria2 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "Id")
    protected List<SecurityIdentificationQueryCriteria1> id;
    @XmlElement(name = "UndrlygInstrmId")
    protected List<SecurityIdentificationQuery3Choice> undrlygInstrmId;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public TradeSecurityIdentificationQueryCriteria2 setOprtr(Operation3Code value) {
        this.oprtr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentificationQueryCriteria1 }
     * 
     * 
     */
    public List<SecurityIdentificationQueryCriteria1> getId() {
        if (id == null) {
            id = new ArrayList<SecurityIdentificationQueryCriteria1>();
        }
        return this.id;
    }

    /**
     * Gets the value of the undrlygInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentificationQuery3Choice }
     * 
     * 
     */
    public List<SecurityIdentificationQuery3Choice> getUndrlygInstrmId() {
        if (undrlygInstrmId == null) {
            undrlygInstrmId = new ArrayList<SecurityIdentificationQuery3Choice>();
        }
        return this.undrlygInstrmId;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria2 addId(SecurityIdentificationQueryCriteria1 id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the undrlygInstrmId list.
     * @see #getUndrlygInstrmId()
     * 
     */
    public TradeSecurityIdentificationQueryCriteria2 addUndrlygInstrmId(SecurityIdentificationQuery3Choice undrlygInstrmId) {
        getUndrlygInstrmId().add(undrlygInstrmId);
        return this;
    }

}
