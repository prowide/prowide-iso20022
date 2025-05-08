
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
 * Data to qualify for incentive or other related programmes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialProgrammeQualification2", propOrder = {
    "prgrmm",
    "dtl"
})
public class SpecialProgrammeQualification2 {

    @XmlElement(name = "Prgrmm")
    protected String prgrmm;
    @XmlElement(name = "Dtl")
    protected List<SpecialProgrammeDetails2> dtl;

    /**
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SpecialProgrammeQualification2 setPrgrmm(String value) {
        this.prgrmm = value;
        return this;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeDetails2 }
     * 
     * 
     * @return
     *     The value of the dtl property.
     */
    public List<SpecialProgrammeDetails2> getDtl() {
        if (dtl == null) {
            dtl = new ArrayList<>();
        }
        return this.dtl;
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
     * Adds a new item to the dtl list.
     * @see #getDtl()
     * 
     */
    public SpecialProgrammeQualification2 addDtl(SpecialProgrammeDetails2 dtl) {
        getDtl().add(dtl);
        return this;
    }

}
