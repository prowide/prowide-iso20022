
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
 * Sub-class of non-equity instruments sharing common characteristics according to criteria defined as per local regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEquitySubClass1", propOrder = {
    "desc",
    "sgmttnCrit"
})
public class NonEquitySubClass1 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "SgmttnCrit", required = true)
    protected List<NonEquitySubClassSegmentationCriterion1> sgmttnCrit;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonEquitySubClass1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the sgmttnCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sgmttnCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgmttnCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonEquitySubClassSegmentationCriterion1 }
     * 
     * 
     */
    public List<NonEquitySubClassSegmentationCriterion1> getSgmttnCrit() {
        if (sgmttnCrit == null) {
            sgmttnCrit = new ArrayList<NonEquitySubClassSegmentationCriterion1>();
        }
        return this.sgmttnCrit;
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
     * Adds a new item to the sgmttnCrit list.
     * @see #getSgmttnCrit()
     * 
     */
    public NonEquitySubClass1 addSgmttnCrit(NonEquitySubClassSegmentationCriterion1 sgmttnCrit) {
        getSgmttnCrit().add(sgmttnCrit);
        return this;
    }

}
