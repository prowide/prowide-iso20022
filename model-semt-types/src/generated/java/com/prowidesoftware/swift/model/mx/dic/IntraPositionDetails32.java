
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
 * Details of the intra-position movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails32", propOrder = {
    "sfkpgPlc",
    "balFr",
    "intraPosMvmnt"
})
public class IntraPositionDetails32 {

    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat10Choice sfkpgPlc;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesBalanceType6Choice balFr;
    @XmlElement(name = "IntraPosMvmnt", required = true)
    protected List<IntraPositionMovementDetails11> intraPosMvmnt;

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat10Choice }
     *     
     */
    public SafekeepingPlaceFormat10Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat10Choice }
     *     
     */
    public IntraPositionDetails32 setSfkpgPlc(SafekeepingPlaceFormat10Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType6Choice }
     *     
     */
    public SecuritiesBalanceType6Choice getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType6Choice }
     *     
     */
    public IntraPositionDetails32 setBalFr(SecuritiesBalanceType6Choice value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the intraPosMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intraPosMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraPosMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraPositionMovementDetails11 }
     * 
     * 
     */
    public List<IntraPositionMovementDetails11> getIntraPosMvmnt() {
        if (intraPosMvmnt == null) {
            intraPosMvmnt = new ArrayList<IntraPositionMovementDetails11>();
        }
        return this.intraPosMvmnt;
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
     * Adds a new item to the intraPosMvmnt list.
     * @see #getIntraPosMvmnt()
     * 
     */
    public IntraPositionDetails32 addIntraPosMvmnt(IntraPositionMovementDetails11 intraPosMvmnt) {
        getIntraPosMvmnt().add(intraPosMvmnt);
        return this;
    }

}
