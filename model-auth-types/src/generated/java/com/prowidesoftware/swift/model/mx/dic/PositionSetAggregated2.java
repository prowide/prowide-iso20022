
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of position sets calculated to represent the exposures between a pair of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetAggregated2", propOrder = {
    "refDt",
    "posSet",
    "ccyPosSet",
    "collPosSet",
    "ccyCollPosSet"
})
public class PositionSetAggregated2 {

    @XmlElement(name = "RefDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "PosSet")
    protected List<PositionSet3> posSet;
    @XmlElement(name = "CcyPosSet")
    protected List<PositionSet3> ccyPosSet;
    @XmlElement(name = "CollPosSet")
    protected List<PositionSet4> collPosSet;
    @XmlElement(name = "CcyCollPosSet")
    protected List<PositionSet4> ccyCollPosSet;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PositionSetAggregated2 setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the posSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet3 }
     * 
     * 
     */
    public List<PositionSet3> getPosSet() {
        if (posSet == null) {
            posSet = new ArrayList<PositionSet3>();
        }
        return this.posSet;
    }

    /**
     * Gets the value of the ccyPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet3 }
     * 
     * 
     */
    public List<PositionSet3> getCcyPosSet() {
        if (ccyPosSet == null) {
            ccyPosSet = new ArrayList<PositionSet3>();
        }
        return this.ccyPosSet;
    }

    /**
     * Gets the value of the collPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet4 }
     * 
     * 
     */
    public List<PositionSet4> getCollPosSet() {
        if (collPosSet == null) {
            collPosSet = new ArrayList<PositionSet4>();
        }
        return this.collPosSet;
    }

    /**
     * Gets the value of the ccyCollPosSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyCollPosSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyCollPosSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet4 }
     * 
     * 
     */
    public List<PositionSet4> getCcyCollPosSet() {
        if (ccyCollPosSet == null) {
            ccyCollPosSet = new ArrayList<PositionSet4>();
        }
        return this.ccyCollPosSet;
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
     * Adds a new item to the posSet list.
     * @see #getPosSet()
     * 
     */
    public PositionSetAggregated2 addPosSet(PositionSet3 posSet) {
        getPosSet().add(posSet);
        return this;
    }

    /**
     * Adds a new item to the ccyPosSet list.
     * @see #getCcyPosSet()
     * 
     */
    public PositionSetAggregated2 addCcyPosSet(PositionSet3 ccyPosSet) {
        getCcyPosSet().add(ccyPosSet);
        return this;
    }

    /**
     * Adds a new item to the collPosSet list.
     * @see #getCollPosSet()
     * 
     */
    public PositionSetAggregated2 addCollPosSet(PositionSet4 collPosSet) {
        getCollPosSet().add(collPosSet);
        return this;
    }

    /**
     * Adds a new item to the ccyCollPosSet list.
     * @see #getCcyCollPosSet()
     * 
     */
    public PositionSetAggregated2 addCcyCollPosSet(PositionSet4 ccyCollPosSet) {
        getCcyCollPosSet().add(ccyCollPosSet);
        return this;
    }

}
