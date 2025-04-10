
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
 * Environment of the diagnostic exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment29", propOrder = {
    "acqrr",
    "acqrrAvlbtyReqd",
    "mrchntId",
    "poiId",
    "poiCmpnt"
})
public class CardPaymentEnvironment29 {

    @XmlElement(name = "Acqrr", required = true)
    protected Acquirer2 acqrr;
    @XmlElement(name = "AcqrrAvlbtyReqd")
    protected Boolean acqrrAvlbtyReqd;
    @XmlElement(name = "MrchntId")
    protected GenericIdentification32 mrchntId;
    @XmlElement(name = "POIId")
    protected GenericIdentification32 poiId;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent4> poiCmpnt;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer2 }
     *     
     */
    public Acquirer2 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer2 }
     *     
     */
    public CardPaymentEnvironment29 setAcqrr(Acquirer2 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the acqrrAvlbtyReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcqrrAvlbtyReqd() {
        return acqrrAvlbtyReqd;
    }

    /**
     * Sets the value of the acqrrAvlbtyReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentEnvironment29 setAcqrrAvlbtyReqd(Boolean value) {
        this.acqrrAvlbtyReqd = value;
        return this;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment29 setMrchntId(GenericIdentification32 value) {
        this.mrchntId = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment29 setPOIId(GenericIdentification32 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent4 }
     * 
     * 
     * @return
     *     The value of the poiCmpnt property.
     */
    public List<PointOfInteractionComponent4> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<>();
        }
        return this.poiCmpnt;
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
     * Adds a new item to the pOICmpnt list.
     * @see #getPOICmpnt()
     * 
     */
    public CardPaymentEnvironment29 addPOICmpnt(PointOfInteractionComponent4 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

}
