
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
 * Methodology used for the allocation of the performance fees.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EqualisationMethodologyType2", propOrder = {
    "equlstnMthdlgyTpCd",
    "rltdSbcpt"
})
public class EqualisationMethodologyType2 {

    @XmlElement(name = "EqulstnMthdlgyTpCd", required = true)
    @XmlSchemaType(name = "string")
    protected EqualisationMethodologyType1Code equlstnMthdlgyTpCd;
    @XmlElement(name = "RltdSbcpt")
    protected List<RelatedSubscription1> rltdSbcpt;

    /**
     * Gets the value of the equlstnMthdlgyTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link EqualisationMethodologyType1Code }
     *     
     */
    public EqualisationMethodologyType1Code getEqulstnMthdlgyTpCd() {
        return equlstnMthdlgyTpCd;
    }

    /**
     * Sets the value of the equlstnMthdlgyTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqualisationMethodologyType1Code }
     *     
     */
    public EqualisationMethodologyType2 setEqulstnMthdlgyTpCd(EqualisationMethodologyType1Code value) {
        this.equlstnMthdlgyTpCd = value;
        return this;
    }

    /**
     * Gets the value of the rltdSbcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdSbcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdSbcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedSubscription1 }
     * 
     * 
     */
    public List<RelatedSubscription1> getRltdSbcpt() {
        if (rltdSbcpt == null) {
            rltdSbcpt = new ArrayList<RelatedSubscription1>();
        }
        return this.rltdSbcpt;
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
     * Adds a new item to the rltdSbcpt list.
     * @see #getRltdSbcpt()
     * 
     */
    public EqualisationMethodologyType2 addRltdSbcpt(RelatedSubscription1 rltdSbcpt) {
        getRltdSbcpt().add(rltdSbcpt);
        return this;
    }

}
