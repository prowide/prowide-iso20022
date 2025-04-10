
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "PositionSetAggregated4", propOrder = {
    "refDt",
    "posSet",
    "ccyPosSet",
    "collPosSet",
    "ccyCollPosSet"
})
public class PositionSetAggregated4 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "PosSet")
    protected List<PositionSet21> posSet;
    @XmlElement(name = "CcyPosSet")
    protected List<PositionSet21> ccyPosSet;
    @XmlElement(name = "CollPosSet")
    protected List<PositionSet22> collPosSet;
    @XmlElement(name = "CcyCollPosSet")
    protected List<PositionSet22> ccyCollPosSet;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public PositionSetAggregated4 setRefDt(XMLGregorianCalendar value) {
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
     * {@link PositionSet21 }
     * 
     * 
     */
    public List<PositionSet21> getPosSet() {
        if (posSet == null) {
            posSet = new ArrayList<PositionSet21>();
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
     * {@link PositionSet21 }
     * 
     * 
     */
    public List<PositionSet21> getCcyPosSet() {
        if (ccyPosSet == null) {
            ccyPosSet = new ArrayList<PositionSet21>();
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
     * {@link PositionSet22 }
     * 
     * 
     */
    public List<PositionSet22> getCollPosSet() {
        if (collPosSet == null) {
            collPosSet = new ArrayList<PositionSet22>();
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
     * {@link PositionSet22 }
     * 
     * 
     */
    public List<PositionSet22> getCcyCollPosSet() {
        if (ccyCollPosSet == null) {
            ccyCollPosSet = new ArrayList<PositionSet22>();
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
    public PositionSetAggregated4 addPosSet(PositionSet21 posSet) {
        getPosSet().add(posSet);
        return this;
    }

    /**
     * Adds a new item to the ccyPosSet list.
     * @see #getCcyPosSet()
     * 
     */
    public PositionSetAggregated4 addCcyPosSet(PositionSet21 ccyPosSet) {
        getCcyPosSet().add(ccyPosSet);
        return this;
    }

    /**
     * Adds a new item to the collPosSet list.
     * @see #getCollPosSet()
     * 
     */
    public PositionSetAggregated4 addCollPosSet(PositionSet22 collPosSet) {
        getCollPosSet().add(collPosSet);
        return this;
    }

    /**
     * Adds a new item to the ccyCollPosSet list.
     * @see #getCcyCollPosSet()
     * 
     */
    public PositionSetAggregated4 addCcyCollPosSet(PositionSet22 ccyCollPosSet) {
        getCcyCollPosSet().add(ccyCollPosSet);
        return this;
    }

}
